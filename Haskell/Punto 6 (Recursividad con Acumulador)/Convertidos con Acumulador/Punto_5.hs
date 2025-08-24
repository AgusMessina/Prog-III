module Punto_5 where

comparar :: [a] -> [a] -> Int                                                                               --Def de "comparar"

comparar lista1 lista2 = fAux 0 0 lista1 lista2 where                             
                                                                                                            --Caso Base / Las listas estan vacias                  
    fAux acum1 acum2 [] []      | acum1 > acum2 = 1                                                         --Si el acum1 (Lista1) es mayor a acum2 (Lista2) se devuelve 1
                                | acum2 > acum1 = 2                                                         --Si el acum1 (Lista1) es menor a acum2 (Lista2) se devuelve 2
                                | otherwise = 0                                                             --Si el acum1 (Lista1) es igual a acum2 (Lista2) se devuelve 0
                                
    fAux acum1 acum2 (elemento1:lista1) [] = fAux (acum1 + 1) acum2 lista1 []                               --Si Lista1 no es vacia y Lista2 es, entonces se le suma uno al acum1
    fAux acum1 acum2 [] (elemento2:lista2) = fAux acum1 (acum2 + 1) [] lista2                               --Si Lista2 no es vacia y Lista1 es, entonces se le suma uno al acum2
    fAux acum1 acum2 (elemento1:lista1) (elemento2:lista2) = fAux (acum1 + 1) (acum2 + 1) lista1 lista2     --Si Lista1 no es vacia y Lista2 no es vacia, entonces se le suma uno al acum1 y acum2

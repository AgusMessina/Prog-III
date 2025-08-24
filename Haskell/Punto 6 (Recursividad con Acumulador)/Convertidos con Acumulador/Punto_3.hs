module Punto_3 where

encontrar elemento lista = fAux False elemento lista where
    fAux :: Eq a => Bool -> a -> [a] -> Bool 
    fAux acum _ [] = acum
    fAux acum elemento (x:xs)   | elemento == x = fAux True elemento xs 
                                | otherwise = fAux acum elemento xs 

module Punto_5 where
    
comparar :: [a] -> [a] -> Int
comparar lista1 lista2 | length lista1 > length lista2 = 1
                       | length lista1 < length lista2 = 2
                       | otherwise  = 0

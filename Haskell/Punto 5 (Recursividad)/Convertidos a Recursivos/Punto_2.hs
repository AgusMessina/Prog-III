module Punto_2 where

contarE :: (Eq a) => a -> [a] -> Int
contarE _ [] = 0
contarE elemento (primerElemento:lista) 
    | elemento == primerElemento = 1 + contarE elemento lista
    | otherwise = contarE elemento lista

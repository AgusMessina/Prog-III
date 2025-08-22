module Punto_5 where

comparar :: [a] -> [a] -> Int
comparar [] [] = 0
comparar _ [] = 1
comparar [] _ = 2
comparar (_:lista1) (_:lista2) = comparar lista1 lista2
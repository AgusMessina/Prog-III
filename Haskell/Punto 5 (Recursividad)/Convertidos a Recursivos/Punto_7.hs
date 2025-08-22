module Punto_7 where

sumasSucesivas :: [Int] -> Int
sumasSucesivas [a,0] = 0
sumasSucesivas [a,b] = a + sumasSucesivas[a,b-1]
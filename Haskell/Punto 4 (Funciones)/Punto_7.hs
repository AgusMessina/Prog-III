module Punto_7 where

sumasSucesivas :: [Int] -> Int
sumasSucesivas [a,b] = sum(replicate b a)
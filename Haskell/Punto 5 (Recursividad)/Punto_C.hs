module Punto_C where

numerosPares :: Int -> [Int]
numerosPares 0 = []
numerosPares n = numerosPares(n-1) ++ [2*n]
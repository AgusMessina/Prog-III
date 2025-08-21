module Punto_D where

multiplos :: Int -> Int -> [Int]
multiplos x 0 = []
multiplos x n = multiplos x (n-1) ++ [x*n]
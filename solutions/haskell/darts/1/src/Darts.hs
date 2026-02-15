module Darts (score) where

score :: Float -> Float -> Int
score x y   | distancia <= 1 = 10
            | distancia <= 5 = 5
            | distancia <= 10 = 1
            | otherwise = 0
          where
            distancia = sqrt(x^2 + y^2)
module Punto_6 where

atomos :: [Float] -> Float

atomos lista = fAux lista 1 where
    fAux [] acum    | acum == 1 = 0
                    | otherwise = acum
    fAux (x:xs) acum = fAux xs (acum*x)

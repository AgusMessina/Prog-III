module Punto_8 where

vuelta :: [a] -> [a]

vuelta lista = fAux lista [] where
    fAux [] acum = acum
    fAux (x:xs) acum = fAux xs (x:acum)
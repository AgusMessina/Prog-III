module Punto_4 where

duplicar :: [a] -> [a]

duplicar lista = fAux lista [] where
    fAux [] acum = acum
    fAux (x:xs) acum = fAux xs (x:x:acum)

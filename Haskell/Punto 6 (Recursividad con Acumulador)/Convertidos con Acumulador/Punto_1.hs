module Punto_1 where

contarAcum lista = faux acum lista where
    faux acum [] = 0

    faux acum (x:xs) = faux (acum + 1) xs

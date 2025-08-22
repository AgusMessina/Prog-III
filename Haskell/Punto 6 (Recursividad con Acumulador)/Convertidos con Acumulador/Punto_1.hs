module Punto_1 where

contarAcum lista = faux 0 lista where
    faux acum [] = acum
    faux acum (x:xs) = faux (acum + 1) xs
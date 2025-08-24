module Punto_7 where

sumaSucesiva :: [Int] -> Int

sumaSucesiva [a,b] = fAux a b 0 where
    fAux _ 0 acum = acum
    fAux x y acum = fAux x (y - 1) (acum + x)

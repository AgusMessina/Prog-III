module Punto_8 where

vuelta :: [a] -> [a]
vuelta [] = []
vuelta (valor:lista) = vuelta lista ++ [valor]
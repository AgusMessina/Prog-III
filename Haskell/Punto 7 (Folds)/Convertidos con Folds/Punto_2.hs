module Punto_2 where

contarElemento :: Eq a => [a] -> a -> Int
contarElemento lista elemento = foldl(\acc x -> if x == elemento then acc + 1 else acc) 0 lista
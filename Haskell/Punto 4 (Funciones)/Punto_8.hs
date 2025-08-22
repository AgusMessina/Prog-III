module Punto_8 where

vuelta :: [a] -> [a]
vuelta = foldl(\acc x -> x:acc) []

module Punto_9 where

reverso :: [[a]] -> [[a]]
reverso lista = foldl(\acc x -> reverse x:acc) [] lista

module Punto_9 where

reverso :: [[a]] -> [[a]]
reverso lista = foldl(\acc xz -> reverse x:acc) [] lista

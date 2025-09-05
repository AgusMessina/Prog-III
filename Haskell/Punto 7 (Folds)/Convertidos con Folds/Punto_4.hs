module Punto_4 where

duplicar :: [a] -> [a]
duplicar lista = foldr (\x acc -> (x:x:acc)) [] lista
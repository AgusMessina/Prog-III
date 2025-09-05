module Punto_3 where

encontrar :: Eq a => [a] -> a -> Bool
encontrar lista elemento = foldr (\x acc -> if x == elemento then True else acc) False lista
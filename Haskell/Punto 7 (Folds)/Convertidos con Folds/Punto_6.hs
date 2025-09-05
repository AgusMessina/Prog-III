module Punto_6 where

atomos :: [Float] -> Float
atomos lista = foldr (\x acc -> x * acc) 1 lista 
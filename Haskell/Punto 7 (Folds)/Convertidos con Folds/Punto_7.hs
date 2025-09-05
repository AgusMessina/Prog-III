module Punto_7 where

sumaSucesiva :: [Int] -> Int
sumaSucesiva [a,b] = foldl(\acc _ -> acc + a) 0 [1..b]
--sumaSucesiva2 [a,b] = foldl (+) 0 (take a(repeat b))

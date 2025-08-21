module Punto_3 where
chequear :: Eq a => a -> [a] -> Bool
chequear elemento lista = elem elemento lista
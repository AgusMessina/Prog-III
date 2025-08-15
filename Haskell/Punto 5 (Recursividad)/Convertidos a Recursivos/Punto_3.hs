module Punto_3 where

chequear :: Eq a => a -> [a] -> Bool
chequear _ [] = False                       -- Caso Base: Si la lista esta vacia, el elemento no esta y se devuelve un False
chequear elemento (cursor:lista)    -- Caso recursivo
    | (elemento == cursor) = True     -- Si el elemento es igual al cursor de la lista, este devuelve True, terminando la recurisividad
    | (elemento /= cursor) = chequear elemento lista   -- Si no se cumple, seguimos recorriendo la lista

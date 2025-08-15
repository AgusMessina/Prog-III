module Punto_2 where

contarE :: (Eq a) => a -> [a] -> Int                    -- Tipo de la función: recibe un elemento y una lista, retorna un Int
contarE _ [] = 0                                        -- Caso base: si la lista está vacía, retorna 0
contarE elemento (cursor:lista)                         -- Caso recursivo: compara el elemento con el cursor
    | (elemento == cursor) = 1 + contarE elemento lista  -- Si son iguales, suma 1 y sigue con el resto de la lista
    | (elemento /= cursor) = contarE elemento lista      -- Si no son iguales, sigue con el resto de la lista sin sumar
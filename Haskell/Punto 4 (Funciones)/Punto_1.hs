module Punto_1 where
contar :: [a] -> Int               --Entrada: [Lista] / Salida: int
contar lista  = foldr(\_ acc -> 1 + acc) 0 lista        -- Recorremos la lista de Der. a Izq., haciendo acc++ por cada elemento de la lista


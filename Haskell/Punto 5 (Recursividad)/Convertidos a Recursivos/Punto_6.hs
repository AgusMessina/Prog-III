module Punto_6 where

atomos :: [Float] -> Float              -- Entrada [Float] / Salida: Float
atomos [] = 0.0                         -- Caso base: Si la lista esta vacia devuelve 0
atomos [x] = x                          -- Caso base = 1: Cuando queda un elemento en la lista, este devuelve ese mismo pero fuera de esta lista ([5.0] = 5.0)
atomos (x:lista) = x * atomos lista     -- Recursion: Sacamos el primer elemento de la lista, y a este lo multiplicamos por el retorno de retorno de la funcion atomos (Recursion)
module Punto_4 where

duplicar :: [a] -> [a]                  -- Entrada: [Lista] / Salida: [Lista]
duplicar [] = []                        -- Caso Base: Si la lista esta vacia, esta devuelve la lista vacia (Nada)
duplicar lista = lista ++ lista       -- Recursividad: Este concatena nuestra lista consigo misma, ya que el operador (++) Es recursivo por definicion
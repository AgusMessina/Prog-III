module Punto_2 where

buscarE elemento lista = faux 0 elemento lista where
    faux acum _ [] = acum
    faux acum elemento (x:xs)   | elemento == x = faux (acum + 1) elemento xs
	                            | otherwise = faux acum elemento xs
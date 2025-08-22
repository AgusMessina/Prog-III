module Punto_3 where

encontrar elemento lista = fAux 0 elemento lista where
    fAux :: Eq a => a -> a -> [a] -> Bool 
    fAux acum _ [] = False
    fAux _(_:_) = True
    fAux acum elemento (x:xs)   | elemento == x = fAux (acum + 1) elemento xs 
	                            | otherwise = fAux acum elemento xs 
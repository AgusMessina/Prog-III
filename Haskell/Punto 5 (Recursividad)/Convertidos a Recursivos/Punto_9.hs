module Punto_9 where

devolver :: [[a]] -> [[a]]
devolver [] = []
devolver (listaInterior:listaExterior) = reverse listaInterior : devolver listaExterior
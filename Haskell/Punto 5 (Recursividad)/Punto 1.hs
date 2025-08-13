:{
contar :: [a] -> Int
contar [] = 0       -- Caso base: Si la lista esta vacia, devuelve 0
contar (_:return) = 1 + contar return  -- Caso Recursivo: Vamos ignorando el primer elemento de la lista sucesivamente hasta llegar a una lista vacia, para despues empezar a sumarle uno por uno hasta terminar la ejecucion escalada
:}

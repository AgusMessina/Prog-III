%suma_lista(+L, ?X)
suma_lista([],0).                                        %Caso base, la lista vacia devuelve que la suma es 0
suma_lista([C|R],X):- suma_lista(R,ACUM), X is C + ACUM.     %Caso Recursivo(Parecido a Haskell), Sumamos la cabeza de la lista en un acumulador, igualandolo a X (Salida), para despues "Mover" la lista y hacer la suma otra vez

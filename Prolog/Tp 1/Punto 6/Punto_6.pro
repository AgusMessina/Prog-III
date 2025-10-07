%pertenece(?X,?L)
pertenece(X,[X|_]).						%Caso base: Si el elemento esta en la primera posicion
pertenece(X,[_|L]):- pertenece(X,L).	%Caso recursivo: Empieza a chequear el primer elemento de la lista hasta pegarle, hecho esto se va al caso recursivo

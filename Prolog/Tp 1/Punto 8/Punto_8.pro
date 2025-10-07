%conc(?L1,?L2,?L3).
concatenar([],L3,L3).									%Caso Base: Si L1 es vacia, insertamos L2 en L3.
concatenar([X|L1],L2,[X|L3]) :- concatenar(L1,L2,L3).	%Caso Recursivo: Vamos sacando elemento por elemento de L1 para ir dandoselo a L3, cuando esta sea vacia pasamos al caso base, insertando todo L2 en L3.

%Investigar que hace la inversa (Seguramente sacar la inversa de una lista)
inversa([],[]).
inversa([X|Y],L) :- inversa(Y,R),concatenar(R,[X],L).

%palindromo(+L)
palindromo(L):- inversa(L,L)							%Devuelve *True* si la Lista que se pasa es igual a su inversa

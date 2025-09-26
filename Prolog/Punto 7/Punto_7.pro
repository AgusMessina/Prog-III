%conc(?L1,?L2,?L3).
conc([],L3,L3).								%Caso Base: Si L1 es vacia, insertamos L2 en L3.
conc([X|L1],L2,[X|L3]) :- conc(L1,L2,L3).	%Caso Recursivo: Vamos sacando elemento por elemento de L1 para ir dandoselo a L3, cuando esta sea vacia pasamos al caso base, insertando todo L2 en L3.

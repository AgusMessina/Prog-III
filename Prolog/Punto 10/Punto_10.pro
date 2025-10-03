%cuentaN(+L, +N, ?LR).
cuentaN([],_,0).
%Caso base: Cuando la lista esta vacia (Se recorrio toda la lista). Decimos que nuestro acum es 0)

cuentaN([N|Y], N, LR):- cuentaN(Y, N, ACUM), LR is ACUM + 1.
%Caso recursivo 1: Si el primer elemento de la lista es igual al que estoy buscando, sumamos uno a nuestro contador y vemos si existe otro elemento igual al que busco
%"([N|Y], N)" ES EQUIVALENTE A "([X|Y], N):- X = N." --- CHEQUEAR

cuentaN([X|Y], N, LR):- X \= N, cuentaN(Y, N, LR).
%Caso recursivo 2: Si el p}primer elemento de la lista no es igual al que estoy buscando, seguimos recorriendo

%duplica(?L1, ?L2).
duplica([],[]).
%Caso base: Cuando la primera lista deja de tener elementos, empieza a subir

duplica([X|XS],[X,X|T]):- duplica(XS,T).
%Construye a la lista T pasando dos veces a X

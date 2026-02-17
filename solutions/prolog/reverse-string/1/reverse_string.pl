string_reverse(S, Reversed) :-
    string_chars(S, Aux),
    reverse_aux(Aux, [], Rev),
	string_chars(Reversed, Rev).

reverse_aux([], Acc, Acc).
reverse_aux([X|XS], Acc, Reversed) :-
    reverse_aux(XS, [X|Acc], Reversed).
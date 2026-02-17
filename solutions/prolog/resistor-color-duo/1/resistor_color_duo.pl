color_value(black, 0).
color_value(brown, 1).
color_value(red, 2).
color_value(orange, 3).
color_value(yellow, 4).
color_value(green, 5).
color_value(blue, 6).
color_value(violet, 7).
color_value(grey, 8).
color_value(white, 9).

value([C1, C2 | _], Value) :-
    atom_string(Color1, C1),
    atom_string(Color2, C2),

    color_value(Color1, V1),
    color_value(Color2, V2),
    Value is (V1 * 10) + V2.
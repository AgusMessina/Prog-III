module DNA (toRNA) where

toRNA :: String -> Either Char String
toRNA xs = traverse (\x -> case x of 
        'G' -> Right 'C'
        'C' -> Right 'G'
        'T' -> Right 'A'
        'A' -> Right 'U'
        _ -> Left x) xs
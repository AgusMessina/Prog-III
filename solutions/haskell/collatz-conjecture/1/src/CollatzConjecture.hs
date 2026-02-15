module CollatzConjecture (collatz) where

collatz :: Integer -> Maybe Integer
collatz n 
  | n <= 0 = Nothing
  | otherwise = Just (fAux n 0) where
      fAux 1 acum = acum
      fAux n acum   | even n = fAux(n `div` 2) (acum + 1)
                    | otherwise = fAux (3 * n + 1) (acum + 1) 
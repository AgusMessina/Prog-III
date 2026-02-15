module Bob (responseFor) where
import Data.Char
import Data.List

responseFor :: String -> String
responseFor xs 
    | all isSpace xs == True = "Fine. Be that way!"
    | xs == (map toUpper xs) && (last xs  == '?') && (any isLetter xs == True) = "Calm down, I know what I'm doing!"
    | xs == (map toUpper xs) && (any isLetter xs == True) = "Whoa, chill out!"
    | last (filter(not . isSpace) xs ) == '?' = "Sure." 
    | otherwise = "Whatever."
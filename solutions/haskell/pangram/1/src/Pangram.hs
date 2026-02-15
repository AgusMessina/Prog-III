module Pangram (isPangram) where
import Data.List(nub)
import Data.Char(isLetter, toLower, isAscii)

isPangram :: String -> Bool
isPangram text = 
      let lowerCase = map toLower text
          onlyLetters = filter isLetter lowerCase
          onlyAscii = filter isAscii onlyLetters 
          noDup = nub onlyAscii

      in length noDup == 26

module SumOfMultiples (sumOfMultiples) where
import Data.List (nub)

sumOfMultiples :: [Integer] -> Integer -> Integer
sumOfMultiples factors limit = sum (nub (concatMap(\x -> multiples x limit) factors))

multiples :: Integer -> Integer -> [Integer]
multiples 0 _ = [0]
multiples n limit = [n, n*2 .. limit-1]
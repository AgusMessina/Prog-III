module DNA (nucleotideCounts, Nucleotide(..)) where

import Data.Map (Map)
import qualified Data.Map as M
import Control.Monad (foldM)

data Nucleotide = A | C | G | T deriving (Eq, Ord, Show)

nucleotideCounts :: String -> Either String (Map Nucleotide Int)
nucleotideCounts xs = foldM (\acc x -> case x of 
          'A' -> Right (M.adjust (+1) A acc)
          'C' -> Right (M.adjust (+1) C acc)
          'G' -> Right (M.adjust (+1) G acc)
          'T' -> Right (M.adjust (+1) T acc)
          _ -> Left ("error")) 
        (M.fromList [(A, 0), (C, 0), (G, 0), (T, 0)]) xs
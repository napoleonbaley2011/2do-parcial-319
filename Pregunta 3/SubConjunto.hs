subconjunto :: Eq a => [a] -> [a] -> Bool
subconjunto xs ys = 
  [x | x <- xs, x `elem` ys] == xs
  
 //prueba
 :load subconjunto.hs
subconjunto [1,5,8,7] [1,5,2,8,6,7,4]
"true"

subconjunto [1,4,8] [1,2,4,6]
"false"

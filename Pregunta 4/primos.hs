UNIV.LEONEL ALVARO CHAMACA LIMA

primos :: [Int]
primos = criba [2..] 

criba :: [Int] -> [Int]
criba (p:xs) = p : criba [x | x <- xs, x `mod` p /= 0]

//prueba
:load prueba.scala
take 5 primos
"genera los primeros 5 numeros primos"

takeWhile (<20) primos
"genera todos los primos menores a 20"

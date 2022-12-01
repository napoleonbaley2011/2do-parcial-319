object Main extends App{
    //UNIV. LEONEL ALVARO CHAMACA LIMA
	//PREGUNTA 1
    //FIBONACCI RECURSIVO
    def fiboRecursive(n: Int): Int = {
        if      (n < 2) n
        else    fiboRecursive(n-1) + fiboRecursive(n-2)
    }
    //FIBONACCI ITERATIVO
    def fiboIter(n: Int): Int = {
        var a = -1
        var b = 1
        for (i <- 0 to n){
            var buffer = a
            a = b
            b = buffer + b
            print(b)
        }
            println()
        a
    }

    def main(args:Array[String]):Unit = {
	    //PREGUNTA 1
	    //fIBONACCI RECURSIVO Y ESTRUCTURADO-
	    println(fiboRecursive(7))
	    fiboIter(7)

	    
    }
    
}

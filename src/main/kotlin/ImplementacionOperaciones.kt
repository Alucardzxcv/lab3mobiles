class ImplementacionOperaciones:OperacionesBasicas,OperacionesAvanzadas {
    fun menu(){
        System.out.println("MENU: \n " +
                "1.-Suma \n" +
                " 2.-Resta \n" +
                " 3.-Multiplicacion \n" +
                " 4.-Division \n" +
                " 5.-Potencia \n" +
                " 6.-Raiz \n " +
                "7.-Factorial \n" +
                " 8.-Sumatoria \n" +
                " 9.-Salir     \n")

    }
    fun eleccion(){
        System.out.print("Escoja la operacion a realizar: ")
        var opcion= readLine().toString()

        if (opcion=="1") {
            System.out.println("Usted escogio suma .-" + opcion)

            System.out.print("Eliga el primer valor: ")
            var n1= readLine().toString().toInt()
            System.out.print("Eliga el segundo valor: ")
            var n2= readLine().toString().toInt()
            System.out.println(" $n1 + $n2 ")
            System.out.print("La respuesta es: ${Resta(n1,n2)}")
        }
        else if (opcion=="2") {
            System.out.println("Usted escogio Resta .-" + opcion)

            System.out.print("Eliga el primer valor: ")
            var n1= readLine().toString().toInt()
            System.out.print("Eliga el segundo valor: ")
            var n2= readLine().toString().toInt()
            System.out.println(" $n1 - $n2 ")
            System.out.print("La respuesta es: ${Resta(n1,n2)}")
        }
        else if (opcion=="3") {
            System.out.println("Usted escogio Multiplicacion .-" + opcion)

            System.out.print("Eliga el primer valor: ")
            var n1= readLine().toString().toInt()
            System.out.print("Eliga el segundo valor: ")
            var n2= readLine().toString().toInt()
            System.out.println(" $n1 * $n2 ")
            System.out.print("La respuesta es: ${multiplicacion(n1,n2)}")
        }
        else if (opcion=="4") {
            System.out.println("Usted escogio Division .- " + opcion)
            System.out.print("Eliga el primer valor: ")
            var n1= readLine().toString().toDouble()
            System.out.print("Eliga el segundo valor: ")
            var n2= readLine().toString().toDouble()
            System.out.println(" $n1 / $n2 ")
            System.out.print("La respuesta es: ${division(n1,n2)}")

        }
        else if (opcion=="5") {
            System.out.println("Usted escogio Potencia .-" + opcion)

            System.out.print("Eliga la base: ")
            var n1= readLine().toString().toInt()
            System.out.print("Eliga el exponente: ")
            var n2= readLine().toString().toInt()
            System.out.println(" $n1 ^ $n2 ")
            System.out.print("La respuesta es: ${potencia(n1,n2)}")

        }
        else if (opcion=="6") {
            System.out.println("Usted escogio Raiz .- " + opcion)

            System.out.print("Eliga el radicando: ")
            var n1= readLine().toString().toDouble()
            System.out.print("Eliga la raiz: ")
            var n2= readLine().toString().toDouble()
            System.out.println(" $n1 ^(1/ $n2) ")
            System.out.print("La respuesta es: ${raiz(n1,n2)}")


        }
        else if (opcion=="7") {
            System.out.println("Usted escogio Factorial .- " + opcion)

            System.out.print("Eliga el numero a factorizar: ")
            var n1= readLine().toString().toInt()
            System.out.println(" $n1 !")
            System.out.print("La respuesta es: ${factorial(n1)}")
        }
        else if (opcion=="8") {
            System.out.print("Usted escogio Sumatoria" + opcion)
            System.out.print("Eliga el numero para hallar su sumatoria: ")
            var n1= readLine().toString().toInt()
            System.out.println("Sumatoria de $n1 ")
            System.out.print("La respuesta es: ${sumatoria(n1)}")
        }
        else if (opcion=="9") {
            System.out.println("Usted escogio Salir .-" + opcion)
            System.out.print("BYE" )
        }
        else  {
            System.out.print("ELIGE UN VALOR DEL MENU: \n")
            return eleccion()
        }
    }


    override fun Suma(num1:Int, num2:Int): Int {
        var sum=(num1+num2)
        return sum
    }
    override fun Resta(num1:Int, num2:Int): Int {
        var res=(num1-num2)
        return res
    }
    override fun multiplicacion(num1:Int, num2:Int): Int {
        var mul=(num1*num2)
        return mul
    }
    override fun division(num1:Double, num2:Double): Double {
        var div=(num1/num2)
        return div
    }
    override fun potencia(base:Int,potencia:Int):Int {
        var pot = base
        var i = 2
        while (i <= potencia) {
            pot=pot*base
            i++
        }
        return pot
    }
    override fun raiz(numero: Double , raiz:Double): Double {
        var rz= Math.pow(numero,(1/ raiz))
        return rz
    }
    override fun factorial(numero: Int):Int{
        if (numero >1){
            return numero*factorial(numero-1)
        }else{
            return numero
        }
    }
    override fun sumatoria(numero: Int):Int{
        if (numero>1){
            return numero+sumatoria(numero-1)
        }
        else{
            return numero
        }
    }

}
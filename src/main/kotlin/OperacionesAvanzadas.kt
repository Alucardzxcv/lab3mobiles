import kotlin.math.sqrt

interface OperacionesAvanzadas {
    fun potencia(numero:Int,potencia:Int):Int{
        var pot=0
        var expo=potencia-1
        while (expo != 0) {
           pot = numero*numero
            --expo
        }
        return pot
    }

    fun raiz(numero: Double , raiz:Double): Double {
        var rz= Math.pow(numero, raiz)
        return rz
    }
    fun factorial(numero: Int):Int{
        if (numero >1){
            return numero*factorial(numero-1)
        }else{
            return numero
        }
    }

    fun sumatoria(numero: Int):Int{
        if (numero>1){
            return numero+sumatoria(numero-1)
        }
        else{
            return numero
        }
    }

}
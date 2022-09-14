interface OperacionesBasicas {
    fun Suma(num1:Int, num2:Int): Int {
        var sum=(num1+num2)
        return sum
    }
    fun Resta(num1:Int, num2:Int): Int {
        var res=(num1-num2)
        return res
    }
    fun multiplicacion(num1:Int, num2:Int): Int {
        var mul=(num1*num2)
        return mul
    }
    fun division(num1:Double, num2:Double): Double {
        var div=(num1/num2)
        return div
    }

}
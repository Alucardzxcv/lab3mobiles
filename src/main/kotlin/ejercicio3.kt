fun main(argumentos: Array<String>){
    println("Bienvenido a kotlin")
    val n1=12
    val n2="2.4"
    val n3= n1 + (n2.toDouble())
    val n4='a'
    val n5= n4.toInt()
    val n6= n1.toString() + n3

    println("Variable n3 es ${n3} y es de tipo ${n3::class.simpleName}")
    println("Variable n5 es ${n5} y es de tipo ${n5::class.simpleName}")
    println("Variable n6 es ${n6} y es de tipo ${n6::class.simpleName}")
}
fun main(argumentos: Array<String>){
    println("Bienvenido a kotlin")
    val n1=12
    val n2=12.5
    val n3=13.5f
    val n4="hola"
    val n5= true
    val n6='P'
    println("Variable n1 es tipo ${n1::class.simpleName}")
    println("Variable n2 es tipo ${n2::class.simpleName}")
    println("Variable n3 es tipo ${n3::class.simpleName}")
    println("Variable n4 es tipo ${n4::class.simpleName}")
    println("Variable n5 es tipo ${n5::class.simpleName}")
    println("Variable n6 es tipo ${n6::class.simpleName}")
}
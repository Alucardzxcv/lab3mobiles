fun main(argumentos: Array<String>){
    println("Bienvenido a kotlin")
    var x=3
    when(x){
        1 -> print("x==1")
        in 2..4 -> print("x esta entre 2 y 4")
        else -> print("x es menor que 1 o mayor que 4")
    }
}

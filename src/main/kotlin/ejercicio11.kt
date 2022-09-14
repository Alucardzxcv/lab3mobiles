fun main(argumentos: Array<String>){
    println("Bienvenido a kotlin")
    var n1="kotlin en Android"
    val n2=n1.indexOf('e')
    println("subcadena: ${n1.substring(n2,n2+2)}")
    val n3=n1.replace('o',' ')
    println("recorrido de cadena")
    for (i in n3){
        print(i+" ")
    }
}
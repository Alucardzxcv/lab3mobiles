fun main(argumentos: Array<String>) {
    println("Bienvenido a kotlin")
    var n1 = 1..4
    var n2 = 'a'..'e'
    println("Valores de n1 ->")
    for (i in n1) {
        print(i.toString() + "\t")
    }
    println("\nValores de n2 ->")
    for (i in n2) {
        print(i + "\t")
    }
}
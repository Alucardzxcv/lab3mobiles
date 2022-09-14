fun main(argumentos: Array<String>){
    println("Bienvenido a kotlin")
    var x= arrayListOf("PER",'U')
    print(x)
    for (i in 1..5){
        x.add(i)
    }
    println(x)
    for (i in x.count()-1 downTo 0 step 2){
        print(x.get(i))
    }
}
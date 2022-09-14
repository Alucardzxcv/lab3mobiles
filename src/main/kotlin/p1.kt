import java.util.*
fun main(argumentos: Array<String>){
    println("Bienvenido a kotlin")
    var c2018= arrayListOf("45","40","36")
    var c2019= arrayListOf("43","38","35")
    var c2020= arrayListOf("44","37","30")
    var c2021= arrayListOf("40","34","28")

    var f1= arrayListOf("45","43","44","40")
    var f2= arrayListOf("40","38","37","34")
    var f3= arrayListOf("36","35","30","28")

    for (i in c2018){
        for(x in f2){
            if (i==x){
                print(i)
                }
            }
        }
}


 fun main(argumentos: Array<String>){
     println("Bienvenido a kotlin")
     var n1="kotlin"
     var n2="kotlin"
     var n3="kotlin2"
     val n4 = if (n1==n2){"kotlin2"}else{"kotlin"}
     println(n4)
     if (n3==n4)
         println("son iguales")
     else
         println("son distintos")
 }
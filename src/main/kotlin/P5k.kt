fun main(argumentos: Array<String>){
    val a = "1,K,4,O,2,T,5,6,L,I,8,N"
    val b  = ArrayList<String>()
    var c = ArrayList<String>()
    for (i in a)
        if( i.isUpperCase()){
            b.add("$i")
        }
        else{
            c.add("$i")
        }

    println(b)
    print(c)
}
import org.omg.CORBA.ARG_IN.value

fun main(){
//     val numbers = listOf<String>("one","two","three","five")
//    numbers.forEach(){
//        println(it)
//    }
//    println(" You are here ")
//     val number= listOf<Int>(1,2,3,4,5,6,7,8,9,10)
//     for ( item in number){
//         println(item)
//     }
//    val number1= listOf<String>("sokheng","chhoeurn","Heng","sopheak")
//      val number1literator=number1.iterator()
//    while ( number1literator.hasNext()){
//        println(number1literator.next())
//    }
//    val number2= mutableListOf<String>("one","four","five")
//    val  mutableListIterator =number2.listIterator()
//    mutableListIterator.next()
//    mutableListIterator.add("two")
//    mutableListIterator.next()
//    mutableListIterator.set("three")
//    println(number2)
//    val num1= listOf<String>("Sok","Heng","chhoeurn","Heng")
//    num1.forEach {
//        println(it)
//
//    }
//    val number3= mutableListOf<Int>(1,2,3,4,5,6,7,8)
//    number3.forEach(){
//        println(it)
//    }
//    val iterator = ('a'..'c').iterator()
//
//    for ((index, value) in iterator.withIndex()) {
//        println("The element at $index is $value")
//    }

    val mynumber= listOf<Int>(1,2,3,4,5,20,7,8,10,34,60,80,40)
    val  mysamllnum=mynumber.filter { it>6} //y-> y>6
    for ( num in mysamllnum){
        println(num)
    }
    println(" *********")
   val  mySqusrednum=mynumber.map { it*it}//num->num*num
    for ( e in mySqusrednum){
        println(e )
    }
}


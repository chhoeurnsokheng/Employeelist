import java.util.ArrayList

fun main(args: Array<String>) {
//    val arrayList = ArrayList<String>()
//    arrayList.add("Sokheng")
//    arrayList.add("sok")
//    arrayList.add("for")
//    arrayList.add("when")
//    arrayList.add("Where")
//    arrayList.add("While")
//    arrayList.add("which")
//    arrayList.add("Whenever")
//    arrayList.add("Whichever")
//    arrayList.add("Whatever")
//    arrayList.add("Wherever")
//    arrayList.add("whyever")
//    for (i in arrayList){
//        println(i)}
    val list = arrayListOf<Staff>(
            Staff("sokheng", "Street 271", 1),
            Staff("sokheng", "Street 271", 1),
            Staff("sokheng", "Street 271", 1),
            Staff("sokheng", "Street 271", 1),
            Staff("sokheng", "Street 271", 1),
            Staff("sokheng", "Street 271", 1),
            Staff("sokheng", "Street 271", 1),
            Staff("sokheng", "Street 271", 1),
            Staff("sokheng", "Street 271", 1),
            Staff("sokheng", "Street 271", 1),
            Staff("sokheng", "Street 271", 1),
            Staff("sokheng", "Street 271", 1),
            Staff("sokheng", "Street 271", 1),
            Staff("sokheng", "Street 271", 1),
            Staff("sokheng", "Street 271", 1),
            Staff("sokheng", "Street 271", 1),
            Staff("sokheng", "Street 271", 1),
            Staff("sokheng", "Street 271", 1),
            Staff("sokheng", "Street 271", 1),
            Staff("sokheng", "Street 271", 1),
            Staff("sokheng", "Street 271", 1),
            Staff("sokheng", "Street 271", 1),
            Staff("sokheng", "Street 271", 1),
            Staff("sokheng", "Street 271", 1),
            Staff("sokheng", "Street 271", 1),
            Staff("sokheng", "Street 271", 1),
            Staff("sokheng", "Street 271", 1),
            Staff("sokheng", "Street 271", 1),
            Staff("sokheng", "Street 271", 1),
            Staff("sokheng", "Street 271", 1),
            Staff("sokheng", "Street 271", 1),
            Staff("sokheng", "Street 271", 1)
    )

    for (e in list) {
        println("${e.name},${e.address},${e.id}")
    }

    val firstStaff = list[0]
    val secondStaff = list[1]

    val mapOfStaffs = mapOf<Int, Staff>(
            firstStaff.id to firstStaff,
            secondStaff.id to secondStaff
    )

    val dictionary = mapOf(
            "Hello" to "This is a greeting word when two or more people meet",
            "World" to "This is a word representing the globe"
    )

    println("Def of word(Hello): ${dictionary.get("Hello")}")
}

class Staff(val name: String, val address: String, val id: Int)

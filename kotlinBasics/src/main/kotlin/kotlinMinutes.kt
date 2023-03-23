fun myFunction(name:String){
    println("hello, $name")
}

fun main(){
    //variables
    val firstname = "Kevin" // read only
    var height = 180 //read and write
    val myVariable: Boolean = false // read only

    //operators
    val s1 = "call me"
    val s2 = "maybe"

    val combined = s1 + s2
    println(combined)

    val n1 = 9
    val n2 = 4
    val result = n1 % n2
    println(result)

    //String manipulation(a string is a collection of characters)
    val myString = "kotlin"
    println(myString[0])
    println(myString[1])
    println(myString.isEmpty())
    println(myString.length)
    println(myString.substring(2,4))
    println("The string is $myString")//string interpolation

    //conditions
    val examScore = 88
    if(examScore > 70){
        println("You passed!")
    }else{
        println("You failed :(")
    }

    //collections
    val names = listOf("Ali", "Rey", "Maya", "Chen")//you can add value to this collection cause it's mutable
    println(names[2])

    val name2 = mutableListOf<String>("Ali", "Rey", "Maya", "Chen")
    name2.add("Rambo")

    //for loops
    for (name in name2){
        println(name)
    }

    for(i in 1..5){
        println(i)//print number from 1 to 5
    }
    for(i in 1 until 5){
        println(i)//print number from 1 to 4 but not including 5
    }

    //function call
    myFunction("Gerald")

    //nullability
    val instagramBio: String? = null
    if(instagramBio != null){
        println(instagramBio.toUpperCase())//this will only work if the variable has a value other than null
    }
}
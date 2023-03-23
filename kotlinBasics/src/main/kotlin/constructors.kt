fun main(){
    val linda = Person("linda", 42, true)
    println(linda.description())
    linda.hadBirthday()
    println(linda.description())
}

class Person(private val name: String, private var age: Int, doesSmile: Boolean){
    private val nickname: String//this is going to interact with ehh doesSmile variable

    init {
        //run some code when we create instance of this class
        val smiley = if(doesSmile) ":)" else ":("
        nickname = "$name $smiley"
    }

    fun description(): String{
        return "Name: $nickname, age: $age"
    }

    fun hadBirthday(){
        age += 1
    }
}
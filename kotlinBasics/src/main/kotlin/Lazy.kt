private const val SALARY_THRESHOLD = 100
//the variables below are initialized cause they are constructors with init blocks
private val taxCollector = TaxCollector()
//but if we user lazy the accountant init block is only called in the case where the salary is above the threshold
//in otherwords accountant() is only used if the salary is above the threshold
private val accountant  by lazy {Accountant()}//everything after the "by" keyword is a delegation

fun main(){
    val salaries = listOf(50, 112, 78)
    for (salary in salaries){
        taxCollector.payTaxes(salary)
        if(salary > SALARY_THRESHOLD) accountant.findTaxSavings()
    }
}


class TaxCollector{
    init{
        println("init tax collector")
    }
    fun payTaxes(salary:Int) = println("Paying taxes on salary of ${salary}...")
}

class Accountant{
    init{
        println("init accountant - this is hard work!")
    }
    fun findTaxSavings() = println("\tFound tax savings!")
}
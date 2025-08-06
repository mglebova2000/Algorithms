fun main() {
    val alex = Person("Alex")
    alex.eat("Burger")
    alex.goForAWalk()
    alex.eat()
    val maryana = Person("Maryana",25)
    maryana.getOfferWB()
}

class Person(val name : String,val age : Int = 20){

    private var happiness : Int = 5

    fun eat(eda : String = "Sandwich") {

        when(eda){
            "Sandwich" -> happiness+=5
            "Burger" -> happiness+=4
            else -> happiness++
        }

        if(happiness>10) {
            happiness=10
        }
    }

    fun goForAWalk() {
        happiness+=2
        if(happiness>10) {
            happiness=10
        }
    }

    fun getOfferWB() {
        happiness=10
    }

}
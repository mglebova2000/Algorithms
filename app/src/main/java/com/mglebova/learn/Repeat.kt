fun main() {
    val alex = Personn("Alex", "Glebob")
    val alex2 = Personn("Alex", "Glebob")

    alex.peremennaia

    alex2.setAge(2)

}
class Personn(val name: String = DEFAULT_NAME, val surName: String) {
    lateinit var peremennaia : String

    private var age = DEFAULT_AGE

    fun setAge(value: Int) {


        val day = DAY.MONDAY


        age = value
    }

    companion object {
        private const val DEFAULT_AGE = 10
        private const val DEFAULT_NAME = "fesfse"

    }
}

object Machine {
    val current = DAY.TUESDAY

    fun work() {
        if(current == DAY.WEDNESDAY){
            // no work
        }

    }

}

enum class DAY {
    MONDAY, TUESDAY, WEDNESDAY
}
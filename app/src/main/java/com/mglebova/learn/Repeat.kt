fun main() {
    val alex = Personn("Alex", "Glebob")
    val alex2 = Personn("Alex", "Glebob")

    Machine.width = 200
    Machine.width = 300
    Machine.width = 400


    alex2.setAge(2)

}
class Personn(val name: String, val surName: String) {
    private var age = 10

    fun setAge(value: Int) {

        age = value
    }
}

object Machine {

    var width = 200

    fun cry() {

    }

}
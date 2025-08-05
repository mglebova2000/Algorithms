fun main() {

    val alex = User(name = "Alex", login = "Alex228", password = "qwerty123")
    val maryana = User(name = "Maryana", login = "MaryanaRay228", password = "qwerty321")

    val controller = RegisterController()

    val actual1 = controller.register(alex)
    val expected1 = true
    println("actual1=$actual1 expected1=$expected1")

    val actual2 = controller.register(maryana)
    val expected2 = true
    println("actual2=$actual2 expected2=$expected2")

    val actual3 = controller.register(maryana)
    val expected3 = false
    println("actual3=$actual3 expected3=$expected3")

    val actual4 = controller.verify("Alex228","qwww")
    val expected4 = false
    println("actual4=$actual4 expected4=$expected4")

    val actual5 = controller.verify("Alex228","qwerty123")
    val expected5 = true
    println("actual5=$actual5 expected5=$expected5")
}

class RegisterController{

    private val registeredUsers : MutableList<User> = mutableListOf<User>()

    fun register(user : User) : Boolean{

        if (registeredUsers.contains(user)){
            return false
        } else {
            registeredUsers.add(user)
            return true
        }
    }

    fun verify(login : String, password: String) : Boolean{
        registeredUsers.forEach {
            val loginOfUser = it.login
            val passwordOfUser = it.password
            if(loginOfUser==login && passwordOfUser==password){
                return true
            }
        }
        return false
    }
}

data class User(
    val name : String,
    val login : String,
    val password : String
)
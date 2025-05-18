package vcmsa.ci.methods

class Pet (petName: String, petAge: Int, petSound1: String, petSound2: String) {
    var name: String = ""
    var age: Int = 0
    var sound1: String = ""
    var sound2: String = ""

    val ageS= age.toString()

    init {
        name = petName
        age = petAge
        sound1 = petSound1
        sound2 = petSound2
    }

    fun makeSound() : String {
        return sound1 + sound2
    }

    fun displayInfo(): String {
        return name + ageS
    }
}
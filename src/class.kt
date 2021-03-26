fun main(){
var people=Human("Belyse",20,68)
    people.eat(6)
    println( people.weight)
    people.speak("Hello")
    people.birthday()
     println(people.age++)
    var student=User("Pamela","Umutoni","umupa07@gamil.com","+250788520904","umu0786397732")
    println(student.firstName +" " +student.lastName)
    println(student.phoneNumber)
}
class Human( val name:String, var age:Int, var weight:Int) {
    fun eat(foodWeight: Int): Int {
        println("I am eating $foodWeight  kgs of food")
        weight = weight + foodWeight
        return weight
    }

    fun speak(speech: String) {
        println(speech)
    }

    fun birthday() {
        age++
    }
}
data class User(val firstName: String, val lastName:String, var Email:String, var phoneNumber:String, var password:String)

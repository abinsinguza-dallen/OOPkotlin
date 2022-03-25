fun main(){
    var r =Human("dallen",24,60)
    println(r.eat(5))
    var speech ="i love codding"
    println(speech)
    r.birthday()
    var person=student("Abinsinguza","Dallen","dallena@gmail",781698182,7465)
     println(person.email)
    println(person.firstname)
}
class Human(var name:String,var age:Int,var weight:Int){
    fun eat(foodweight:Int):Int{
        println("i am eating $foodweight kgs of food")
        weight+=foodweight
        return weight
    }

fun speak(speech:String):String{
    println(speech)
    return speech


}
fun birthday(){
age+=1
    println(age)
     }

}
data class student( var firstname:String, var lastname:String, var  email:String, var phonemumber:Int,var password:Int)
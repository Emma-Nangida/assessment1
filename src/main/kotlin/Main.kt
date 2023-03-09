fun main() {
println()
    println(numbers(500,200,30))
    println(identy("Wina","Kenya"))
     addition.sum





}

//1. Write and invoke a function that takes in any 2 strings and returns the first
//character of the longer string or the first character of the first string if they are
//equal in length.
fun names(name1:String,name2: String): String{
    var length="Emma"
    return length
}
//2. Write and invoke one function that takes in an array of integers and returns
//these 3 values: smallest, largest and average of all the elements

fun numbers(num1:Int,num2:Int,num3:Int):Int{
    var numbers=(arrayOf("smallest","largest","average"))
    return numbers.size

}
//Write and call a function that takes in a string and splits it into all the
//characters that constitute it. Your function should print out this output.
fun institute(name: String){
    var name="AkiraChix"
    println(name)


}
//Write and call a function that takes in an array of strings, joins them all into
//one string and returns it.
fun identy(name:String,country:String):String{
    var fact=("my name is $name from $country")
    return fact

}
//5. Create a calculator class that is capable of the following functions:
//(i) Addition of any 2 numbers
//(ii) Subtraction between any 2 numbers
//(iii) Accurate division between any 2 numbers
//(iv) Multiplication of any 2 numbers
//Instantiate your calculator object and invoke all its functions
class Calculater(num1: Int,num2:Int,num3:Int,num4:Int){
    fun addition(num1:Int,num2:Int){
        var sum=num1+num2
        println(sum)

    }
    fun subtraction(num3:Int,num4:Int){
        var sub=num3-num4
        println(sub)
    }
}
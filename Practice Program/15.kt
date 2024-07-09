fun main(){
    print("Enter the X value: ")
    var x = readln().toInt()
    print("Enter the Y value: ")
    var y = readln().toInt()
    var res= (x+y)/(x-y)
    println("Result is: ${res}")
}
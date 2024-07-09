//3X2+2XY+3Y2
fun main(){
    print("Enter the X value: ")
    var x = readln().toInt()
    print("Enter the Y value: ")
    var y = readln().toInt()
    var res= (3*x*2)+(2*x*y)+(3*y*2)
    println("Result is: ${res}")
}
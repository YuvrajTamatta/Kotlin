fun main() {
    print("Enter Your Salary: ")
    var sal= readln().toFloat()
    var bonus = sal*10/100
    println("Your 10% bonus on your salary is: ${bonus}")
    println("Your Total salary is :"+(sal+bonus))
}

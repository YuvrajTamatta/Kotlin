fun main() {
    print("Enter the Amount: ")
    var Amount = readln().toFloat();
    print("Enter the Rate of interest: ")
    var interest = readln().toDouble()
    print("Enter the years: ")
    var year= readln().toInt()

    var result = Amount*Math.pow(1+interest,interest)*year
    print("Compound Interest is : ${result}")
}
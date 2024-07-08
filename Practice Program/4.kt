fun main() {
    print("Enter the Priciple Amount: ")
    var Amount = readln().toFloat()
    print("Enter the percentage: ")
    var interest = readln().toInt()
    print("Enter the year: ")
    var year = readln().toInt()

    var result = (Amount * interest * year) / 100

    print(("Simple Interest is : ${result}"))
}
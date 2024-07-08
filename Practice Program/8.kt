fun main() {
    print("Enter the distance between two city: ")
    var dist = readln().toFloat()
    println("Distance in feet: ${dist*3.28084}")
    println("Distance in Meter : ${dist*100} ")
    println("Distance in Inch : ${dist*2.54}")
    println("Distance in Centimeter : ${dist*1000} ")
}
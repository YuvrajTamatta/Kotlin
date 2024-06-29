fun main() {
    print("Android : ")
    var a : Int = readLine()!!.toInt()
    print("java : ")
    var b : Int = readLine()!!.toInt()
    print("react : ")
    var c : Int = readLine()!!.toInt()
    print("node : ")
    var d : Int = readLine()!!.toInt()

    var total = a+b+c+d
    var per = total/4

    println("Total is : "+total)
    println("Percentage is : "+per+" %")

    if(per > 60){
        print(" Grade is e")
    }
    if(per > 70){
        print(" Grade is c ")
    }
    if(per > 80){
        print(" Grade is b")
    }
    if(per > 90){
        print(" Grade is a ")
    }
    if(per<60){
        print("RA")
    }


}
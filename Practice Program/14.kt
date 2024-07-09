fun main(){
    var a = 50;
    var b = 100;
    println("Values before swap: a = ${a} - b= ${b}")

    a=a+b;
    b=a-b
    a=a-b 
    println("Values after swap: a = ${a} - b= ${b}")

}
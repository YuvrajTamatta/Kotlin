fun main() {

   while (true){
       print("Enter first number: ")
       var num1 = readln().toFloat();

       print("Enter first number: ")
       var num2 = readln().toFloat();

       println("-----Menu-----")
       println("1. Add")
       println("2. Sub")
       println("3. Mul")
       println("4. Div")
       println("5. Exit")

       print("Enter choice number: ")
       var choice: Int= readln().toInt();

       when(choice){
           1->println(num1+num2)
           2->println(num1-num2)
           3->println(num1*num2)
           4->println(num1/num2)
           5->System.exit(0)
           else->{
               print("Enter valid choice.......")
           }
       }
   }
}
package dsa

fun firstFactorial(num: Int): Int {

    // code goes here
    var i = num-1;
    var factorial = num
    while(i in 1..num){
        println(i)
        factorial *= i
        println("factorial => $factorial")
        i--
    }
    return factorial;
}

fun main(args: Array<String>) {
    println(firstFactorial((readlnOrNull() ?:"0").trim().toInt()))
}
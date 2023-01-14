package dsa

/*
 * Complete the 'timeConversion' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts STRING s as parameter.
 */

fun timeConversion(s: String): String {
    // Write your code here
    val arr = s.split(":")
    val isAm = arr.last().contains("am",true)
    if (isAm){
        val hr = arr.first().toInt()
        if (hr==12){
            println("00:${arr[1]}:${arr[2].replace("am","",true)}")
        }else{
            println(s.replace("am","",true))
        }
    }else{
     var hr = arr.first().toInt()
        if (hr==12){
            println(s.replace("pm","",true))
        }else{
            hr += 12
            println("$hr:${arr.get(1)}:${arr.get(2).replace("pm","",true)}")
        }
    }
    return ""
}

fun main(args: Array<String>) {
    val s = readLine()!!
    val result = timeConversion(s)
    println(result)
}
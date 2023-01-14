package dsa

import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

/*
 * Complete the 'miniMaxSum' function below.
 *
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

fun miniMaxSum(arr: Array<UInt>): Unit {
    // Write your code here
    val temp = UIntArray(arr.size)
    arr.forEachIndexed { index, i ->
        temp[index] = arr.sum()-i
    }
    if (arr.isEmpty()){
        println("0 0")
    }else {
        println("${temp.min()} ${temp.max()}")
    }
}

fun main(args: Array<String>) {
    val arr = readLine()!!.trimEnd().split(" ").map{ it.toUInt() }.toTypedArray()
    miniMaxSum(arr)
}

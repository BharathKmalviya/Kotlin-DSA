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
 * Complete the 'matchingStrings' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts following parameters:
 *  1. STRING_ARRAY strings
 *  2. STRING_ARRAY queries
 */

fun matchingStrings(strings: Array<String>, queries: Array<String>): Array<Int> {
    // Write your code here
    val temp = Array<Int>(queries.size) { it*1 }

    queries.forEachIndexed { index, s ->
        var count = 0
        strings.forEach {
            if (it.equals(s,true)){
                count++
            }
        }
        temp[index] = count
    }
    return temp
}

fun main(args: Array<String>) {
    val stringsCount = readLine()!!.trim().toInt()

    val strings = Array<String>(stringsCount, { "" })
    for (i in 0 until stringsCount) {
        val stringsItem = readLine()!!
        strings[i] = stringsItem
    }

    val queriesCount = readLine()!!.trim().toInt()

    val queries = Array<String>(queriesCount, { "" })
    for (i in 0 until queriesCount) {
        val queriesItem = readLine()!!
        queries[i] = queriesItem
    }

    val res = matchingStrings(strings, queries)

    println(res.joinToString("\n"))
}

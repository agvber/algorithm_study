package com.agvber.algorithm_study.code_kata

private fun solution(n: Long): Long {
    var answer: Long = 0
    answer = n.toString()
        .toList()
        .map { it.digitToInt() }
        .sortedDescending()
        .joinToString("")
        .toLong()
    return answer
}

fun main() {
    val result = solution(325643)
    println(result)
}
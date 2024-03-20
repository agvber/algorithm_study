package com.agvber.algorithm_study.code_kata

private fun solution(x: Int): Boolean {
    val sum = x.toString().toList().sumOf { it.digitToInt() }
    return (x % sum) == 0
}

fun main() {
    val result = solution(18)
    println(result)
}
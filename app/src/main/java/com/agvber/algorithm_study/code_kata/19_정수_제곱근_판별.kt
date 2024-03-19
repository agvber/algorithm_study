package com.agvber.algorithm_study.code_kata

import kotlin.math.sqrt

private fun solution(n: Long): Long {
    var answer: Long = 0
    val num = sqrt(n.toDouble())

    if ((n % num) == .0) {
        answer = (num.toLong() + 1) * (num.toLong() + 1)
    } else {
        answer = -1
    }

    return answer
}

fun main() {
    val result = solution(144)
    println(result)
}
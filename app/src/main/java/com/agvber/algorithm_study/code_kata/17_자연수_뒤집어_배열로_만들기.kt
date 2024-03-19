package com.agvber.algorithm_study.code_kata

private class Solution {
    fun solution(n: Long): IntArray {
        var answer = n.toString()
            .toList()
            .map { it.digitToInt() }
            .reversed()
            .toIntArray()
        return answer
    }
}

fun main() {
    val solution = Solution()
    println(solution.solution(144).toList())
}
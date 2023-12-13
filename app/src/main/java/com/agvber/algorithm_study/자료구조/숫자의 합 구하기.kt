package com.agvber.algorithm_study.자료구조

fun main() {
    inputCount()
    val numbers = inputNumberList()
    result(numbers)
}

private fun inputCount() {
    val read = readln()
}

private fun inputNumberList(): List<Char> {
    val read = readln()
    return read.toList()
}

private fun result(chars: List<Char>) {
    val sum = chars.sumOf { it.digitToInt() }
    println(sum)
}
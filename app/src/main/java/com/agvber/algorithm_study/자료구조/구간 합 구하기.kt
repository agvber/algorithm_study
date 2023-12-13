package com.agvber.algorithm_study.자료구조

const val DataCount = "data_count"
const val QueryCount = "query_count"
const val From = "from"
const val To = "to"


private val map = mutableMapOf<String, Int>()
private lateinit var numbers: List<Int>
private val sumList = mutableListOf<Int>()

fun main() {
    inputLineCountAndQueryCount()
    inputNumberList()

    val result = mutableListOf<Int>()

    repeat(map[QueryCount]!!) {
        inputSection()

        val startIndex = map[From]!! - 2
        val lastIndex = map[To]!! - 1

        result.add(sumList[lastIndex] - (sumList.getOrNull(startIndex) ?: 0))
    }
    result.forEach { println(it) }
}

private fun inputLineCountAndQueryCount() {
    val inputList = inputList()

    map[DataCount] = inputList[0].toInt()
    map[QueryCount] = inputList[1].toInt()
}

private fun inputNumberList() {
    var last = 0
    numbers = inputList().map {
        val count = it.toInt()
        last += count
        sumList.add(last)
        count
    }
}

private fun inputSection() {
    val inputList = inputList()

    map[From] = inputList[0].toInt()
    map[To] = inputList[1].toInt()
}

private fun inputList(): List<String> {
    val read = readln()
    return read.split(" ")
}
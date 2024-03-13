package com.agvber.algorithm_study.자료구조

private var n: Int = 0
private var m: Int = 0

private val table: MutableList<MutableList<Int>> = mutableListOf()
private val sumTable: MutableList<MutableList<Int>> = mutableListOf()

fun main() {
    inputSumNumber()
    inputTableNumber()
    calSumTable()
    inputQueries()
}

private fun inputSumNumber() {
    val input = readln()
    input.split(" ")
        .also {
            n = it[0].toInt()
            m = it[1].toInt()
        }
}

private fun inputTableNumber() {
    table.add(mutableListOf())
    for (x in 1..n) {
        val input = readln()
        val splitInput = input.split(" ")
        table.add(splitInput.map { it.toInt() }.toMutableList().apply { add(0, 0) })
    }
}

private fun calSumTable() {
    for(x in 0..n) {
        sumTable.add(x, (0..n).toList().map { 0 }.toMutableList())
        if (x != 0) {
            (1..n).forEach { y ->
                sumTable[x][y] = sumTable[x][y - 1] + sumTable[x - 1][y] - sumTable[x - 1][y - 1] + table[x][y]
            }
        }
    }
}

private fun inputQueries() {
    repeat(times = m) {
        val input = readln()
        val splitInput = input.split(" ")
        val x1 = splitInput[0].toInt()
        val y1 = splitInput[0].toInt()
        val x2 = splitInput[0].toInt()
        val y2 = splitInput[0].toInt()

        val result = sumTable[x2][y2] - sumTable[x1 - 1][y2] - sumTable[x2][y1 - 1] + sumTable[x1 - 1][y1 - 1]
        println(result)
    }
}
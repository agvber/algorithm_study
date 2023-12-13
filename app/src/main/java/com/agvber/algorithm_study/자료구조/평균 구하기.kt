package com.agvber.algorithm_study.자료구조

fun main() {
    val count = inputSubjectCount()
    val reportList = inputReportList().fakeCalculator()
    println(reportList.sum() / count)
}

private fun inputSubjectCount(): Int {
    val read = readln()
    return read.toInt()
}

private fun inputReportList(): List<Int> {
    val read = readln()
    return read.split(" ").map { it.toInt() }
}

private fun List<Int>.fakeCalculator(): List<Double> {
    return this.map { (it.toDouble() / this.max() * 100) }
}
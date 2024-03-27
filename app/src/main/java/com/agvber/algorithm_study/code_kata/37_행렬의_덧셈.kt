package com.agvber.algorithm_study.code_kata

import com.agvber.algorithm_study.require
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.combine

/**
 * 문제 설명
 * 행렬의 덧셈은 행과 열의 크기가 같은 두 행렬의 같은 행, 같은 열의 값을 서로 더한 결과가 됩니다. 2개의 행렬 arr1과 arr2를 입력받아, 행렬 덧셈의 결과를 반환하는 함수, solution을 완성해주세요.
 *
 * 제한 조건
 * 행렬 arr1, arr2의 행과 열의 길이는 500을 넘지 않습니다.
 * 입출력 예
 * arr1	arr2	return
 * [[1,2],[2,3]]	[[3,4],[5,6]]	[[4,6],[7,9]]
 * [[1],[2]]	[[3],[4]]	[[4],[6]]
 */

private fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
    return arr1.mapIndexed { parent, ints ->
        ints.mapIndexed { index, i ->
            i + arr2[parent][index]
        }.toIntArray()
    }
        .toTypedArray()
}

fun main() {
    require(
        arrayOf(arrayOf(4, 6), arrayOf(7, 9)),
        solution(
            arrayOf(intArrayOf(1, 2), intArrayOf(2, 3)),
            arrayOf(intArrayOf(3, 4), intArrayOf(5, 6))
        )
    ) { a, b ->
        println("${a.toString().toList()}, ${b.toString().toList()}")
    }
    require(
        arrayOf(arrayOf(4), arrayOf(6)),
        solution(
            arrayOf(intArrayOf(1), intArrayOf(2)),
            arrayOf(intArrayOf(3), intArrayOf(4))
        )
    ) { a, b ->
        println("${a.toString().toList()}, ${b.toString().toList()}")
    }
}
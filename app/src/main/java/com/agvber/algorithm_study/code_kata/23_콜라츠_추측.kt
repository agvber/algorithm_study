package com.agvber.algorithm_study.code_kata

/**
 * 문제 설명
 * 1937년 Collatz란 사람에 의해 제기된 이 추측은, 주어진 수가 1이 될 때까지 다음 작업을 반복하면, 모든 수를 1로 만들 수 있다는 추측입니다. 작업은 다음과 같습니다.
 *
 * 1-1. 입력된 수가 짝수라면 2로 나눕니다.
 * 1-2. 입력된 수가 홀수라면 3을 곱하고 1을 더합니다.
 * 2. 결과로 나온 수에 같은 작업을 1이 될 때까지 반복합니다.
 * 예를 들어, 주어진 수가 6이라면 6 → 3 → 10 → 5 → 16 → 8 → 4 → 2 → 1 이 되어 총 8번 만에 1이 됩니다. 위 작업을 몇 번이나 반복해야 하는지 반환하는 함수, solution을 완성해 주세요. 단, 주어진 수가 1인 경우에는 0을, 작업을 500번 반복할 때까지 1이 되지 않는다면 –1을 반환해 주세요.
 *
 * 제한 사항
 * 입력된 수, num은 1 이상 8,000,000 미만인 정수입니다.
 * 입출력 예
 * n	result
 * 6	8
 * 16	4
 * 626331	-1
 * 입출력 예 설명
 * 입출력 예 #1
 * 문제의 설명과 같습니다.
 *
 * 입출력 예 #2
 * 16 → 8 → 4 → 2 → 1 이 되어 총 4번 만에 1이 됩니다.
 *
 * 입출력 예 #3
 * 626331은 500번을 시도해도 1이 되지 못하므로 -1을 리턴해야 합니다.
 */

private fun solution(num: Int): Int {
    var result = num.toLong()
    var count = 0
    while (result != 1L && count < 500) {
        result = calCollatz(result)
        count += 1
    }
    return result.takeIf { it == 1L }?.let { count } ?: -1
}

private fun calCollatz(num: Long) = if (checkEvenNumber(num)) num / 2 else (num * 3) + 1
private fun checkEvenNumber(num: Long): Boolean = num % 2L == 0L

fun main() {
    println(solution(6))
    println(solution(16))
    println(solution(626331))
}
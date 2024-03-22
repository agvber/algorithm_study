package com.agvber.algorithm_study.code_kata

/**
 * 문제 설명
 * 단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
 *
 * 재한사항
 * s는 길이가 1 이상, 100이하인 스트링입니다.
 * 입출력 예
 * s	return
 * "abcde"	"c"
 * "qwer"	"we"
 */

private fun solution(s: String): String {
    val length = s.length
    val index = length / 2
    if (checkEven(length)) {
        return "${s[index - 1]}${s[index]}"
    }
    return "${s[index]}"
}

private fun checkEven(num: Int): Boolean = num % 2 == 0

fun main() {
    println(solution("abcde"))
    println(solution("qwer"))
}
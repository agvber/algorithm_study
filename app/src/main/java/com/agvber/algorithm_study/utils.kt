package com.agvber.algorithm_study

fun require(expect: Any, actual: Any, lazyMessage: (Any, Any) -> Any) {
    require(expect == actual) { lazyMessage(expect, actual) }
}
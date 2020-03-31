package task08.lambdas

import utils.tests

fun main() {
    tests("higher order",
        { "olleH!" == task3() }
    )
}

fun stringFormat(formatter: (String) -> String): (String) -> String = { str -> formatter(str) }

/**
 * Functions in Kotlin can also return functions!
 *
 * Let's create a string formatter that reverses a string and adds an exclamation mark (!)
 * After we have created our new formatter function, pass the string 'Hello' to it and
 * return the result.
 */
fun task3(): String {
    TODO()
}
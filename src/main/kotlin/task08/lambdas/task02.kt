package task08.lambdas

import utils.tests

fun main() {
    tests("lambda with argument",
        { 20 == task2() }
    )
}

fun numberMagic(lambda: (Int) -> Int) = lambda(10)

/**
 * If lambdas only have one argument in Kotlin we don't have to name it, and we can access it by the
 * special reference `it`. So instead of writing `{ number -> number + 5}` we can simply write
 * `{ it + 5 }`
 *
 * Let's pass a lambda to 'numberMagic' that doubles the number received.
 */
fun task2(): Int = TODO()

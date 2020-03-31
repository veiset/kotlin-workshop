package task08.lambdas

import utils.tests

fun main() {
    tests("lambda",
        { "hello!" == task1() }
    )
}

fun stringify(lambda: () -> String) = lambda() + "!"

/**
 * Lambdas are powerful! In Kotlin we can easily pass functions as arguments and even assign them to variables.
 *
 * Our function `stringify` takes another function (or a lambda) as an argument.
 * The syntax for defining lambdas in Kotlin is pretty straightforward.
 *      nameOfLambda: (TypeofArg1, TypeofArg2...) -> TypeofReturnVal
 *
 * The signature `lambda: () -> String` tells us that a lambda takes no arguments and returns a String.
 *
 * One cool thing in Kotlin is that when the last argument of a function is a lambda we can write the lambda
 * body outside the function arguments.
 * This means that instead of writing myFunction({ arg -> "hello" }) we can write myFunction { arg -> "hello" }
 *
 * For detailed information take a look at:
 * https://kotlinlang.org/docs/reference/lambdas.html
 *
 * Let's try to pass a lambda to 'stringify' that returns "hello", and return the result of that.
 */
fun task1(): String = TODO()

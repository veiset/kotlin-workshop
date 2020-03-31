package task02.t04_controlFlow


fun main(args: Array<String>) {
    utils.tests("when expression",
        { !isEven(1) },
        { isEven(200) }
    )
}


/**
 * Task 2: When
 *
 * When is Kotlin's replacement of the switch-statement, but When lets us do more than switch in Java.
 * https://kotlinlang.org/docs/reference/control-flow.html
 *
 * In its simplest form a when statement could look like this:
 *
 *  when (x) {
 *      1 -> print("x == 1")
        2 -> print("x == 2")
        else -> { // Note the block
            print("x is neither 1 nor 2")
        }
    }
 *
 * TODO: Instead of checking for 1 and 2, like in the example, use when to check if x is even or odd.
 */

fun isEven(x: Int): Boolean = TODO()



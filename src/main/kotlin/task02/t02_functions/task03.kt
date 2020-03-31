package task02.t02_functions


fun main() {

    val box = createBoxWrapper(15)
    utils.tests("",
        { box.height == 15 && box.length == 10 && box.width == 10 }
    )
}


/**
 * Task 3:
 *
 * In Kotlin function parameters can be named when calling functions.
 * This is very convenient when a function has a high number of parameters or default ones.
 *
 */

fun createBoxWrapper(height: Int): Box {

    // TODO: create a new box by only setting the height using named arguments
    return createBox()
}



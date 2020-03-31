package task02.t02_functions


fun main() {
    
    val SolutionBox = Solution.createBoxUsingWidthLengthHeight(10, 10,10)
    lateinit var Box: Box

    utils.tests("",
        {
            Box = createBox()
            true
        },
        {SolutionBox.height == Box.height && SolutionBox.length == Box.length && SolutionBox.width == Box.width }
    )
}


/**
 * Task 2:
 *
 * In Kotlin function parameters can have default values, which are used when a corresponding argument is omitted.
 * This allows for a reduced number of overloads compared to other languages.
 *
 */

// TODO: implement createBox with three parameters (width,length and height). All parameters should have an default value of 10
fun createBox(): Box = TODO()



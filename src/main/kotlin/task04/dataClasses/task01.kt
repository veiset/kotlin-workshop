package task04.dataClasses

import utils.classEqualFieldNamesAndTypes
import utils.tests

fun main() {

    tests("data class",
        { classEqualFieldNamesAndTypes(Solution.task1("The Wine", 2019, "The Winery", 10),
            task1("The Wine", 2019, "The Winery", 10)
        ) }
    )
}

/**
 * Task 1 - Create a data class
 * In the Java class JavaWine, you will find a model for wine reviews.
 * This class contains four variables as well as getters and setters for these.
 * In addition, it has its own methods for equals() and toString().
 * As the first task, declare a Kotlin data class (RedWine) that does the same as the Java class JavaWine.
 */

class RedWine

/**
 * To test that your newly created data class is "equal" to JavaWine, make the task1 function take in the
 * four fields of the class as parameters and return an instance of the RedWine class.
 * Run main() to test.
 */

fun task1(name: String, year: Int, winery: String, score: Int): RedWine {
    return RedWine()
}
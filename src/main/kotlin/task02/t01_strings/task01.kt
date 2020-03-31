package task02.t01_strings


fun main() {

    utils.tests("",
        { "Ola Nordmann" == formatFirstAndSurname("Ola", "Nordmann") },
        { Solution.formatFirstNameAndSurname("Ola", "Nordmann") == formatFirstAndSurname("Ola", "Nordmann") }
    )
}


/**
 * Task 1:
 *
 * In Kotlin we can use string templates.
 * https://kotlinlang.org/docs/reference/basic-types.html#string-templates
 *
 */


// TODO: Implement formatFirstAndSurname as "{first name} {surname}"
fun formatFirstAndSurname( firstName: String,  surname: String ): String = "$firstName $surname"

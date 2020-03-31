package task11.inlineClasses

import utils.tests

fun main() {

    tests("Days",
        { task4Value(4) == 4 },
        { task4ToHours(4) == Hours(4 * 24) },
        { task4ToMinutes(4) == Minutes(4 * 24 * 60) }
    )

    tests("Registration",
        { registration("New User", 4) == Minutes(4 * 24 * 60 )}
    )
}

/**
 * Task 4 - The "real world" example
 *
 * In this task you're supposed to figure out a way to send an email to every new customer of a system, four days
 * after their registration. The mail scheduling system looks like this:
 */

class MailScheduler {
    fun sendEmail(message: String, delay: Int): Int {
        println(message)
        return delay
    }
}

/**
 * MailScheduler.sendEmail() takes a String message and an Int delay. But what does delay mean? What unit does it take?
 * After some research, you figure out that the delay is meant to be in minutes.
 *
 * - Write a wrapper as an inline class (Days), that takes an Int parameter (value).
 * - Give the Days class a toHours() function that returns an instance of Hours.
 * - In task4Value(), create an instance of Days and set value to numberOfDays. Return value.
 * - In task4ToHours(), create an instance of Days and set value to numberOfDays. Return Days.toHours().
 * - In task4ToMinutes(), create an instance of Days and set value to numberOfDays. Return Hours.toMinutes().
 * - Rewrite the sendMessage function in the MailScheduler to use the Minutes class you created in Task 1.
 */

class Days

fun task4Value(numberOfDays: Int): Int {
    TODO()
}

fun task4ToHours(numberOfDays: Int): Hours {
    TODO()
}

fun task4ToMinutes(numberOfDays: Int): Minutes {
    TODO()
}

/**
 * Finally, complete the registration function underneath by
 * using the new wrapper classes.
 */

fun registration(newCustomer: String, delayInDays: Int): Minutes {
   TODO()
}

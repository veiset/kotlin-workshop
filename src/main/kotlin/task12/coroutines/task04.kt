package task12.coroutines

import kotlinx.coroutines.runBlocking
import utils.tests

fun main() {
    tests("Coroutines - suspend functions.",
        { task04() == 1000 })
}

/**
 * Kotlin suspending functions
 *
 * When using coroutines it is possible to use suspend on functions.
 * This means that while doing an API call or any other operation where
 * you might need to wait for a result, the function is temporarily suspended.
 * A suspended function redirects its resources back to the thread pool when
 * waiting for something to be processed inside the suspending function.
 * When it is time again for the suspended function to do some processing it
 * again is assigned threads from the thread pool.
 *
 * You may also specify a context for the coroutine to run in. Most used are IO, Main and Default.
 * IO - network/input output operations.
 * Main - UI operations.
 * Default - This is the default context that coroutines default to when no context is specified.
 *
 * A coroutine scope within a coroutine may also specify the context using 'withContext(context) { }'
 * A function can be made suspending by putting suspend in front of function declaration like this:
 * suspend fun theFunnestFun()
 *
 * A very good article for thoroughly understanding coroutines ->
 * https://medium.com/@elye.project/understanding-suspend-function-of-coroutines-de26b070c5ed
 *
 * Task - Make the apiCall() function suspending and use the IO dispatcher context.
 *
 */

fun task04() = runBlocking {
    apiCall()
}

fun apiCall(): Int = TODO()


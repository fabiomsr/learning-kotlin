package com.cells.learning.kotlin.week1.task01

import com.cells.learning.kotlin.week1.task01.JavaCode1
import com.cells.learning.util.TODO


fun todoTask1(collection: Collection<Int>): Nothing = TODO(
        """
        Task 1.
        Rewrite JavaCode1.task1 in Kotlin.
        In IntelliJ IDEA, you can just copy-paste the code and agree to automatically convert it to Kotlin,
        but only for this task!
    """,
        references = { JavaCode1().task1(collection) })

/**
 * @see com.cells.learning.kotlin.week1.task01.JavaCode1
 */
fun task1(collection: Collection<Int>): String {
    todoTask1(collection)
}

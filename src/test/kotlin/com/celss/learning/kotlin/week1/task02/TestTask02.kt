package com.celss.learning.kotlin.week1.task02

import com.cells.learning.kotlin.week1.task02.task2
import org.junit.Assert
import org.junit.Test


class TestTask02() {

    @Test fun testJoinToString() {
        Assert.assertEquals("{1, 2, 3, 42, 555}", task2(listOf(1, 2, 3, 42, 555)))
    }

}
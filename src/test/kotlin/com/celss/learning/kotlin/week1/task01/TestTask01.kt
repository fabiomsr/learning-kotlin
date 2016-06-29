package com.celss.learning.kotlin.week1.task01

import com.cells.learning.kotlin.week1.task01.task1
import org.junit.Assert
import org.junit.Test


class TestTask01() {
    @Test fun collection() {
        Assert.assertEquals("{1, 2, 3, 42, 555}", task1(listOf(1, 2, 3, 42, 555)))
    }
}
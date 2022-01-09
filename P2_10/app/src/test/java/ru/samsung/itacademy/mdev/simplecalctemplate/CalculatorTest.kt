package ru.samsung.itacademy.mdev.simplecalctemplate

import org.junit.After
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class CalculatorTest {
    private var calculator: Calculator? = null
    @Before
    fun setUp() {
        calculator = Calculator()
    }
    @Test
    fun addition_isCorrect() {
        assertEquals(4, calculator!!.add(2, 2))
    }
    @Test
    fun subtract_isCorrect() {
        assertEquals(0, calculator!!.subtract(2, 2))
    }
    @Test
    fun multiply_isCorrect() {
        assertEquals(4, calculator!!.multiply(2, 2))
    }
    @Test
    fun divide_isCorrect() {
        assertEquals(1, calculator!!.divide(2, 2))
    }
    @Test
    fun zeroDivision() {
        assertEquals(0, calculator!!.divide(2, 0))
    }
    @Test
    fun all_isCorrect() {
        assertEquals(5, calculator!!.add(3, 2))
        assertEquals(10, calculator!!.subtract(30, 20))
        assertEquals(25, calculator!!.multiply(5, 5))
        assertEquals(2, calculator!!.divide(10, 5))
        assertEquals(0, calculator!!.divide(123, 0),)
    }
    @After
    fun tearDown() {
        calculator = null
    }
}
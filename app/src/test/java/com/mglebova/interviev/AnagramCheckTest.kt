package com.mglebova.interviev

import areAnagrams
import org.junit.Assert.*
import org.junit.Test

class AnagramCheckTest {
    @Test
    fun areAnagramsPositiveSimple() {
        val actual = areAnagrams("listen", "silent")
        val expected = true
        assertEquals(expected,actual)
    }

    @Test
    fun areAnagramsNegativeSimple() {
        val actual = areAnagrams("listen", "silenb")
        val expected = false
        assertEquals(expected,actual)
    }

    @Test
    fun areAnagramsWhiteSpace() {
        val actual = areAnagrams("vah vah", "vahvah")
        val expected = true
        assertEquals(expected,actual)
    }

    @Test
    fun areAnagramsCaseSensitive() {
        val actual = areAnagrams("HavHav", "havhav")
        val expected = true
        assertEquals(expected,actual)
    }



}
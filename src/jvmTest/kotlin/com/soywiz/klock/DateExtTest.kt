package com.soywiz.klock

import org.junit.Test
import java.util.*
import kotlin.test.assertEquals

class DateExtTest {
    @Test
    fun test() {
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"))
        assertEquals("Thu, 20 Dec 2018 12:06:35 UTC", Date(1545307595729L).toDateTime().toString())
        assertEquals("Thu Dec 20 12:06:35 UTC 2018", DateTime(1545307595729L).toDate().toString())
    }
}
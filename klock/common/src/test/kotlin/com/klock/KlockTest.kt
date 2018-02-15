package com.klock

import com.soywiz.klock.Klock
import kotlin.test.*

class KlockTest {
	//@Test
	@Test
	fun testTimeAdvances() {
		val time1 = Klock.currentTimeMillis()
		assertTrue(time1 >= 1508887000000)
		while (true) {
			val time2 = Klock.currentTimeMillis()
			assertTrue(time2 >= time1)
			if (time2 > time1) break
		}
	}

	@Test
	fun testThatLocalTimezoneOffsetRuns() {
		assertTrue(Klock.getLocalTimezoneOffset(0L) != -1)
	}
}

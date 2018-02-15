package com.soywiz.klock

/**
 * Exposed per-platform klock utilities.
 */
expect object Klock {
	/**
	 * Version of this library.
	 */
	val VERSION: String

	/**
	 * Returns the total milliseconds since unix epoch.
	 */
	fun currentTimeMillis(): Long

	/**
	 * Returns the total milliseconds since unix epoch.
	 *
	 * The same as `currentTimeMillis` but as double. To prevent allocation on
	 * targets without Long support.
	 */
	fun currentTimeMillisDouble(): Double

	/**
	 * Returns timezone offset in minutes, from a specified [unix] epoch in milliseconds.
	 *
	 * For example, GMT+01 would return 60.
	 */
	fun getLocalTimezoneOffset(unix: Long): Int
}

object KlockExt {
	val VERSION = KLOCK_VERSION
}

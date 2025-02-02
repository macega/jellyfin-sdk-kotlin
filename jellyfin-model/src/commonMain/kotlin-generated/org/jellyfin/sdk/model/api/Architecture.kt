// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.sdk.model.api

import kotlin.String
import kotlin.requireNotNull
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
public enum class Architecture(
	public val serialName: String,
) {
	@SerialName("X86")
	X86("X86"),
	@SerialName("X64")
	X64("X64"),
	@SerialName("Arm")
	ARM("Arm"),
	@SerialName("Arm64")
	ARM_64("Arm64"),
	@SerialName("Wasm")
	WASM("Wasm"),
	@SerialName("S390x")
	S39_0X("S390x"),
	;

	/**
	 * Get the serial name of the enum member.
	 */
	override fun toString(): String = serialName

	public companion object {
		/**
		 * Find the enum member by the serial name or return null.
		 */
		public fun fromNameOrNull(serialName: String): Architecture? = when (serialName) {
			"X86" -> X86
			"X64" -> X64
			"Arm" -> ARM
			"Arm64" -> ARM_64
			"Wasm" -> WASM
			"S390x" -> S39_0X
			else -> null
		}

		/**
		 * Find the enum member by the serial name or throw.
		 */
		public fun fromName(serialName: String): Architecture =
				requireNotNull(fromNameOrNull(serialName)) { """Unknown value $serialName""" }
	}
}

// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.apiclient.model

import kotlin.Boolean

/**
 * Startup remote access dto.
 */
data class StartupRemoteAccessDto(
	/**
	 * Gets or sets a value indicating whether enable remote access.
	 */
	val enableRemoteAccess: Boolean,
	/**
	 * Gets or sets a value indicating whether enable automatic port mapping.
	 */
	val enableAutomaticPortMapping: Boolean
)

// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.apiclient.model

import java.time.LocalDateTime
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.Map

data class BookInfo(
	val seriesName: String? = null,
	/**
	 * Gets or sets the name.
	 */
	val name: String? = null,
	/**
	 * Gets or sets the path.
	 */
	val path: String? = null,
	/**
	 * Gets or sets the metadata language.
	 */
	val metadataLanguage: String? = null,
	/**
	 * Gets or sets the metadata country code.
	 */
	val metadataCountryCode: String? = null,
	/**
	 * Gets or sets the provider ids.
	 */
	val providerIds: Map<String, String>? = null,
	/**
	 * Gets or sets the year.
	 */
	val year: Int? = null,
	val indexNumber: Int? = null,
	val parentIndexNumber: Int? = null,
	val premiereDate: LocalDateTime? = null,
	val isAutomated: Boolean
)

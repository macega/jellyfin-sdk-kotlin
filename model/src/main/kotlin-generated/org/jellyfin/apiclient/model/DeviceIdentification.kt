// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.apiclient.model

import kotlin.String
import kotlin.collections.List

data class DeviceIdentification(
	/**
	 * Gets or sets the name of the friendly.
	 */
	val friendlyName: String? = null,
	/**
	 * Gets or sets the model number.
	 */
	val modelNumber: String? = null,
	/**
	 * Gets or sets the serial number.
	 */
	val serialNumber: String? = null,
	/**
	 * Gets or sets the name of the model.
	 */
	val modelName: String? = null,
	/**
	 * Gets or sets the model description.
	 */
	val modelDescription: String? = null,
	/**
	 * Gets or sets the model URL.
	 */
	val modelUrl: String? = null,
	/**
	 * Gets or sets the manufacturer.
	 */
	val manufacturer: String? = null,
	/**
	 * Gets or sets the manufacturer URL.
	 */
	val manufacturerUrl: String? = null,
	/**
	 * Gets or sets the headers.
	 */
	val headers: List<HttpHeaderInfo>? = null
)

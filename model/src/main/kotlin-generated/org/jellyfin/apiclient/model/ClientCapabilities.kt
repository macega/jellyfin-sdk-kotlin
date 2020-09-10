// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.apiclient.model

import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

data class ClientCapabilities(
	val playableMediaTypes: List<String>? = null,
	val supportedCommands: List<String>? = null,
	val supportsMediaControl: Boolean,
	val supportsContentUploading: Boolean,
	val messageCallbackUrl: String? = null,
	val supportsPersistentIdentifier: Boolean,
	val supportsSync: Boolean,
	val deviceProfile: DeviceProfile,
	val appStoreUrl: String? = null,
	val iconUrl: String? = null
)

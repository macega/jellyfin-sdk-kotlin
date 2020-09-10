// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.apiclient.api.operations

import kotlin.Any
import kotlin.String
import org.jellyfin.apiclient.api.client.KtorClient
import org.jellyfin.apiclient.api.client.Response
import org.jellyfin.apiclient.model.UtcTimeResponse

class TimeSyncApi(
	private val api: KtorClient
) {
	/**
	 * Gets the current utc time.
	 */
	suspend fun getUtcTime(): Response<UtcTimeResponse> {
		val pathParameters = emptyMap<String, Any?>()
		val queryParameters = emptyMap<String, Any?>()
		val data = null
		val response = api.get<UtcTimeResponse>("/GetUtcTime", pathParameters, queryParameters, data)
		return response
	}
}

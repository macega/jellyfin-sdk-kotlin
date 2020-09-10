// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.apiclient.api.operations

import java.util.UUID
import kotlin.Any
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import org.jellyfin.apiclient.api.client.KtorClient
import org.jellyfin.apiclient.api.client.Response
import org.jellyfin.apiclient.model.RecommendationDto

class MoviesApi(
	private val api: KtorClient
) {
	/**
	 * Gets movie recommendations.
	 *
	 * @param userId Optional. Filter by user id, and attach user data.
	 * @param parentId Specify this to localize the search to a specific item or folder. Omit to use
	 * the root.
	 * @param fields Optional. The fields to return.
	 * @param categoryLimit The max number of categories to return.
	 * @param itemLimit The max number of items to return per category.
	 */
	suspend fun getMovieRecommendations(
		userId: UUID? = null,
		parentId: String? = null,
		fields: String? = null,
		categoryLimit: Int,
		itemLimit: Int
	): Response<List<RecommendationDto>> {
		val pathParameters = emptyMap<String, Any?>()
		val queryParameters = mutableMapOf<String, Any?>()
		queryParameters["userId"] = userId
		queryParameters["parentId"] = parentId
		queryParameters["fields"] = fields
		queryParameters["categoryLimit"] = categoryLimit
		queryParameters["itemLimit"] = itemLimit
		val data = null
		val response = api.get<List<RecommendationDto>>("/Movies/Recommendations", pathParameters,
				queryParameters, data)
		return response
	}
}

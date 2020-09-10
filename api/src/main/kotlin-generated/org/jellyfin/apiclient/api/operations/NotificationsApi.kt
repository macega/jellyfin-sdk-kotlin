// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.apiclient.api.operations

import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import org.jellyfin.apiclient.api.client.KtorClient
import org.jellyfin.apiclient.api.client.Response
import org.jellyfin.apiclient.model.NameIdPair
import org.jellyfin.apiclient.model.NotificationLevel
import org.jellyfin.apiclient.model.NotificationResultDto
import org.jellyfin.apiclient.model.NotificationTypeInfo
import org.jellyfin.apiclient.model.NotificationsSummaryDto

class NotificationsApi(
	private val api: KtorClient
) {
	/**
	 * Gets a user's notifications.
	 */
	suspend fun getNotifications(userId: String): Response<NotificationResultDto> {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["userId"] = userId
		val queryParameters = emptyMap<String, Any?>()
		val data = null
		val response = api.get<NotificationResultDto>("/Notifications/{userId}", pathParameters,
				queryParameters, data)
		return response
	}

	/**
	 * Sets notifications as read.
	 */
	suspend fun setRead(userId: String): Response<Unit> {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["userId"] = userId
		val queryParameters = emptyMap<String, Any?>()
		val data = null
		val response = api.post<Unit>("/Notifications/{userId}/Read", pathParameters, queryParameters,
				data)
		return response
	}

	/**
	 * Gets a user's notification summary.
	 */
	suspend fun getNotificationsSummary(userId: String): Response<NotificationsSummaryDto> {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["userId"] = userId
		val queryParameters = emptyMap<String, Any?>()
		val data = null
		val response = api.get<NotificationsSummaryDto>("/Notifications/{userId}/Summary", pathParameters,
				queryParameters, data)
		return response
	}

	/**
	 * Sets notifications as unread.
	 */
	suspend fun setUnread(userId: String): Response<Unit> {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["userId"] = userId
		val queryParameters = emptyMap<String, Any?>()
		val data = null
		val response = api.post<Unit>("/Notifications/{userId}/Unread", pathParameters, queryParameters,
				data)
		return response
	}

	/**
	 * Sends a notification to all admins.
	 *
	 * @param url The URL of the notification.
	 * @param level The level of the notification.
	 * @param name The name of the notification.
	 * @param description The description of the notification.
	 */
	suspend fun createAdminNotification(
		url: String? = null,
		level: NotificationLevel,
		name: String? = null,
		description: String? = null
	): Response<Unit> {
		val pathParameters = emptyMap<String, Any?>()
		val queryParameters = mutableMapOf<String, Any?>()
		queryParameters["url"] = url
		queryParameters["level"] = level
		queryParameters["name"] = name
		queryParameters["description"] = description
		val data = null
		val response = api.post<Unit>("/Notifications/Admin", pathParameters, queryParameters, data)
		return response
	}

	/**
	 * Gets notification services.
	 */
	suspend fun getNotificationServices(): Response<List<NameIdPair>> {
		val pathParameters = emptyMap<String, Any?>()
		val queryParameters = emptyMap<String, Any?>()
		val data = null
		val response = api.get<List<NameIdPair>>("/Notifications/Services", pathParameters,
				queryParameters, data)
		return response
	}

	/**
	 * Gets notification types.
	 */
	suspend fun getNotificationTypes(): Response<List<NotificationTypeInfo>> {
		val pathParameters = emptyMap<String, Any?>()
		val queryParameters = emptyMap<String, Any?>()
		val data = null
		val response = api.get<List<NotificationTypeInfo>>("/Notifications/Types", pathParameters,
				queryParameters, data)
		return response
	}
}

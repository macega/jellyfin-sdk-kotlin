// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
@file:UseSerializers(DateTimeSerializer::class)

package org.jellyfin.sdk.model.api

import kotlin.Boolean
import kotlin.String
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers
import org.jellyfin.sdk.model.DateTime
import org.jellyfin.sdk.model.serializer.DateTimeSerializer

/**
 * The notification DTO.
 */
@Serializable
public data class NotificationDto(
	/**
	 * The notification ID. Defaults to an empty string.
	 */
	@SerialName("Id")
	public val id: String,
	/**
	 * The notification's user ID. Defaults to an empty string.
	 */
	@SerialName("UserId")
	public val userId: String,
	/**
	 * The notification date.
	 */
	@SerialName("Date")
	public val date: DateTime,
	/**
	 * A value indicating whether the notification has been read. Defaults to false.
	 */
	@SerialName("IsRead")
	public val isRead: Boolean,
	/**
	 * The notification's name. Defaults to an empty string.
	 */
	@SerialName("Name")
	public val name: String,
	/**
	 * The notification's description. Defaults to an empty string.
	 */
	@SerialName("Description")
	public val description: String,
	/**
	 * The notification's URL. Defaults to an empty string.
	 */
	@SerialName("Url")
	public val url: String,
	/**
	 * The notification level.
	 */
	@SerialName("Level")
	public val level: NotificationLevel,
)

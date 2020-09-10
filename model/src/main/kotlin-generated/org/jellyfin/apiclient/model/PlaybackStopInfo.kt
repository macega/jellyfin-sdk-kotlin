// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.apiclient.model

import java.util.UUID
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlin.collections.List

/**
 * Class PlaybackStopInfo.
 */
data class PlaybackStopInfo(
	val item: BaseItemDto,
	/**
	 * Gets or sets the item identifier.
	 */
	val itemId: UUID,
	/**
	 * Gets or sets the session id.
	 */
	val sessionId: String? = null,
	/**
	 * Gets or sets the media version identifier.
	 */
	val mediaSourceId: String? = null,
	/**
	 * Gets or sets the position ticks.
	 */
	val positionTicks: Long? = null,
	/**
	 * Gets or sets the live stream identifier.
	 */
	val liveStreamId: String? = null,
	/**
	 * Gets or sets the play session identifier.
	 */
	val playSessionId: String? = null,
	/**
	 * Gets or sets a value indicating whether this MediaBrowser.Model.Session.PlaybackStopInfo is
	 * failed.
	 */
	val failed: Boolean,
	val nextMediaType: String? = null,
	val playlistItemId: String? = null,
	val nowPlayingQueue: List<QueueItem>? = null
)

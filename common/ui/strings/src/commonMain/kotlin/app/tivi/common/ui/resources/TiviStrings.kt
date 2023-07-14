// Copyright 2023, Christopher Banes and the Tivi project contributors
// SPDX-License-Identifier: Apache-2.0

package app.tivi.common.ui.resources

data class TiviStrings(
    val accountNameUnknown: String,
    val accountTitle: String,
    val airsText: (String, String) -> String,
    val airsTitle: String,
    val buttonConfirm: String,
    val cdClearText: String,
    val cdClose: String,
    val cdDelete: String,
    val cdDiscoverTitle: String,
    val cdEpisodeDeleted: String,
    val cdEpisodeFirstAired: (String) -> String,
    val cdEpisodeSyncing: String,
    val cdEpisodeWatched: String,
    val cdFollowShowAdd: String,
    val cdFollowShowRemove: String,
    val cdFollowingShowsTitle: String,
    val cdLibraryTitle: String,
    val cdNavigateUp: String,
    val cdNetworkLogo: String,
    val cdOpenOverflow: String,
    val cdProfilePic: (String) -> String,
    val cdRefresh: String,
    val cdSearchNavigationTitle: String,
    val cdShowPoster: String,
    val cdShowPosterImage: (String) -> String,
    val cdSortList: String,
    val cdTraktRating: (Float) -> String,
    val cdUpnextTitle: String,
    val cdUserProfile: String,
    val cdWatchedShowsTitle: String,
    val certificateContentDescriptionFormat: (String) -> String,
    val certificateTitle: String,
    val dateLabel: String,
    val detailsAbout: String,
    val detailsNextEpisodeToWatch: String,
    val detailsRelated: String,
    val detailsViewStats: String,
    val dialogDismiss: String,
    val discoverKeepWatchingTitle: String,
    val discoverPopularTitle: String,
    val discoverRecommendedTitle: String,
    val discoverTitle: String,
    val discoverTrendingTitle: String,
    val emptyEmoji: String,
    val emptyPrompt: String,
    val episodeAddWatch: String,
    val episodeMarkWatched: String,
    val episodeNavigationTitle: String,
    val episodeNumber: (Int) -> String,
    val episodeRemoveWatchesDialogConfirm: String,
    val episodeRemoveWatchesDialogMessage: String,
    val episodeRemoveWatchesDialogTitle: String,
    val episodeTitleFallback: (Int) -> String,
    val episodeTrackNow: String,
    val episodeTrackPrompt: String,
    val episodeTrackSetFirstAired: String,
    val episodeWatchDateTitle: String,
    val episodeWatchTimeTitle: String,
    val episodeWatches: String,
    val errorGeneric: String,
    val filterShows: (Int) -> String,
    val firstAired: (String) -> String,
    val followShowAdd: String,
    val followShowRemove: String,
    val followShowsAdd: String,
    val followShowsRemove: String,
    val followedWatchStatsComplete: String,
    val followedWatchStatsToWatch: (quantity: Int) -> String,
    val followingShowsTitle: String,
    val genreLabelAction: String,
    val genreLabelAdventure: String,
    val genreLabelComedy: String,
    val genreLabelCrime: String,
    val genreLabelDrama: String,
    val genreLabelFantasy: String,
    val genreLabelHorror: String,
    val genreLabelMystery: String,
    val genreLabelScienceFiction: String,
    val genreLabelThriller: String,
    val headerMore: String,
    val headerShowCount: (quantity: Int) -> String,
    val headerShowCountFiltered: (quantity: Int) -> String,
    val libraryEmptyPrompt: String,
    val libraryEmptyTitle: String,
    val libraryLastWatched: (String) -> String,
    val libraryTitle: String,
    val login: String,
    val logout: String,
    val menuRefresh: String,
    val minutesFormat: (Int) -> String,
    val networkContentDescriptionFormat: (String) -> String,
    val networkTitle: String,
    val nextPrefix: (String) -> String,
    val notKnownTitle: String,
    val percentageFormat: (Int) -> String,
    val popupSeasonFollow: String,
    val popupSeasonIgnore: String,
    val popupSeasonIgnorePrevious: String,
    val popupSeasonMarkAllUnwatched: String,
    val popupSeasonMarkWatchedAired: String,
    val popupSeasonMarkWatchedAll: String,
    val popupSeasonWatchAirDate: String,
    val popupSeasonWatchNow: String,
    val popupSortAirDate: String,
    val popupSortAlpha: String,
    val popupSortDateFollowed: String,
    val popupSortLastWatched: String,
    val privacyPolicyUrl: String,
    val ratingContentDescriptionFormat: (Int) -> String,
    val refreshCredentials: String,
    val runtimeTitle: String,
    val searchEmptyTitle: String,
    val searchHint: String,
    val searchNavigationTitle: String,
    val searchNoresultsPrompt: String,
    val searchNoresultsTitle: String,
    val seasonEpisodeNumber: (Int, Int) -> String,
    val seasonSummaryToAir: (Int) -> String,
    val seasonSummaryToWatch: (Int) -> String,
    val seasonSummaryWatched: (Int) -> String,
    val seasonTitleFallback: (Int) -> String,
    val selectionTitle: (Int) -> String,
    val settingsAboutCategoryTitle: String,
    val settingsAppVersion: String,
    val settingsAppVersionSummary: (String, Int) -> String,
    val settingsDataSaverSummaryOn: String,
    val settingsDataSaverSummarySystem: String,
    val settingsDataSaverTitle: String,
    val settingsDynamicColorSummary: String,
    val settingsDynamicColorTitle: String,
    val settingsOpenSource: String,
    val settingsOpenSourceSummary: String,
    val settingsThemeTitle: String,
    val settingsTitle: String,
    val settingsUiCategoryTitle: String,
    val showDetailsSeasons: String,
    val showdetailsNavigationTitle: String,
    val statusActive: String,
    val statusEnded: String,
    val statusInProduction: String,
    val statusPlanned: String,
    val statusTitle: String,
    val timeLabel: String,
    val traktRatingText: (Float) -> String,
    val traktRatingTitle: String,
    val traktRatingVotes: String,
    val upnextEmptyPrompt: String,
    val upnextEmptyTitle: String,
    val upnextFilterFollowedShowsOnlyTitle: String,
    val upnextTitle: String,
    val viewPrivacyPolicy: String,
    val watchedShowsTitle: String,
)

object Locales {
    const val EN = "en"
}

expect fun String.fmt(vararg args: Any?): String

package com.nuvio.app.features.streams

import com.nuvio.app.desktop.DesktopPreferences

internal actual object BingeGroupCacheStorage {
    private const val preferencesName = "nuvio_binge_group_cache"

    actual fun load(hashedKey: String): String? =
        DesktopPreferences.getString(preferencesName, hashedKey)

    actual fun save(hashedKey: String, value: String) {
        DesktopPreferences.putString(preferencesName, hashedKey, value)
    }

    actual fun remove(hashedKey: String) {
        DesktopPreferences.remove(preferencesName, hashedKey)
    }
}

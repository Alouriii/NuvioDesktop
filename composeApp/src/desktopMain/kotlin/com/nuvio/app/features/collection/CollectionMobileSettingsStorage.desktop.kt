package com.nuvio.app.features.collection

import com.nuvio.app.desktop.DesktopPreferences

internal actual object CollectionMobileSettingsStorage {
    private const val preferencesName = "nuvio_collection_mobile_settings"
    private const val payloadKey = "payload"

    actual fun loadPayload(): String? =
        DesktopPreferences.getString(preferencesName, payloadKey)

    actual fun savePayload(payload: String) {
        DesktopPreferences.putString(preferencesName, payloadKey, payload)
    }
}

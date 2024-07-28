package com.example.trackloc

// LocationUpdatesCallBack.kt
import android.location.Location

interface LocationUpdatesCallBack {
    fun locationException(message: String)
    fun onLocationUpdate(location: Location)
}

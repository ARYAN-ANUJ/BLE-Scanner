package com.bridou_n.beaconscanner.models

import com.google.gson.annotations.SerializedName


data class LoggingRequest(
        @SerializedName("reader")
        val deviceName: String,

        @SerializedName("beacons")
        val beacons: List<BeaconSaved>
)
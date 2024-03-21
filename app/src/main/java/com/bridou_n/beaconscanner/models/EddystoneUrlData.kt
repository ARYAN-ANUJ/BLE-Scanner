package com.bridou_n.beaconscanner.models

import androidx.room.ColumnInfo
import com.google.gson.annotations.SerializedName


data class EddystoneUrlData(
        @SerializedName("url")
        @ColumnInfo(name = "url")
        var url: String? = null
)
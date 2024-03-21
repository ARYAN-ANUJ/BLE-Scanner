package com.bridou_n.beaconscanner.models

import androidx.room.ColumnInfo
import com.google.gson.annotations.SerializedName


data class IbeaconData(
        @SerializedName("uuid")
        @ColumnInfo(name = "uuid")
        val uuid: String,

        @SerializedName("major")
        @ColumnInfo(name = "major")
        val major: String,

        @SerializedName("minor")
        @ColumnInfo(name = "minor")
        val minor: String
)
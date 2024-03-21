package com.bridou_n.beaconscanner.models

import androidx.room.ColumnInfo
import com.google.gson.annotations.SerializedName


data class EddystoneUidData(
        @SerializedName("namespace_id")
        @ColumnInfo(name = "namespace_id")
        val namespaceId: String,

        @SerializedName("instance_id")
        @ColumnInfo(name = "instance_id")
        val instanceId: String
)
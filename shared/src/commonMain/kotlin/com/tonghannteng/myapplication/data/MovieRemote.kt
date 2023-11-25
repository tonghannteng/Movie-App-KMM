package com.tonghannteng.myapplication.data

import kotlinx.serialization.SerialName

data class MovieRemote(
    val id: Int,
    val title: String,
    val overview: String,
    @SerialName("poster_path")
    val posterImage: String,
    @SerialName("release_date")
    val releaseData: String
)

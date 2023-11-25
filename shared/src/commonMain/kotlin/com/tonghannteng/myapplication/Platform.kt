package com.tonghannteng.myapplication

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
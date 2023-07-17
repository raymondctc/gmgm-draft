package com.gmgm.app

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
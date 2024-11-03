package com.malejadev.lamulaappc

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
package io.github.ritsukiotsuka

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
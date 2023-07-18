package carlosmacaneta.listapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
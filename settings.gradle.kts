pluginManagement {
    repositories {
        maven { url = uri("https://repo.spring.io/snapshot") }
        gradlePluginPortal()
    }
}
rootProject.name = "chirp"

include("user")
include("app")
include("chat")
include("common")
include("notification")
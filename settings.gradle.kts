pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.PREFER_SETTINGS)
    repositories {
        google()
        mavenCentral()
        maven("https://s3.ap-south-1.amazonaws.com/hvsdk/android/releases")

    }
}


rootProject.name = "HyperverseDemo"
include(":app")
 
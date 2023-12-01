// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.1.0" apply false
}
// Top-level build.gradle.kts

// Other configurations...

allprojects {
    repositories {
        // Other repositories...

          maven {
            url = uri("https://s3.ap-south-1.amazonaws.com/hvsdk/android/releases")
        }
    }
}

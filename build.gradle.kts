// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        jcenter()
    }
    dependencies {
//        classpath("com.android.tools.build:gradle:4.0.0")
        classpath("com.android.tools.build:gradle:${ProjectProperties.agpVersion}")


        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle.kts files
    }
}

allprojects {
    repositories {
        google()
        jcenter()
    }
}

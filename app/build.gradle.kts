plugins{
    id("com.android.application")
}

android {
    compileSdkVersion(29)
//    compileSdkVersion(ProjectProperties.compileSdk)


    defaultConfig {
//        applicationId = "com.boycoder.kotlinjetpackinaction"
//        minSdkVersion(21)
//        targetSdkVersion(29)
//        versionCode = 1
//        versionName = "1.0"
        minSdkVersion(ProjectProperties.minSdk)
        targetSdkVersion(ProjectProperties.targetSdk)
        applicationId = ProjectProperties.applicationId
        versionCode = ProjectProperties.versionCode
        versionName = ProjectProperties.versionName

        testInstrumentationRunner ="androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
//    implementation(fileTree(mapOf("dir" to "MeLibs", "include" to listOf("*.jar"))))
//    implementation("androidx.appcompat:appcompat:1.1.0")
//    implementation("androidx.constraintlayout:constraintlayout:1.1.3")
//    testImplementation("junit:junit:4.12")
//    androidTestImplementation("androidx.test.ext:junit:1.1.1")
//    androidTestImplementation("androidx.test.espresso:espresso-core:3.2.0")
    implementation(MeLibs.appCompat)
    implementation(MeLibs.constraintlayout)
    testImplementation(MeLibs.junit)
    androidTestImplementation(MeLibs.testExt)
    androidTestImplementation(MeLibs.espresso)

//    implementation("com.android.volley:volley:1.1.1")
//    implementation("com.google.code.gson:gson:2.8.6")
    implementation(MeLibs.volley)
    implementation(MeLibs.gson)

//    implementation("com.github.bumptech.glide:glide:4.8.0")
//    annotationProcessor("com.github.bumptech.glide:compiler:4.8.0")
    implementation(MeLibs.glide)
    annotationProcessor(MeLibs.glideCompiler)
}


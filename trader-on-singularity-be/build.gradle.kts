plugins {
    application
}

repositories {
    jcenter()
    mavenLocal()
}

dependencies {
    implementation("com.ibtsoft:singularity-core:0.0.1-SNAPSHOT")
    implementation("com.google.guava:guava:27.0.1-jre")

    runtimeOnly("org.slf4j:slf4j-simple:1.7.30")

    testImplementation("junit:junit:4.12")
}

application {
    // Define the main class for the application
    mainClassName = "com.ibtsoft.trader.App"
}

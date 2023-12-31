plugins {
    id("java")
    id("maven-publish")
}

group = "com.github.dracula6322"
version = "0.5-tag"

repositories {
    mavenCentral()
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "com.github.dracula6322"
            artifactId = "psychic-goggles"
            version = "0.6"
            from(components["java"])
        }
    }
}

dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.3")
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}
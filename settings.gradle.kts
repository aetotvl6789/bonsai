dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

include(
    ":bonsai",
    ":sample",
)

enableFeaturePreview("VERSION_CATALOGS")

// There's an issue when a module has the same name of the project
// https://github.com/gradle/gradle/issues/16608
//enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

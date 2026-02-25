<<<<<<< HEAD
pluginManagement {

    repositories {

        google()

        mavenCentral()

        gradlePluginPortal()

        google {

            content {

                includeGroupByRegex("com\\.android.*")

                includeGroupByRegex("com\\.google.*")

                includeGroupByRegex("androidx.*")

            }

        }

    }

}

dependencyResolutionManagement {

    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)

    repositories {

        google()

        mavenCentral()

        gradlePluginPortal()
        
        maven { url = uri("https://www.jitpack.io") }

    }

}

rootProject.name = "Yhchat Canary"

=======
pluginManagement {

    repositories {

        google()

        mavenCentral()

        gradlePluginPortal()

        google {

            content {

                includeGroupByRegex("com\\.android.*")

                includeGroupByRegex("com\\.google.*")

                includeGroupByRegex("androidx.*")

            }

        }

    }

}

dependencyResolutionManagement {

    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)

    repositories {

        google()

        mavenCentral()

        gradlePluginPortal()
        
        maven { url = uri("https://www.jitpack.io") }

    }

}

rootProject.name = "Yhchat Canary"

>>>>>>> f4a13afe97ba10b72c3fefc05068fea437695a53
include(":app")
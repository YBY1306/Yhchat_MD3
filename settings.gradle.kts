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

include(":app")
include(":player")
include(":live")
include(":a2ui-compose")
project(":a2ui-compose").projectDir = file("a2ui-compose")

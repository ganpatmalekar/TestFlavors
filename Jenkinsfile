pipeline {
    agent any
    environment {
        APP_NAME = 'Test Flavor'
    }

    options {
        // Stop the build early in case of compile or test failures
        skipStagesAfterUnstable()
    }

    stages {
        stage('Compile') {
            steps {
                // Compile the app and its dependencies
                bat './gradlew compileAustraliaReleaseSources'
                bat './gradlew compileUaeReleaseSources'
                bat './gradlew compileSingaporeReleaseSources'
            }
        }
        stage('Build APK') {
            steps {
                // Finish building and packaging the APK
                bat 'ls -ltr'
                bat 'pwd'
                bat 'touch local.properties'
                bat './gradlew clean'
                bat './gradlew androidDependencies'
                bat './gradlew assembleDebug'

                // Archive the APKs so that they can be downloaded from Jenkins
                archiveArtifacts '**/*.apk'
            }
        }

        stage ('Generate release'){
            steps {
                bat 'ls -ltr'
                bat 'touch local.properties'
                bat './gradlew assembleRelease'
            }
        }
    }
}
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
                sh './gradlew compileReleaseSources'
            }
        }
        stage('Compile') {
            steps {
                // Compile the app and its dependencies
                sh './gradlew compileReleaseSources'
            }
        }
        stage('Build APK') {
            steps {
                // Finish building and packaging the APK
                sh 'ls -ltr'
                sh 'pwd'
                sh 'touch local.properties'
                sh './gradlew clean'
                sh './gradlew androidDependencies'
                sh './gradlew assembleDebug'

                // Archive the APKs so that they can be downloaded from Jenkins
                archiveArtifacts '**/*.apk'
            }
        }

        stage ('Generate release'){
            steps {
                sh 'ls -ltr'
                sh 'touch local.properties'
                sh './gradlew assembleRelease'
            }
        }
    }
}
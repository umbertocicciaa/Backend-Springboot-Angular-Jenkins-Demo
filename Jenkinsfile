pipeline {
    agent any
    stages {

        stage('Build') {
            steps {
                sh './gradlew clean build'
            }
        }

        stage('Test') {
            steps {
                sh './gradlew test'
            }
        }

        stage('Package') {
            steps {
                sh './gradlew bootWar'
            }
        }

        stage('Deploy to Dev') {
             steps {
                 sh 'scp build/libs/*.war user@dev-server:/path/to/dev/deploy'
             }
        }

        stage('Approval for Prod') {
              steps {
                   script {
                       input message: 'Approve deployment to production?', ok: 'Deploy'
                   }
              }
        }

        stage('Deploy to Prod') {
              steps{
                    sh 'scp build/libs/*.war user@prod-server:/path/to/prod/deploy'
              }
        }
    }
}
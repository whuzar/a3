pipeline {
    agent any

    tools {
        maven "mvn 3.9.2"
    }

    stages {
        stage('Build') {
            steps {
                sh "mvn clean compile"
            }
        }
        stage('Test') {
             steps {
                 sh "mvn test"
            }
        }
        stage('Deploy') {
             steps {
                 sh "mvn deploy"
            }
        }
    }
}

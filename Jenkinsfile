pipeline {
    agent { label 'java' }

    stages {
        stage('Clonar repositorio') {
            steps {
                git 'https://github.com/chris35franco/test-Java.git'
            }
        }

        stage('Compilar proyecto') {
            steps {
                sh 'mvn clean install'
            }
        }

        stage('Ejecutar pruebas') {
            steps {
                sh 'mvn test'
            }
        }
    }

    post {
        always {
            junit '**/target/surefire-reports/*.xml'
        }
    }
}



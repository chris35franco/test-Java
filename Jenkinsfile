pipeline {
    agent any
    stages {
        stage('Descargar código') {
            steps {
                git 'https://github.com/chris35franco/test-Java'
            }
        }
        stage('Compilar') {
            steps {
                sh './mvnw clean compile'  // o 'mvn clean compile' si no usas wrapper
            }
        }
        stage('Pruebas') {
            steps {
                sh './mvnw test'  // o 'mvn test'
            }
        }
    }
}

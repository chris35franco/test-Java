pipeline {
    agent { label 'java' }

    environment {
        MAVEN_OPTS = '-Dmaven.test.failure.ignore=false'
    }

    stages {
        stage('Verificar entorno') {
            steps {
                sh 'echo $PATH'
                sh 'java -version'
                sh 'mvn -version'
            }
        }

        stage('Clonar repositorio') {
            steps {
                git branch: 'main', url: 'https://github.com/chris35franco/test-Java.git'
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
}






pipeline {
    agent { label 'java' }

    environment {
        // Aquí puedes definir variables de entorno si necesitas
    }

    stages {
        stage('Clonar repositorio') {
            steps {
                echo 'Clonando repositorio...'
                git branch: 'main', url: 'https://github.com/chris35franco/test-Java.git'
            }
        }

        stage('Verificar entorno') {
            steps {
                echo 'Verificando Java y Maven...'
                sh 'java -version || true'
                sh 'mvn -v || true'
            }
        }

        stage('Compilar proyecto') {
            steps {
                echo 'Compilando proyecto con Maven...'
                sh 'mvn clean install'
            }
        }

        stage('Ejecutar pruebas') {
            steps {
                echo 'Ejecutando pruebas...'
                sh 'mvn test'
            }
        }
    }

    post {
        success {
            echo 'Pipeline ejecutado correctamente.'
        }
        failure {
            echo 'Hubo un error en el pipeline.'
        }
    }
}





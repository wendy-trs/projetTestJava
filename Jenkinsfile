pipeline {
    agent any
    
    tools {
        maven "Maven"
    }

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                git 'https://github.com/wendy-trs/projetTestJava.git'
                sh "mvn -Dmaven.test.failure.ignore=true clean package"
                sh 'ls -la'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
                sh 'make check || true' 
                junit '**/target/*.xml'
            }
        }
        stage('Archive') {
            steps {
                echo 'Archiving..'
                archiveArtifacts artifacts: 'testprojet-java', followSymlinks: false
            }
        }
    }
}

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
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
                sh 'make check || true' 
                junit '**/target/*.xml'
            }
        }
        stage('Deploy') {
            when {
              expression {
                currentBuild.result == null || currentBuild.result == 'SUCCESS' 
              }
            }
            steps {
                echo 'Deploying..'
                sh 'make publish'
            }
        }
    }
}

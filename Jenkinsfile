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
                sh 'ls -la target/surefire-reports'
            
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..' 
                sh 'make check || true' 
                junit '**/target/surefire-reports/TEST-*.xml'
            }
        }
        stage('Download') {
            when {
              expression {
                currentBuild.result == null || currentBuild.result == 'SUCCESS' 
              }
            }
            steps {
                echo 'Archiving..'
                archiveArtifacts artifacts: 'target/*.jar', followSymlinks: false
            }
        }
    }
}

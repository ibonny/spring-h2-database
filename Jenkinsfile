pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh './gradlew bootJar'
        sh 'ls -l'
      }
    }

  }
}
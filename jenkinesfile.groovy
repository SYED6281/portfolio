pipeline {
  agent any
  stages {
    stage('Checkout') {
      steps {
        git branch: 'main', url: 'https://github.com/SYED6281/portfolio.git'
      }
    }
    stage('Deploy') {
      steps {
        script {
          sh 'sudo cp -R * /var/www/html/'
        }
      }
    }
  }
  post {
    success {
      echo 'Website successfully deployed!'
    }
  }
}

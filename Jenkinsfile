node {
  def image

  properties(
    [
      pipelineTriggers([pollSCM('* * * * *')]),
      [
        $class: 'BuildDiscarderProperty', 
        strategy: [$class: 'LogRotator', daysToKeepStr: '2']
      ]
    ]
  );

  stage('Clone repository') {
    checkout scm
  }

  stage('Build') {
    sh "./mvnw clean install"
  }

  stage('Test') {
    sh "./mvnw test"
  }

  stage("Report tests") {
    junit allowEmptyResults: true, testResults: '**/TEST-*.xml'
  }

  stage('Build image') {
    image = docker.build('java-app-demo')
  }

  stage('Push image') {
    image.push("${env.BUILD_NUMBER}")
    image.push("latest")
  }

  stage('Deploy App') {

  }
}
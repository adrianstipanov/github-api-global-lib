import Terraform

def call(Map config=[:]) {
  Terraform terraform = new Terraform()
  
  pipeline {
    agent any
    
    stages {
      stage('Terraform: Init') {
        steps {
          script {
            tfScript(terraform) {
                echo this
                def initialize = init()
                echo initialize
                def buildNum = printBuildNumber()
                echo buildNum
            }
          }
        }
      }
    }
  }
}

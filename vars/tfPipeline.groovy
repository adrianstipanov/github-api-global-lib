import Terraform

def call(Map config=[:]) {
  Terraform terraform = new Terraform()
  
  pipeline {
    agent any
    
    stages {
      stage('Terraform: Init') {
        steps {
          script {
                def initialize = init()
                println initialize
                def buildNum = printBuildNumber()
                echo buildNum
            }
          }
        }
      }
    }
  }
}

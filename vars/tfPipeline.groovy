import Terraform

def call(Map config=[:]) {
  Terraform terraform = new Terraform()
  
  pipeline {
    stages {
      stage('Terraform: Init') {
        steps {
          script {
            tfScript(terraform) {
                echo env.GIT_COMMIT
                init()
                printBuildNumber()
            }
          }
        }
      }
    }
  }
}

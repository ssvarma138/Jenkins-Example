pipeline{
  agent any
  stages{
     stage('compile stage'){
        withMaven(maven : 'maven_3_6_0'){
          sh 'mvn clean compile'
        }
     }

     stage('testing stage') {
        withMaven(maven : 'maven_3_6_0'){
                  sh 'mvn test'
         }
     }

     stage('deploy stage') {
             withMaven(maven : 'maven_3_6_0'){
                       sh 'mvn deploy'
              }
          }




  }
}
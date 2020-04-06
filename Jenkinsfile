pipeline{
  agent any
  stages{
     stage('compile stage'){
       steps{
            def mvnHome = tool name: 'maven_3_6_3', type: 'maven'
         sh "${mvnHome}/bin/mvn clean compile "
          }
     }
     stage('testing stage') {
           steps{
                  def mvnHome = tool name: 'maven_3_6_3', type: 'maven'
              sh "${mvnHome}/bin/mvn test "

          }
     }

     stage('deploy stage') {
         steps{
                def mvnHome = tool name: 'maven_3_6_3', type: 'maven'
                 sh "${mvnHome}/bin/mvn deploy "

            }
          }




  }
}

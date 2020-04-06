pipeline{
  agent any
  stages{
     stage('compile stage'){
       
            def mvnHome = tool name: 'maven_3_6_3', type: 'maven'
         sh "${mvnHome}/bin/mvn clean compile "
          
     }
     stage('testing stage') {
           
                  def mvnHome = tool name: 'maven_3_6_3', type: 'maven'
              sh "${mvnHome}/bin/mvn test "

          
     }

     stage('deploy stage') {
         
                def mvnHome = tool name: 'maven_3_6_3', type: 'maven'
                 sh "${mvnHome}/bin/mvn deploy "

            
          }




  }
}

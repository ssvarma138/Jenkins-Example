pipeline{
  agent any
  
  tools {
    name: 'maven_3_6_3', type: 'maven'
  }
  stages{
     stage('compile stage'){
       
       steps{
         sh "mvn clean compile "
       }
          
     }
     stage('testing stage') {
           
       steps{
         sh "mvn test "
       }

          
     }

     stage('deploy stage') {
       steps{
         sh "mvn deploy "
         
       }
            
          }




  }
}

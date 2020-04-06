node {
   def mvnHome
   stage('Preparation') { // for display purposes
      // Get some code from a GitHub repository
      git 'https://github.com/ssvarma138/Jenkins-Example.git'
      // Get the Maven tool.
      // ** NOTE: This 'M3' Maven tool must be configured
      // **       in the global configuration.           
      mvnHome = tool 'maven_3_6_3'
   }
   stage('compile') {
      // Run the maven build
      withEnv(["MVN_HOME=$mvnHome"]) {
         
            sh '"$MVN_HOME/bin/mvn" clean package'
         
      }
   }
   stage ('Test'){
       withEnv(["MVN_HOME=$mvnHome"]) {
         
            sh '"$MVN_HOME/bin/mvn" test'
         
      }
   }
   
   
   
}

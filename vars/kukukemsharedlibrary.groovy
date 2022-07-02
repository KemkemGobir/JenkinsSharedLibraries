def call (string nodejsgoal){
  if ("${nodejsgoal}" == "Build") 
  {
    sh "echo Building Application"
    sh "npm install"
  }
  else if ("${nodejsgoal}" == "Test"
           {
              sh "echo Code testing"
             sh "npm run sonar"
           }
           else if ("${nodejsgoal}" == "Backup")
           {
             sh "echo Backup"
             sh "npm publish"
           }
  }
           

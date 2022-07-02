def call (String nodejsgoal){
  if ("${nodejsgoal}" == "Build") 
  {
    sh "npm install"
  }
  else if ("${nodejsgoal}" == "Test")
           {
             sh "npm run sonar"
           }
           else if ("${nodejsgoal}" == "Backup")
           {
             sh "npm publish"
           }
  }
           

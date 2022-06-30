def call(string mavengoal){
  if ("${mavengoal}"=="Build")
  {
    sh "mvn clean package"
  }
  else if ("${mavengoal}" == "Test")
  {
  sh "mvn sonar:sonar"
  }
  else if ("${mavengoal}" == "BackupNexus")
  {
  sh "mvn deploy"
  }
}

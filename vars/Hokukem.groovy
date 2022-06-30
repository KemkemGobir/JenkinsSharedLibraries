def call (stringname "mavengoal"){
  if (${"mavengoal"} == "Build")
  {
  sh "mvn package"
  }
  elseif (${"mavengoal"} == "Code Quality")
  {
   sh "mvn sonar:sonar"
  }
  elseif (${"mavengoal"} == "Backup")
  {
   sh "mvn deploy" 
  }       
}

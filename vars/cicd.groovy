def newGit(repo)
{
  git "${repo}"
}
def newMaven()
{
  sh'mvn package,
}
def newDeploy(workspace,ip,context)
{
  sh"scp/var/lib/jenkins/workspace/${workspace}/wepapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat9/webapp/${context}.war"
}
def runSelenium(workspace)
{
  sh"java -jar/var/lib/jenkins/workspace/${workspace}/testing.jar"
}

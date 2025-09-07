def call(String projectname, String Imagetag, String dockerhubuser)
{
  sh "docker build -t ${dockerhubuser}/${projectname}:${Imagetag} ."
}

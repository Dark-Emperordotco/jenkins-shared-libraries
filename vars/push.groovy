def call(String project, String Imagetag, String dockerhubuser)
{
    withCredentials([usernamePassword('credentialsId':"dockerhubcred", passwordVariable:"dockerhubpass", usernameVariable:"dockerhubuser")]){   
    sh "docker login -u ${dockerhubuser} -p ${dockerhubpass}"
  }
    sh "docker push ${dockerhubuser}/${project}:${Imagetag}"
}

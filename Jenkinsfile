pipeline {

environment{
       registry="richa1603/test_repo1"
       registryCredential='dockerhub'
       dockerImage='' 
       dockerImageLatest=''
     }
    agent any
  
  
    
    
    stages {

	 stage('Cloning Git') {
      steps {
        git 'https://github.com/RichaJha1603/devops_calculator.git'
      }
	 }

        stage ('Compile Stage') {

            steps {
                
                    sh 'mvn clean compile'
                
            }
        }

        stage ('Testing Stage') {

            steps {
                
                    sh 'mvn test'
                
            }
        }
          
       stage ('Building image')
        {
           steps{
                 script {
                      dockerImage=docker.build registry + ":$BUILD_NUMBER"
                      dockerImageLatest=docker.build registry + ":latest"
                   }
               }
         }

          stage('Deploy Image') {
             steps{
                 script{
                      docker.withRegistry('',registryCredential){
                      dockerImage.push()
                      dockerImageLatest.push()
                     }
                 }
             }
          }
    
           stage('Removing Unused docker image'){
            steps{
                sh "docker rmi $registry:$BUILD_NUMBER"
            }
        }

           
                                 
stage('Executing Rundeck Jobs'){
                  steps{
                     script{
                           step([$class: "RundeckNotifier",
                                 includeRundeckLogs:true,
                                 jobId: "3bf2209a-9885-4c00-b1f1-d23f573b9b66",
                                 rundeckInstance: "Rundeck",
                                 shouldFailTheBuild:true,
                                 shouldWaitForRundeckJob:true,
                                 tailLog:true])
                             }
                      }
                }
                                 
     
  


        
    }
       post { 
        always { 
            echo 'I will always say Hello again!'
                
        }
    }
}

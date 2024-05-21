//prettier-ignore
pipeline {
    agent any
    
    stages {
        
        stage('github-clone') {
            steps {
                git branch: 'master', credentialsId: 'github_token', url: 'https://github.com/bigstar9906/ActionTest'
            }
        }
        
	stage('test'){
		steps{
             sh '''
                fuser -k 8080/tcp || true
                sudo chmod +x gradlew
                ./gradlew build
                cd build/libs
                ls
                export BUILD_ID=dontKillMe
                nohup java -jar demo-0.0.1-SNAPSHOT.jar &
                '''
		}
	}	 
   	}
}

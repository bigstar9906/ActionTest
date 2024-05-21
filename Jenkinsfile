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
			sudo fuser -k 8080/tcp || true
            chmod +x gradlew
            ./gradlew clean build
            cd build/libs
            nohup java -jar demo-0.0.1-SNAPSHOT.jar > nohup.out 2> nohup.err < /dev/null &
		}
	}	 
   	}
}

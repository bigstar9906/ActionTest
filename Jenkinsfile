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
                export JENKINS_NODE_COOKIE=dontKillMe
                echo "nohup java -jar demo-0.0.1-SNAPSHOT.jar &" > start-jar-in-background.sh
                sh start-jar-in-background.sh
                '''
		}
	}	 
   	}
}

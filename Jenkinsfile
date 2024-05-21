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
			echo 'Testing...'
            echo 'Testing2...'
            echo 'Testing3...'
            echo 'ReClone?'
		}
	}	 
   	}
}

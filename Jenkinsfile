node {
	stage('git'){
		git branch: 'master',
   		credentialsId: 'gitcredentialid',
    	url: 'https://github.com/bhagyashreesharma/jenkinsDemo.git'
	}
	
	stage('maven'){
		withSonarQubeEnv('localhost_sonar'){
			sh "mvn clean install sonar:sonar"
		}
	}
	
	stage('quality gate'){
			timeout(time:2, unit:'MINUTES'){
			waitForQualityGate abortPipeline:true
			}
		
	}
}
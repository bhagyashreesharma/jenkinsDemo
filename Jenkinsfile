node {
	stage('git'){
		git branch: 'master',
   		credentialsId: 'gitcredentialid',
    	url: 'https://github.com/bhagyashreesharma/jenkinsDemo.git'
	}
	
	stage('maven'){
		sh "mvn clean install sonar:sonar"
	}
	
	stage('quality gate'){
		steps{
			timeout(time:2, unit:'MINUTES'){
			waitForQualityGate abortPipeline:true
			}
		}
	}
}
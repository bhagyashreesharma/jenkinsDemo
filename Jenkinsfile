node {
	try{
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
			timeout(time:5, unit:'MINUTES'){
				def qg = waitForQualityGate() 
           		if (qg.status != 'OK') {
            		 error "Pipeline aborted due to quality gate failure: ${qg.status}"
           		}
			}
	}
	}catch(err){
		emailext body: ${err}, subject: 'Jenkins email', to: 'bhagyashreesharma90@gmail.com'
	}
}

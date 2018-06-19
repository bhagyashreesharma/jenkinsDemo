node {
	stage('git'){
		checkout scm
	}
	
	stage('maven'){
		sh "mvn clean install"
	}
}
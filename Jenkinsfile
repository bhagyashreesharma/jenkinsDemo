node {
	stage('git'){
		checkout scm
	}
	
	stage('maven'){
		mvn clean install
	}
}
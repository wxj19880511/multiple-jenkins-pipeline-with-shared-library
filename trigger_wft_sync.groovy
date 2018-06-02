#!/usr/local/bin/groovy

"echo ${stream_version}-${branch}".execute()
"/usr/local/bin/wget -nc $JENKINS_URL:8080/jnlpJars/jenkins-cli.jar".execute()
"java -jar jenkins-cli.jar -s  $JENKINS_URL build ${stream_version}-${branch} -v -s -f".execute()
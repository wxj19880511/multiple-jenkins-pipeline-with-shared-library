multibranchPipelineJob('example') {
    branchSources {
        git {
            remote('https://github.com/wxj19880511/multiple-jenkins-pipeline-with-shared-library.git')
            credentialsId('github')
            includes('*')
        }
    }
    orphanedItemStrategy {
        discardOldItems {
            numToKeep(20)
        }
    }
}
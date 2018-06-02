multibranchPipelineJob('example') {
    branchSources {
        git {
            remote('https://github.com/wxj19880511/multiple-jenkins-pipeline-with-shared-library.git')
            credentialsId('github')
            includes('* v*')
        }
    }
    orphanedItemStrategy {
        discardOldItems {
            numToKeep(20)
        }
    }

    factory {
        workflowBranchProjectFactory {
        // Relative location within the checkout of your Pipeline script.
        scriptPath('jenkinsfile')
        }
    }
}
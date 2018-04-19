job('lab01') {
    description 'projet NodeJS01'
    scm {
        git('URL GIT'){node ->
            node / gitConfigName('vincent')
            node / gitConfigEmail('vincent@estiam.com')        
        }
    }
    triggers{
        scm('H/15 * * * *')
    }
     wrappers {
        nodejs('Nodejs')
    }
    steps{
        shell('npm install')        
    }
}

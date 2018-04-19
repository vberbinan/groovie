job('lab01') {
    description 'projet NodeJS01'
    scm {
        git('https://github.com/vberbinan/NodeJS.git'){node ->
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

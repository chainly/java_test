# java_test

## use eclipse with git

> ref: https://www.jianshu.com/p/acb00e4c7301

Q: Error connecting project t3, no Git repositories found?  
A: https://stackoverflow.com/a/45278119/6493535 ==> **local repository location as workspace location**


## main

Q: no promote but only for x.
A: Window ！！> Preferences ！！> Java ！！> Editor ！！> Content Assist, then add `.abcdefghijklmnopqrstuvwxyz` to `auto activation triggers for java`

## io

### read in

Q: Unhandled exception type IOException
A: 1. add `try catch` to handle IOException
2. or add `throws IOException` to let called to handle it

### print out
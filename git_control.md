# Working doc on git control in NetBeans
In the following we will walk through git processes
1) if you are just starting to use the project then do "Fork" -> "Clone" first
2) on a regular bases you just use "Commit" 
   Note: You only do "New Pull Request" when you have finished a "feature"

## Fork 
URL: https://github.com/BrandonBenge/locker-db
"on the top right you will see fork"

## Clone to local 
Team -> Git -> Clone 
URL to use: https://github.com/<your user\>/locker-db.git

## Commit

### Local interaction with Fork
Team -> commit
"add comments about what you are doing"

Team -> Remote -> Push to Upstream
"This will add to your fork"

### Bring Forks together
"go to your branch online:"
"https://github.com/<your user\>/locker-db"

#### New Pull Request

#### Since this is a Locker project we will use Gene's repo as the HEAD location
set base fork to: "GeneBuchite/locker-db"
set base: "master"

set head fork to: "\<your user\>/locker-db
set compare: "master"

#### Create pull request
"then we just wait on Gene to approve so that he knows what we did"



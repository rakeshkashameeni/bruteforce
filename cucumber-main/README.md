# Used Mac operating system
# Build tool Gradle
# intellij idea community edition (IDE) open-source
# Install Software open-source 
# JDK 11

# How to run test
- JDK 11
- Latest Intellij IDEA
- go to github url, After cloning, open cucumber folder in intellij
- execute "./gradlew test" command

# How to View Report
View go to this directory
"target/cucumber-report.html"

# CI - CD
- clone repo
- ./gradlew test
- save report
- 
# dependencies
    cucumber-java:6.10.4'
    cucumber-junit:6.10.4'
    cucumber-picocontainer:6.10.4'
    selenium-java:3.141.59'
    javafaker:0.15'
    bonigarcia:webdrivermanager:5.0.3"

# external lib
- gson from google
- apache commons - file/string
- jackson - xml processing
- faker - random data
- log4j - logging framework

# Filtering tests
- can be done using tags

# remote webdriver 
- Execution in grid or cloud (browserstack)
- driver = new RemoteWebdriver(new url(""))

# Config manager 
- create seperate prop files for each enviornment
  and load accordingly
- use props
- variables management (e.g. variables)
- System.getProperty("")

# Logging 
- log4j

# Hooks can be used for before and after steps

# parallel execution
- in gradle, maxParallelForks = 2
- threadCount/fork - maven surefire plugin(for maven build)

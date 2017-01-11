# sshj.osgi.tests
Tests how sshj behaves in an OSGI environment

# How to use
1. Check out the source code of [sshj](https://github.com/hierynomus/sshj).
1. Adjust the `sshj.version` property in sshj.osgi.tests/pom.xml to match the check out sshj code. 
1. Build `sshj` and copy its artifacts to your local maven repository: `sshj/gradlew publishToMavenLocal`.
1. Run tests for OSGI environment: `mvn -f sshj.osgi.tests verify`. You may wish to specify the version of sshj under test on the command-line, like this `mvn -f sshj.osgi.tests -Dsshj.version=0.19.2-dev.5+ac2720b verify`
1. Fix errors in sshj and continue with step 3.


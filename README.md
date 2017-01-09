# sshj.osgi.tests
Tests how sshj behaves in an OSGI environment

# How to use

1. Check out the source code of [sshj](https://github.com/hierynomus/sshj)
1. Build `sshj` and copy its artifacts to your local maven repository: `sshj/gradlew publishToMavenLocal`
1. Run tests for OSGI environment: `mvn -f  sshj.osgi.tests verify`
1. Fix errors in sshj and continue with step 2


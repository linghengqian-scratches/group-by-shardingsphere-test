## This git serves https://github.com/apache/shardingsphere/issues/22450
- In the jdk 17 environment, execute `./mvnw clean test` to verify the problem.
- The `group by` operation cannot be performed on the datatime type in MySQL and H2database
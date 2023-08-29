## This git serves https://github.com/apache/shardingsphere/issues/22451
- In the jdk 17 environment, execute `./mvnw clean test` to verify the problem.
- The `group by` operation cannot be performed on the datatime type in MySQL and H2database

```shell
$ ./mvnw clean test
[INFO] Scanning for projects...
[INFO] 
[INFO] ---------------< com.lingh:group-by-shardingsphere-test >---------------
[INFO] Building group-by-shardingsphere-test 0.0.1-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-clean-plugin:3.2.0:clean (default-clean) @ group-by-shardingsphere-test ---
[INFO] Deleting /home/linghengqian/TwinklingLiftWorks/git/public/group-by-shardingsphere-test/target
[INFO] 
[INFO] --- maven-resources-plugin:3.2.0:resources (default-resources) @ group-by-shardingsphere-test ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Using 'UTF-8' encoding to copy filtered properties files.
[INFO] Copying 1 resource
[INFO] Copying 2 resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.10.1:compile (default-compile) @ group-by-shardingsphere-test ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 1 source file to /home/linghengqian/TwinklingLiftWorks/git/public/group-by-shardingsphere-test/target/classes
[INFO] 
[INFO] --- maven-resources-plugin:3.2.0:testResources (default-testResources) @ group-by-shardingsphere-test ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Using 'UTF-8' encoding to copy filtered properties files.
[INFO] skip non existing resourceDirectory /home/linghengqian/TwinklingLiftWorks/git/public/group-by-shardingsphere-test/src/test/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.10.1:testCompile (default-testCompile) @ group-by-shardingsphere-test ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 1 source file to /home/linghengqian/TwinklingLiftWorks/git/public/group-by-shardingsphere-test/target/test-classes
[INFO] 
[INFO] --- maven-surefire-plugin:2.22.2:test (default-test) @ group-by-shardingsphere-test ---
[INFO] 
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running com.lingh.groupbyshardingspheretest.GroupByShardingsphereTestApplicationTests
08:37:06.107 [main] DEBUG org.springframework.test.context.BootstrapUtils - Instantiating CacheAwareContextLoaderDelegate from class [org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate]
08:37:06.118 [main] DEBUG org.springframework.test.context.BootstrapUtils - Instantiating BootstrapContext using constructor [public org.springframework.test.context.support.DefaultBootstrapContext(java.lang.Class,org.springframework.test.context.CacheAwareContextLoaderDelegate)]
08:37:06.169 [main] DEBUG org.springframework.test.context.BootstrapUtils - Instantiating TestContextBootstrapper for test class [com.lingh.groupbyshardingspheretest.GroupByShardingsphereTestApplicationTests] from class [org.springframework.boot.test.context.SpringBootTestContextBootstrapper]
08:37:06.179 [main] INFO org.springframework.boot.test.context.SpringBootTestContextBootstrapper - Neither @ContextConfiguration nor @ContextHierarchy found for test class [com.lingh.groupbyshardingspheretest.GroupByShardingsphereTestApplicationTests], using SpringBootContextLoader
08:37:06.183 [main] DEBUG org.springframework.test.context.support.AbstractContextLoader - Did not detect default resource location for test class [com.lingh.groupbyshardingspheretest.GroupByShardingsphereTestApplicationTests]: class path resource [com/lingh/groupbyshardingspheretest/GroupByShardingsphereTestApplicationTests-context.xml] does not exist
08:37:06.184 [main] DEBUG org.springframework.test.context.support.AbstractContextLoader - Did not detect default resource location for test class [com.lingh.groupbyshardingspheretest.GroupByShardingsphereTestApplicationTests]: class path resource [com/lingh/groupbyshardingspheretest/GroupByShardingsphereTestApplicationTestsContext.groovy] does not exist
08:37:06.184 [main] INFO org.springframework.test.context.support.AbstractContextLoader - Could not detect default resource locations for test class [com.lingh.groupbyshardingspheretest.GroupByShardingsphereTestApplicationTests]: no resource found for suffixes {-context.xml, Context.groovy}.
08:37:06.184 [main] INFO org.springframework.test.context.support.AnnotationConfigContextLoaderUtils - Could not detect default configuration classes for test class [com.lingh.groupbyshardingspheretest.GroupByShardingsphereTestApplicationTests]: GroupByShardingsphereTestApplicationTests does not declare any static, non-private, non-final, nested classes annotated with @Configuration.
08:37:06.229 [main] DEBUG org.springframework.test.context.support.ActiveProfilesUtils - Could not find an 'annotation declaring class' for annotation type [org.springframework.test.context.ActiveProfiles] and class [com.lingh.groupbyshardingspheretest.GroupByShardingsphereTestApplicationTests]
08:37:06.294 [main] DEBUG org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider - Identified candidate component class: file [/home/linghengqian/TwinklingLiftWorks/git/public/group-by-shardingsphere-test/target/classes/com/lingh/groupbyshardingspheretest/GroupByShardingsphereTestApplication.class]
08:37:06.298 [main] INFO org.springframework.boot.test.context.SpringBootTestContextBootstrapper - Found @SpringBootConfiguration com.lingh.groupbyshardingspheretest.GroupByShardingsphereTestApplication for test class com.lingh.groupbyshardingspheretest.GroupByShardingsphereTestApplicationTests
08:37:06.383 [main] DEBUG org.springframework.boot.test.context.SpringBootTestContextBootstrapper - @TestExecutionListeners is not present for class [com.lingh.groupbyshardingspheretest.GroupByShardingsphereTestApplicationTests]: using defaults.
08:37:06.383 [main] INFO org.springframework.boot.test.context.SpringBootTestContextBootstrapper - Loaded default TestExecutionListener class names from location [META-INF/spring.factories]: [org.springframework.boot.test.mock.mockito.MockitoTestExecutionListener, org.springframework.boot.test.mock.mockito.ResetMocksTestExecutionListener, org.springframework.boot.test.autoconfigure.restdocs.RestDocsTestExecutionListener, org.springframework.boot.test.autoconfigure.web.client.MockRestServiceServerResetTestExecutionListener, org.springframework.boot.test.autoconfigure.web.servlet.MockMvcPrintOnlyOnFailureTestExecutionListener, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverTestExecutionListener, org.springframework.boot.test.autoconfigure.webservices.client.MockWebServiceServerTestExecutionListener, org.springframework.test.context.web.ServletTestExecutionListener, org.springframework.test.context.support.DirtiesContextBeforeModesTestExecutionListener, org.springframework.test.context.event.ApplicationEventsTestExecutionListener, org.springframework.test.context.support.DependencyInjectionTestExecutionListener, org.springframework.test.context.support.DirtiesContextTestExecutionListener, org.springframework.test.context.transaction.TransactionalTestExecutionListener, org.springframework.test.context.jdbc.SqlScriptsTestExecutionListener, org.springframework.test.context.event.EventPublishingTestExecutionListener]
08:37:06.403 [main] INFO org.springframework.boot.test.context.SpringBootTestContextBootstrapper - Using TestExecutionListeners: [org.springframework.test.context.web.ServletTestExecutionListener@7fc4780b, org.springframework.test.context.support.DirtiesContextBeforeModesTestExecutionListener@3b79fd76, org.springframework.test.context.event.ApplicationEventsTestExecutionListener@48c76607, org.springframework.boot.test.mock.mockito.MockitoTestExecutionListener@43599640, org.springframework.boot.test.autoconfigure.SpringBootDependencyInjectionTestExecutionListener@1f81aa00, org.springframework.test.context.support.DirtiesContextTestExecutionListener@6b6776cb, org.springframework.test.context.transaction.TransactionalTestExecutionListener@1863d2fe, org.springframework.test.context.jdbc.SqlScriptsTestExecutionListener@1787bc24, org.springframework.test.context.event.EventPublishingTestExecutionListener@544d57e, org.springframework.boot.test.mock.mockito.ResetMocksTestExecutionListener@55c53a33, org.springframework.boot.test.autoconfigure.restdocs.RestDocsTestExecutionListener@53b7f657, org.springframework.boot.test.autoconfigure.web.client.MockRestServiceServerResetTestExecutionListener@797b0699, org.springframework.boot.test.autoconfigure.web.servlet.MockMvcPrintOnlyOnFailureTestExecutionListener@5a37d3ed, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverTestExecutionListener@26df6e3a, org.springframework.boot.test.autoconfigure.webservices.client.MockWebServiceServerTestExecutionListener@4a3631f8]
08:37:06.406 [main] DEBUG org.springframework.test.context.support.AbstractDirtiesContextTestExecutionListener - Before test class: context [DefaultTestContext@6c61a903 testClass = GroupByShardingsphereTestApplicationTests, testInstance = [null], testMethod = [null], testException = [null], mergedContextConfiguration = [WebMergedContextConfiguration@658c5a19 testClass = GroupByShardingsphereTestApplicationTests, locations = '{}', classes = '{class com.lingh.groupbyshardingspheretest.GroupByShardingsphereTestApplication}', contextInitializerClasses = '[]', activeProfiles = '{}', propertySourceLocations = '{}', propertySourceProperties = '{org.springframework.boot.test.context.SpringBootTestContextBootstrapper=true}', contextCustomizers = set[org.springframework.boot.test.context.filter.ExcludeFilterContextCustomizer@ae13544, org.springframework.boot.test.json.DuplicateJsonObjectContextCustomizerFactory$DuplicateJsonObjectContextCustomizer@587e5365, org.springframework.boot.test.mock.mockito.MockitoContextCustomizer@0, org.springframework.boot.test.web.client.TestRestTemplateContextCustomizer@707194ba, org.springframework.boot.test.autoconfigure.actuate.metrics.MetricsExportContextCustomizerFactory$DisableMetricExportContextCustomizer@7ee8290b, org.springframework.boot.test.autoconfigure.properties.PropertyMappingContextCustomizer@0, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverContextCustomizerFactory$Customizer@31f9b85e, org.springframework.boot.test.context.SpringBootTestArgs@1, org.springframework.boot.test.context.SpringBootTestWebEnvironment@66a3ffec], resourceBasePath = 'src/main/webapp', contextLoader = 'org.springframework.boot.test.context.SpringBootContextLoader', parent = [null]], attributes = map['org.springframework.test.context.web.ServletTestExecutionListener.activateListener' -> true]], class annotated with @DirtiesContext [false] with mode [null].

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::               (v2.7.15)

2023-08-29 08:37:06.738  INFO 18542 --- [           main] roupByShardingsphereTestApplicationTests : Starting GroupByShardingsphereTestApplicationTests using Java 17.0.8 on DESKTOP-PNK8EKR with PID 18542 (started by linghengqian in /home/linghengqian/TwinklingLiftWorks/git/public/group-by-shardingsphere-test)
2023-08-29 08:37:06.741  INFO 18542 --- [           main] roupByShardingsphereTestApplicationTests : No active profile set, falling back to 1 default profile: "default"
2023-08-29 08:37:08.732  INFO 18542 --- [           main] roupByShardingsphereTestApplicationTests : Started GroupByShardingsphereTestApplicationTests in 2.281 seconds (JVM running for 3.414)
2023-08-29 08:37:09.120  INFO 18542 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2023-08-29 08:37:09.423  INFO 18542 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-2 - Starting...
2023-08-29 08:37:09.572  INFO 18542 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-2 - Start completed.
2023-08-29 08:37:09.661  INFO 18542 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-3 - Starting...
2023-08-29 08:37:09.686  INFO 18542 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-3 - Start completed.
2023-08-29 08:37:11.201  INFO 18542 --- [           main] com.zaxxer.hikari.pool.PoolBase          : HikariPool-1 - Driver does not support get/set network timeout for connections. (getNetworkTimeout)
2023-08-29 08:37:11.203  INFO 18542 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
[INFO] Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 6.241 s - in com.lingh.groupbyshardingspheretest.GroupByShardingsphereTestApplicationTests
2023-08-29 08:37:12.307  INFO 18542 --- [ionShutdownHook] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Shutdown initiated...
2023-08-29 08:37:12.319  INFO 18542 --- [ionShutdownHook] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Shutdown completed.
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 3, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  11.003 s
[INFO] Finished at: 2023-08-29T08:37:13+08:00
[INFO] ------------------------------------------------------------------------
```
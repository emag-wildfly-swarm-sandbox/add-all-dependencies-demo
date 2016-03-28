# add-all-dependencies-demo

WildFly Swarm addAllDependencies Demo

Add hibernate-core dependency. thrown `ClassCastException: org.dom4j.DocumentFactory cannot be cast to org.dom4j.DocumentFactory`

``` sh
$ ./mvnw clean wildfly-swarm:run
```

or Arquillian Test

``` sh
$ ./mvnw clean verify
```
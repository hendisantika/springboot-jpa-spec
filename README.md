# springboot-jpa-spec
# jpa-spec

> The jpa-spec repository was created in order to provide sample data to be
> used with a DZone article designed to communicate the benefits of Spring Data, 
> JPA and Specifications. 
> 
> The full DZone article can be found here:
> https://dzone.com/articles/specifications-to-the-rescue

## Using This Repository

The repository is a Spring Boot application, which can be executed by running the `JpaSpecApplication` files in the `com.hendisantika.springbootjpaspec` package.  

When the application starts, an in-memory H2 database will be created and initialized with some default data.  The inserts for this data can be found in the `src\main\resources\data.sql` file.

## RESTful EndPoints

Once the application is running, simply launch the following URL to see unfiltered data:

`http://localhost:8080/members`

If you wish to see only active members, launch the following URL:

`http://localhost:8080/members?active=true` (false will return inactive members)

If you wish to search for a partial zip code, use the following URL:

`http://localhost:8080/members?zipFilter=902` (to locate zip codes which start with 902)

If you wish to search for a string, use the following URL:

`http://localhost:8080/members?searchString=tennis` (will find the string 'tennis' in the interest field or the name of a class)

Finally, these filters can be combined, as shown below:

`http://localhost:8080/members?active=true&zipFilter=902&searchString=tennis` (active members, in 902 zip code with a search of 'tennis')

## Running Specification Tests

The `JpaSpecificationApplicationTests` class includes four tests that are executed against a dataset which is populated 
within the `init()` method of the same class.  The tests are intended to validate and provide code coverage for the 
`BaseSpecification` and `MemberSpecification` classes.

The tests can be executed using the following maven command:

`mvn clean test`

Upon successful execution, the following information will be provided:

```
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 0, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  7.984 s
[INFO] Finished at: 2020-05-13T08:19:55+07:00
[INFO] ------------------------------------------------------------------------

```

## More About JPA

The following guide illustrates how to use some features concretely:

* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)

Made with ♥ by johnjvester.
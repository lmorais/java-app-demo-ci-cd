## Spring Boot Demo Application


### How to run?


### Dependencies:

	- Docker


### Compile and build Docker image:

```
> ./mvnw clean install

> docker build . -t java-app-demo

```

### Run app:

```
> docker run --rm -it -p 8080:8080 java-app-demo

```
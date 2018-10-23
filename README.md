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
> mv run.sh.sample run.sh

> chmod +x run.sh

> ./run.sh

```
#  210619025-coursework

Based upon https://github.com/sajeerzeji/SpringBoot-GRPC
Commands for preparing the enviornment (Assuming you are in the main folder e.g. the one with the pom.xml file in it)
1. sudo apt update
2. sudo apt install default-jdk maven
3. sudo apt install git
4. git clone https://github.com/bineeta-maker/210619025-coursework
5. (From grpc-server folder) mvn package -Dmaven.test.skip=true
6. (From grpc-server folder) chmod 777 mvnw
7. (From grpc-server folder) ./mvnw spring-boot:run -Dmaven.test.skip=true
8. (From grpc-client folder e.g. seperate ssh connection) mvn package -Dmaven.test.skip=true
9. (From grpc-client folder e.g. seperate ssh connection) chmod 777 mvnw
10. (From grpc-client folder e.g. seperate ssh connection) ./mvnw spring-boot:run -Dmaven.test.skip=true


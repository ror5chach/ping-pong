# ping-pong

### Build the JAR
./gradlew clean build

### Build the image
docker build -t pingpong:server .

### Start the container
docker run -d -p 8080:8080 pingpong:server

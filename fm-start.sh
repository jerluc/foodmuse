mkfifo backpipe
nc -l 80 0<backpipe | nc localhost 8080 1>backpipe

java -jar target/foodmuse-distro-*.jar server prod.yml
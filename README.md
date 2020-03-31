SPRINGBOOG BOOK
=====
#Machine Setup

This example hardcode redishost inside code, please edit /etc/hosts to point to redis
redis = new RegisterRedis("redis://redishost:6379");

##สำหรับคนใช้ OS X
```
 > brew cask install java
 > brew cask install intellij-idea-ce
 > brew install maven
 > brew install protobuf
```


##สำหรับคนใช้ Windows (Power Shell)
```
 > Set-ExecutionPolicy RemoteSigned -scope CurrentUser
 > Invoke-Expression (New-Object System.Net.WebClient).DownloadString('https://get.scoop.sh/')
 > scoop bucket add java
 > scoop install openjdk
 > scoop install maven
 > scoop bucket add extras
 > scoop install protobuf
```

run
java -jar springboot-book-1.0.jar -Xmx128M -Xms128M
java -jar target/springboot-book-1.0.jar -Xmx1G -Xms1G



##ProtobufCompile
```
protoc --java_out=src/main/java protobuf/*.proto
```




##Load Test
```$xslt
ab -c 120 -n 10000 -k http://localhost:8080/verify/APP-DEMO-1-N
ab -c 60 -n 100000 -k http://localhost:8080/register/light/510000000236/Peerapat/Asoktummarungsri/20190101/ME0111111

ab -c 30 -n 100000 -k http://localhost:8080/register/light/510000000236/Peerapat/Asoktummarungsri/20190101/ME0111111

wrk -t12 -c60 -d100s http://localhost:8080/register/light/510000000236/Peerapat/Asoktummarungsri/20190101/ME0111111

ab -c 120 -n 100000 -k http://localhost:8080/register/light/510000000236/Peerapat/Asoktummarungsri/20190101/ME0111111

ab -c 60 -n 10000 -k http://localhost:8080/register/redis/510000000236/Peerapat/Asoktummarungsri/20190101/ME0111111
ab -c 20 -n 100000 -k http://localhost:8080/register/redis/510000000236/Peerapat/Asoktummarungsri/20190101/ME0111111
```


@ COPYRIGHT 2020, PEERAPAT ASOKTUMMARUNGSRI

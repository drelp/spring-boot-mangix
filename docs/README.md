```shell
git pull
mvn clean package
mysql -h127.0.0.1 -uroot -p
# 2022

java -jar target/spring-boot-mangix-1.0.jar --spring.profiles.active=prod

#!/bin/bash

git pull
mvn clean package

ps -ef|grep spring-boot-mangix|grep java|awk '{print $2}'|xargs kill -9

nohup java -jar target/spring-boot-mangix-1.0.jar --spring.profiles.active=prod &
```
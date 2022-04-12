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

docker pull ccr.ccs.tencentyun.com/bk.io/paas-standalone:latest
docker run -d --name="bk-paas" -p 8070-8073:8000-8003 ccr.ccs.tencentyun.com/bk.io/paas-standalone:latest
docker run -d --name="bk-paas" -p 8000-8003:8000-8003 ccr.ccs.tencentyun.com/bk.io/paas-standalone:latest
docker exec -it bk-paas sh
docker logs -f bk-paas
# appengine 8000/ paas 8001 / esb 8002 / login 8003
docker stop bk-paas
```

```
参数引擎
```
drop database if exists mangix;
drop user 'mangix'@'127.0.0.1';
-- 支持emoji：需要mysql数据库参数： character_set_server=utf8mb4
create database mangix default character set utf8mb4 collate utf8mb4_unicode_ci;
use mangix;
create user 'mangix'@'127.0.0.1' identified by 'mangix123456';
grant all privileges on mangix.* to 'mangix'@'127.0.0.1';
flush privileges;
SET NAMES utf8mb4;
use mangix;

CREATE TABLE `config` (
    `config_id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键ID',
    `key` varchar(16) NOT NULL DEFAULT '' COMMENT 'key',
    `value` varchar(256) NOT NULL DEFAULT '' COMMENT 'value',
    `status` tinyint NOT NULL DEFAULT '0' COMMENT '状态 -1-删除 1-正常',
    `operator_id` int NOT NULL DEFAULT '0' COMMENT '操作人ID',
    `operator` varchar(20) NOT NULL DEFAULT '' COMMENT '操作人 记录操作人用户名，程序自动执行时记system',
    `comment` varchar(100) NOT NULL DEFAULT '' COMMENT '备注(如：基站描述)',
    `create_time` int NOT NULL DEFAULT '0' COMMENT '创建时间',
    `update_time` int NOT NULL DEFAULT '0' COMMENT '更新时间',
    PRIMARY KEY (`config_id`),
    UNIQUE KEY `idx_key` (`key`),
    KEY `idx_st_ct` (`status`,`create_time`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='config';

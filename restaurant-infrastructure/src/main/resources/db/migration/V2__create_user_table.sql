CREATE TABLE user (
    `id` bigint(20) PRIMARY KEY NOT NULL AUTO_INCREMENT COMMENT '主键，自增id',
    name VARCHAR(191) NOT NULL,
    user_type VARCHAR(191) NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL COMMENT '创建时间',
    `updated_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    INDEX `ix_name` (`name`),
    INDEX `ix_created_at` (`created_at`),
    INDEX `ix_updated_at` (`updated_at`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COMMENT='用户（顾客，服务员，厨师）';

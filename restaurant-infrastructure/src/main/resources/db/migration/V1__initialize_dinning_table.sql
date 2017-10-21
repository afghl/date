CREATE TABLE dining (
    `id` bigint(20) PRIMARY KEY NOT NULL AUTO_INCREMENT COMMENT '主键，自增id',
    table_id bigint(20) DEFAULT '0' NOT NULL,
    status VARCHAR(191) NOT NULL,
    started_at DATETIME COMMENT '开始时间',
    ended_at DATETIME COMMENT '结束时间',
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL COMMENT '创建时间',
    `updated_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    INDEX `ix_table_id` (`table_id`),
    INDEX `ix_started_at` (`started_at`),
    INDEX `ix_ended_at` (`ended_at`),
    INDEX `ix_created_at` (`created_at`),
    INDEX `ix_updated_at` (`updated_at`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COMMENT='一次用餐的实体';

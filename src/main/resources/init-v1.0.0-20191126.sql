# Dump of table 学员（Student）
# ------------------------------------------------------------

DROP TABLE IF EXISTS Student;

CREATE TABLE IF NOT EXISTS Student(`id` varchar(99) COMMENT 'ID',`loginName` text COMMENT '登录名',`loginPassword` text COMMENT '登录密码',`createdAt` bigint COMMENT '创建时间',`updatedAt` bigint COMMENT '上次更新时间',PRIMARY KEY(id)) COMMENT='学员';

# Dump of table 班级（Grade）
# ------------------------------------------------------------

DROP TABLE IF EXISTS Grade;

CREATE TABLE IF NOT EXISTS Grade(`id` varchar(99) COMMENT 'ID',`name` text COMMENT '班级名称',`desc` text COMMENT '班级描述',`createdAt` bigint COMMENT '创建时间',`updatedAt` bigint COMMENT '上次更新时间',PRIMARY KEY(id)) COMMENT='班级';


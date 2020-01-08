ALTER TABLE `rzqh`.`dept`
ADD COLUMN `supervisor` varchar(255) NULL COMMENT '主管' AFTER `create_time`,
ADD COLUMN `charge` varchar(255) NULL COMMENT '负责人' AFTER `supervisor`;
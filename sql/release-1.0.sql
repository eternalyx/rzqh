-- sql file

AlTER TABLE `user` ADD `contract_time_begin` datetime NULL DEFAULT NULL COMMENT '合同开始日期';
AlTER TABLE `user` ADD `contract_time_end` datetime NULL DEFAULT NULL COMMENT '合同结束日期';
AlTER TABLE `user` ADD `resume_url` VARCHAR(255) NULL DEFAULT NULL COMMENT '简历url';
AlTER TABLE `user` ADD `leaving_certificate_url` VARCHAR(255) NULL DEFAULT NULL COMMENT '离职证明url';
AlTER TABLE `user` ADD `diploma_certificate_url` VARCHAR(255) NULL DEFAULT NULL COMMENT '学历证明url';
AlTER TABLE `user` ADD `id_card_number` VARCHAR(255) NULL DEFAULT NULL COMMENT '身份证号';
AlTER TABLE `user` ADD `home_address` VARCHAR(255) NULL DEFAULT NULL COMMENT '家庭地址';
AlTER TABLE `user` ADD `leaving_date` datetime NULL DEFAULT NULL COMMENT '离职日期';



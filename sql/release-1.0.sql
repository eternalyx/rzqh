CREATE TABLE `sys_user`
(
  `id`          VARCHAR(32)  NOT NULL DEFAULT '' COMMENT 'ID',
  `email`       VARCHAR(64)  NOT NULL DEFAULT '' COMMENT '邮箱',
  `status`      TINYINT(1)   NOT NULL DEFAULT '0' COMMENT '状态：0：启用 1：禁用',
  `password`    VARCHAR(255) NOT NULL DEFAULT '' COMMENT '密码',
  `nickname`    VARCHAR(64) NOT NULL DEFAULT '' COMMENT '昵称',
  `username`    VARCHAR(40)  NOT NULL DEFAULT '' COMMENT '用户名',
  `phone`       VARCHAR(64)  NOT NULL DEFAULT '' COMMENT '手机号码',
  `is_delete`   TINYINT(1)   NOT NULL DEFAULT '0' COMMENT '0: 未删除 1：已删除',
  `create_time` datetime     NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime     NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE = INNODB
  DEFAULT CHARSET = utf8 COMMENT = '系统登录用户管理';

CREATE TABLE `sys_roles`
(
  `id`          VARCHAR(32) NOT NULL DEFAULT '' COMMENT 'ID',
  `name`        VARCHAR(64) NOT NULL DEFAULT '' COMMENT '角色名称',
  `level`       TINYINT(1)  NULL     DEFAULT NULL COMMENT '角色级别',
  `permission`  VARCHAR(20) NOT NULL DEFAULT '功能权限',
  `create_time` datetime    NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime    NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE = INNODB
  DEFAULT CHARSET = utf8 COMMENT = '角色表';

CREATE TABLE `sys_menu`
(
  `id`          VARCHAR(32) NOT NULL DEFAULT '' COMMENT 'ID',
  `name`        VARCHAR(64) NOT NULL DEFAULT '' COMMENT '目录或按钮名称',
  `pid`         VARCHAR(32) NOT NULL DEFAULT '' COMMENT '父级目录',
  `sort`        TINYINT(4)  NULL     DEFAULT NULL COMMENT '排序',
  `type`        TINYINT(1)  NULL     DEFAULT NULL COMMENT '类型 1-菜单 2-按钮',
  `permission`  VARCHAR(20) NOT NULL DEFAULT '功能权限',
  `create_time` datetime    NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime    NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE = INNODB
  DEFAULT CHARSET = utf8 COMMENT = '目录菜单按钮表';

CREATE TABLE `sys_users_roles`
(
  `user_id` VARCHAR(32) NOT NULL DEFAULT '' COMMENT '用户ID',
  `role_id` VARCHAR(32) NOT NULL DEFAULT '' COMMENT '角色ID',
  PRIMARY KEY (`user_id`, `role_id`)
) ENGINE = INNODB
  DEFAULT CHARSET = utf8 COMMENT = '用户角色关联';

CREATE TABLE `sys_roles_menus`
(
  `role_id` VARCHAR(32) NOT NULL DEFAULT '' COMMENT '角色ID',
  `menu_id` VARCHAR(32) NOT NULL DEFAULT '' COMMENT '菜单ID',
  PRIMARY KEY (`role_id`, `menu_id`)
) ENGINE = INNODB
  DEFAULT CHARSET = utf8 COMMENT = '角色菜单关联';

CREATE TABLE `sys_dept`
(
  `id`          VARCHAR(32) NOT NULL DEFAULT '' COMMENT 'ID',
  `name`        VARCHAR(32) NOT NULL DEFAULT '' COMMENT '目录或按钮名称',
  `pid`         VARCHAR(32) NOT NULL DEFAULT '' COMMENT '父ID',
  `status`      TINYINT(1)  NOT NULL DEFAULT '0' COMMENT '状态：0：启用 1：禁用',
  `create_time` datetime    NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime    NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE = INNODB
  DEFAULT CHARSET = utf8 COMMENT = '部门表';

CREATE TABLE `sys_dept_leader`
(
  `dept_id` VARCHAR(32) NOT NULL DEFAULT '' COMMENT '部门ID',
  `user_id` VARCHAR(32) NOT NULL DEFAULT '' COMMENT '菜单ID',
  `level`    VARCHAR(32) NOT NULL DEFAULT '' COMMENT '部门岗位 1-主管 2-助理'
) ENGINE = INNODB
  DEFAULT CHARSET = utf8 COMMENT = '部门管理表';

CREATE TABLE `hr_employee`
(
  `id`                      VARCHAR(32)  NOT NULL DEFAULT '' COMMENT 'ID',
  `name`                    VARCHAR(20)  NOT NULL DEFAULT '' COMMENT '姓名',
  `cert_no`                 VARCHAR(20)  NOT NULL DEFAULT '' COMMENT '身份证',
  `phone`                   VARCHAR(20)  NOT NULL DEFAULT '' COMMENT '手机号',
  `gender`                  TINYINT(1)   NOT NULL DEFAULT '0' COMMENT '性别 1-男 2-女',
  `email`                   VARCHAR(20)  NOT NULL DEFAULT '' COMMENT '邮箱',
  `bank_no`                 VARCHAR(20)  NOT NULL DEFAULT '' COMMENT '银行卡号',
  `social_insurance_place`  VARCHAR(32)  NOT NULL DEFAULT '' COMMENT '社保缴纳地',
  `graduated_university`    VARCHAR(100) NOT NULL DEFAULT '' COMMENT '毕业院校',
  `emergency_contact`       VARCHAR(100) NOT NULL DEFAULT '' COMMENT '紧急联系人',
  `emergency_contact_phone` VARCHAR(20)  NOT NULL DEFAULT '' COMMENT '紧急联系人电话',
  `address`                 VARCHAR(100) NOT NULL DEFAULT '' COMMENT '家庭地址',
  `opening_bank`            VARCHAR(100) NOT NULL DEFAULT '' COMMENT '开户行',
  `dept_id`                 VARCHAR(32)  NOT NULL DEFAULT '' COMMENT '部门id',
  `status`                  TINYINT(1)   NOT NULL DEFAULT '0' COMMENT '状态 0-在职 1-离职',
  `onboarding_date`         date         NOT NULL DEFAULT '1971-01-01' COMMENT '入职日期',
  `leave_date`              date         NOT NULL DEFAULT '1971-01-01' COMMENT '离职日期',
  `contract_begin_date`     date         NOT NULL DEFAULT '1971-01-01' COMMENT '合同开始日',
  `contract_end_date`       date         NOT NULL DEFAULT '1971-01-01' COMMENT '合同结束日',
  `resume_url`              VARCHAR(32)  NOT NULL DEFAULT '' COMMENT '简历url',
  `cert_leave_url`          VARCHAR(32)  NOT NULL DEFAULT '' COMMENT '离职证明url',
  `create_time`             datetime     NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time`             datetime     NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE = INNODB
  DEFAULT CHARSET = utf8 COMMENT = '员工表';

CREATE TABLE `hr_work_experience`
(
  `id`           VARCHAR(32)  NOT NULL DEFAULT '' COMMENT 'ID',
  `employee_id`  VARCHAR(32)  NOT NULL DEFAULT '' COMMENT '员工id',
  `post_name`    VARCHAR(32)  NOT NULL DEFAULT '' COMMENT '岗位名称',
  `company_name` VARCHAR(64)  NOT NULL DEFAULT '' COMMENT '公司名称',
  `begin_date`   date         NOT NULL DEFAULT '1971-01-01' COMMENT '开始时间',
  `end_date`     date         NOT NULL DEFAULT '1971-01-01' COMMENT '结束时间',
  `create_time`  datetime     NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time`  datetime     NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  `remark`       VARCHAR(255) NOT NULL DEFAULT '' COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE = INNODB
  DEFAULT CHARSET = utf8 COMMENT = '工作经验表';

CREATE TABLE `sys_dict`
(
  `id`          VARCHAR(32)  NOT NULL DEFAULT '' COMMENT 'ID',
  `name`        VARCHAR(32)  NOT NULL DEFAULT '' COMMENT '字典名称',
  `remark`      VARCHAR(255) NOT NULL DEFAULT '' COMMENT '字典描述',
  `create_time` datetime     NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime     NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE = INNODB
  DEFAULT CHARSET = utf8 COMMENT = '数据字典表';

CREATE TABLE `sys_dict_detail`
(
  `id`          VARCHAR(32) NOT NULL DEFAULT '' COMMENT 'ID',
  `name`        VARCHAR(32) NOT NULL DEFAULT '' COMMENT '字典名称',
  `label`       VARCHAR(64) NOT NULL DEFAULT '' COMMENT '字典标签',
  `value`       VARCHAR(64) NOT NULL DEFAULT '' COMMENT '字典名称',
  `sort`        INT(10)     NOT NULL DEFAULT '0' COMMENT '排序',
  `dict_id`     VARCHAR(64) NULL     DEFAULT NULL COMMENT '字典id',
  `create_time` datetime    NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime    NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE = INNODB
  DEFAULT CHARSET = utf8 COMMENT = '数据字典明细表';

CREATE TABLE `hr_salary`
(
  `id`                VARCHAR(32)   NOT NULL DEFAULT '' COMMENT 'ID',
  `base_salary`       DECIMAL(6, 2) NOT NULL DEFAULT '0.00' COMMENT '基本工资',
  `assessment_salary` DECIMAL(6, 2) NOT NULL DEFAULT '0.00' COMMENT '绩效工资',
  `create_time`       datetime      NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time`       datetime      NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE = INNODB
  DEFAULT CHARSET = utf8 COMMENT = '工资表';

CREATE TABLE `hr_salary_track`
(
  `id`                VARCHAR(32)   NOT NULL DEFAULT '' COMMENT 'ID',
  `salary_id`         VARCHAR(32)   NOT NULL DEFAULT '' COMMENT '工资表ID',
  `base_salary`       DECIMAL(6, 2) NOT NULL DEFAULT '0.00' COMMENT '基本工资',
  `assessment_salary` DECIMAL(6, 2) NOT NULL DEFAULT '0.00' COMMENT '绩效工资',
  `start_date`        date          NOT NULL DEFAULT '1971-01-01' COMMENT '变更开始年月',
  `create_time`       datetime      NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time`       datetime      NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE = INNODB
  DEFAULT CHARSET = utf8 COMMENT = '工资轨迹表';

CREATE TABLE `hr_attendance`
(
  `id`               VARCHAR(32)   NOT NULL DEFAULT '' COMMENT 'ID',
  `employee_id`      VARCHAR(32)   NOT NULL DEFAULT '' COMMENT '员工id',
  `due_days`         DECIMAL(2, 2) NOT NULL DEFAULT '0.00' COMMENT '应上天数',
  `attendance_days`  DECIMAL(2, 2) NOT NULL DEFAULT '0.00' COMMENT '出勤天数',
  `overtime_days`    DECIMAL(2, 2) NOT NULL DEFAULT '0.00' COMMENT '加班天数',
  `leave_days`       DECIMAL(2, 2) NOT NULL DEFAULT '0.00' COMMENT '事假天数',
  `disease_days`     DECIMAL(2, 2) NOT NULL DEFAULT '0.00' COMMENT '病假天数',
  `wedding_days`     DECIMAL(2, 2) NOT NULL DEFAULT '0.00' COMMENT '婚假天数',
  `funeral_days`     DECIMAL(2, 2) NOT NULL DEFAULT '0.00' COMMENT '丧假天数',
  `absenteeism_days` DECIMAL(2, 2) NOT NULL DEFAULT '0.00' COMMENT '旷工天数',
  `attendance_date`  DATE          NOT NULL DEFAULT '1971-01-01' COMMENT '考勤日期',
  `create_time`      datetime      NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time`      datetime      NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE = INNODB
  DEFAULT CHARSET = utf8 COMMENT = '出勤表';

CREATE TABLE `hr_social_security_detail`
(
  `id`                            VARCHAR(32)   NOT NULL DEFAULT '' COMMENT 'ID',
  `bill_date`                     DATE          NOT NULL DEFAULT '1971-01-01' COMMENT '账单年月（缴费年月）',
  `cost_date`                     DATE          NOT NULL DEFAULT '1971-01-01' COMMENT '费用年月',
  `base_social_security`          INT           NOT NULL DEFAULT 0 COMMENT '社保基数',
  `base_provident_fund`           INT           NOT NULL DEFAULT 0 COMMENT '公积金基数',
  `personal_social_security_cost` DECIMAL(4, 2) NOT NULL DEFAULT '0.00' COMMENT '个人社保扣除',
  `personal_provident_fund_cost`  DECIMAL(4, 2) NOT NULL DEFAULT '0.00' COMMENT '个人公积金扣除',
  `company_social_security_cost`  DECIMAL(4, 2) NOT NULL DEFAULT '0.00' COMMENT '公司社保扣除',
  `company_provident_fund_cost`   DECIMAL(4, 2) NOT NULL DEFAULT '0.00' COMMENT '公司公积金扣除',
  `create_time`                   datetime      NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time`                   datetime      NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE = INNODB
  DEFAULT CHARSET = utf8 COMMENT = '社保缴费明细表';

CREATE TABLE `hr_salary_management`
(
  `id`                                  VARCHAR(32)   NOT NULL DEFAULT '' COMMENT 'ID',
  `salary_date`                         DATE          NOT NULL DEFAULT '1971-01-01' COMMENT '工资年月',
  `employee_id`                         VARCHAR(32)   NOT NULL DEFAULT '' COMMENT '员工id',
  `status`                              TINYINT(1)    NOT NULL DEFAULT '0' COMMENT '状态：0：正式 1：试用',
  `subsidy_salary`                      DECIMAL(6, 2) NOT NULL DEFAULT '0.00' COMMENT '补贴工资',
  `overtime_salary`                     DECIMAL(6, 2) NOT NULL DEFAULT '0.00' COMMENT '加班工资',
  `royalty_salary`                      DECIMAL(6, 2) NOT NULL DEFAULT '0.00' COMMENT '提成工资',
  `attendance_deduction`                DECIMAL(6, 2) NOT NULL DEFAULT '0.00' COMMENT '考勤扣款',
  `other_deduction`                     DECIMAL(6, 2) NOT NULL DEFAULT '0.00' COMMENT '其它扣款',
  `wages_salary`                        DECIMAL(6, 2) NOT NULL DEFAULT '0.00' COMMENT '应发工资',
  `personal_social_security_total_cost` DECIMAL(4, 2) NOT NULL DEFAULT '0.00' COMMENT '个人社保总扣除',
  PRIMARY KEY (`id`)
) ENGINE = INNODB
  DEFAULT CHARSET = utf8 COMMENT = '工资发放管理表';


CREATE TABLE `sys_dept_examine_process`
(
  `id`                 VARCHAR(32) NOT NULL DEFAULT '' COMMENT 'ID',
  `dept_id`            VARCHAR(32) NOT NULL DEFAULT '' COMMENT '部门ID',
  `examine_dept_id`    VARCHAR(32) NOT NULL DEFAULT '' COMMENT '审批部门ID',
  PRIMARY KEY (`id`)
) ENGINE = INNODB
  DEFAULT CHARSET = utf8 COMMENT = '审批流程表';


CREATE TABLE `fl_task`  (
  `id`              varchar(32) NOT NULL,
  `business_type`   varchar(50)  NOT NULL COMMENT '业务类型',
  `business_name`   varchar(255)  NOT NULL COMMENT '业务名称',
  `business_id`     varchar(32)  NOT NULL COMMENT '业务ID',
  `title`           varchar(500)  NOT NULL COMMENT '标题',
  `sender_id`       varchar(32)  NOT NULL COMMENT '发送人ID',
  `sender_time`     datetime(0) NOT NULL COMMENT '发送时间',
  `receiver_id`     varchar(32)  NOT NULL COMMENT '接收人ID',
  `create_time`     datetime(0) NULL DEFAULT NULL COMMENT '创建日期',
  PRIMARY KEY (`id`)
) ENGINE = INNODB
  DEFAULT CHARSET = utf8 COMMENT = '工作流待办事项表';


  CREATE TABLE `fl_task_ history`  (
  `id`              varchar(32)  NOT NULL,
  `business_type`   varchar(50)  NOT NULL COMMENT '业务类型',
  `business_name`   varchar(255)  NOT NULL COMMENT '业务名称',
  `business_id`     varchar(32)  NOT NULL COMMENT '业务ID',
  `title`           varchar(500)  NOT NULL COMMENT '标题',
  `sender_id`       varchar(32)  NOT NULL COMMENT '发送人ID',
  `sender_time`     datetime(0) NOT NULL COMMENT '发送时间',
  `auditer_id`      varchar(32)  NOT NULL COMMENT '审批人ID',
  `audit_result`    varchar(50)  NOT NULL COMMENT '审批结果',
  `audit_opinion`   varchar(255)  NULL DEFAULT NULL COMMENT '审批意见',
  `audit_time`      datetime(0) NULL DEFAULT NULL COMMENT '审批时间',
  `receiver_id`     varchar(32)  NULL DEFAULT NULL COMMENT '下一岗处理人ID',
  `create_time`     datetime(0) NULL DEFAULT NULL COMMENT '创建日期',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8 COMMENT = '工作流审批历史轨迹表';


CREATE TABLE `sys_dept_workflow`  (
  `id`              varchar(32)  NOT NULL,
  `from_dept_id`    varchar(32)  NOT NULL COMMENT '发启机构',
  `to_dept_id`      varchar(32)  NOT NULL COMMENT '审批机构',
  `mode`            varchar(2)  NOT NULL COMMENT '10: 仅助理审批 11：助理审批 再主管审批 20:仅主管审批',
  `create_time`     datetime(0) NOT NULL COMMENT '创建日期',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8 COMMENT = '部门审批流配置表';

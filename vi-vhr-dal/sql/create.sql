# 人员基本信息表
CREATE TABLE `t_user_info` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
  `identify_id` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '身份证号',
  `name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '员工姓名',
  `phone` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '手机号',
  `e_mail` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT '' COMMENT '邮箱',
  `address` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT '' COMMENT '住址',
  `sex` tinyint DEFAULT '0' COMMENT '员工性别。0:未知;1:男性;2:女性',
  `birthday` date DEFAULT NULL COMMENT '员工生日',
  `wed_lock` tinyint DEFAULT '0' COMMENT '婚姻状况。0:未婚;1:已婚;2:丧偶',
  `race` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT '' COMMENT '民族',
  `place` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT '' COMMENT '籍贯',
  `politic` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT '' COMMENT '政治面貌',
  `school` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT '' COMMENT '毕业院校',
  `specialty` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT '' COMMENT '专业',
  `top_degree` tinyint DEFAULT '0' COMMENT '最高学历。0:暂无;1:小学;2:初中;3:职高;4:高中;5:专科;6:本科;7:研究生;8:博士;9:博士后',
  PRIMARY KEY (`id`),
  UNIQUE KEY `idx_identify_id` (`identify_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='人员基本信息表';

# 员工表
CREATE TABLE `t_employee_info` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
  `user_id` bigint NOT NULL COMMENT 'user表id',
  `department_id` bigint NOT NULL COMMENT '部门id',
  `job` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT '' COMMENT '职位',
  `duty` tinyint DEFAULT NULL COMMENT '职级。0:助理;1:初级;2:中级;3:高级;4:架构;5:资深;6:专家',
  `basis_salary` decimal(10,2) NOT NULL DEFAULT '0.00' COMMENT '基本工资',
  `engage_form` tinyint NOT NULL DEFAULT '0' COMMENT '聘用形式。0:其他;1:校招;2:社招;3:内推',
  `begin_work_date` date NOT NULL COMMENT '入职时间',
  `work_state` tinyint NOT NULL DEFAULT '1' COMMENT '在职状态。1:在职;2:离职',
  `be_form_date` date DEFAULT NULL COMMENT '转正日期',
  `begin_contract` date NOT NULL COMMENT '合同起始日期',
  `end_contract` date NOT NULL COMMENT '合同终止日期',
  PRIMARY KEY (`id`),
  UNIQUE KEY `idx_user_id` (`user_id`),
  KEY `idx_department_id` (`department_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='员工表';

# 奖罚明细表
CREATE TABLE `t_occur_detail` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
  `employee_id` bigint NOT NULL COMMENT '员工工号。employee表id',
  `occur_date` date NOT NULL COMMENT '奖罚发生日期',
  `cause` varchar(1024) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT '' COMMENT '奖罚原因',
  `occur_quota` decimal(10,2) NOT NULL DEFAULT '0.00' COMMENT '奖罚金额',
  `occur_type` tinyint NOT NULL DEFAULT '1' COMMENT '奖罚类型。1:奖励;2:惩罚',
  `remark` varchar(512) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT '' COMMENT '备注',
  PRIMARY KEY (`id`),
  KEY `idx_employee` (`employee_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='奖罚明细表';

# 员工培训信息表
CREATE TABLE `t_train_info` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `employee_id` bigint NOT NULL COMMENT '员工工号。employee表id',
  `train_date` datetime NOT NULL COMMENT '培训时间',
  `train_content` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '培训内容',
  `train_address` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '培训地点',
  `train_state` tinyint NOT NULL DEFAULT '1' COMMENT '培训状态。1:未开始;2:进行中;3:已结束',
  `remark` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT '' COMMENT '备注',
  PRIMARY KEY (`id`),
  KEY `idx_employee_id` (`employee_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='员工培训信息表';

# 员工调动表
CREATE TABLE `t_remove_info` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
  `employee_id` bigint NOT NULL COMMENT '员工工号。employee表id',
  `pre_department_id` bigint NOT NULL COMMENT '调动前部门id',
  `next_department_id` bigint NOT NULL COMMENT '调动后所在部门id',
  `remove_date` date NOT NULL COMMENT '调动日期',
  `remove_cause` varchar(1024) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '调动原因',
  `remark` varchar(512) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`),
  KEY `idx_employee_id` (`employee_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='员工调动表';

# 员工工资表
CREATE TABLE `t_salary_info` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
  `employee_id` bigint NOT NULL COMMENT '员工工号。employee表id',
  `bonus` decimal(10,2) NOT NULL DEFAULT '0.00' COMMENT '奖金',
  `lunch_salary` decimal(10,2) NOT NULL DEFAULT '0.00' COMMENT '午餐补助',
  `traffic_salary` decimal(10,2) NOT NULL DEFAULT '0.00' COMMENT '交通补助',
  `basic_salary` decimal(10,2) NOT NULL DEFAULT '0.00' COMMENT '基本工资',
  `all_salary` decimal(10,2) NOT NULL DEFAULT '0.00' COMMENT '应发工资',
  `deliver_year` int NOT NULL COMMENT '年份,发放的是哪一年的工资',
  `deliver_month` int NOT NULL COMMENT '月份,发放的是哪一月的工资',
  PRIMARY KEY (`id`),
  KEY `idx_employee_id` (`employee_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='员工工资表';

# 部门信息表
CREATE TABLE `t_department` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
  `parent_id` bigint NOT NULL DEFAULT '0' COMMENT '父级部门id',
  `name` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '部门名称',
  PRIMARY KEY (`id`),
  KEY `idx_parent_id` (`parent_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='部门信息表';




CREATE TABLE `loaninfo` (
                            `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
                            `bank_name` varchar(100) DEFAULT NULL COMMENT '银行名称',
                            `loan_name` varchar(100) DEFAULT NULL COMMENT '贷款名称',
                            `content` varchar(1000) DEFAULT NULL COMMENT '贷款主内容',
                            `memo` varchar(1000) DEFAULT NULL COMMENT '贷款备注信息',
                            `show_order` int(11) DEFAULT NULL COMMENT '页面排序',
                            `loan_type` char(1) DEFAULT NULL COMMENT '贷款类型：0小微信用贷，1信用贷 2 抵押贷经营贷',
                            `iconid` int(11) COMMENT '银行图标id',
                            PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


INSERT INTO `dongfangyunyin`.`loaninfo`(`id`, `bank_name`, `loan_name`, `content`, `memo`, `show_order`, `loan_type`, `iconid`) VALUES (1001, '招商银行', '小微闪电贷', '一月份开门红活动，年化3.5%，月息年本，循环使用三年，额度最高100万。', '进件要求：北京的法人或股东，征信良好，持有北京的房产和京牌车，更容易获得更高额度。申请流程：扫码申请、初审通过、补充材料、当天可完成审批、自主提款。', 1, '0', 1001);
INSERT INTO `dongfangyunyin`.`loaninfo`(`id`, `bank_name`, `loan_name`, `content`, `memo`, `show_order`, `loan_type`, `iconid`) VALUES (1002, '中信银行', '小微新秒贷', '年化4.35起、月息年本，随借随还按天计息，循环使用三年，额度最高150万。', '进件要求：北京的法人或股东，征信良好持有北京的房产和京牌车，更容易获得更高额度。申请流程：扫码过初审、初审通过、补充材料/下户、完成审批、自主提款。', 2, '0', 1002);
INSERT INTO `dongfangyunyin`.`loaninfo`(`id`, `bank_name`, `loan_name`, `content`, `memo`, `show_order`, `loan_type`, `iconid`) VALUES (1003, '民生银行', '民生惠', '年化3.0%起、随借随还、支持多种还款方式，最长使用五年。', '进件要求：北京的法人或股东，征信良好，持有北京的房产和京牌车，更容易获得更高额度。申请流程：扫码申请、初审通过、补充材料、当天可完成审批、自主提款。', 3, '0', 1003);


package com.lichfeng.dongfangyunyin.models;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author lichfeng
 * @description: some desc
 * @email: 1770555310@qq.com
 * @date 2024/3/5 19:37
 */

@Data
@NoArgsConstructor
public class Loan {

    private Integer id;
    private String bankName;
    private String loanName;
    private String content;
    private String memo;
    private String showOrder;
    private String iconId;
    private String icon;
    private char loanType;
    private Date createTime;
    private Date updateTime;
}

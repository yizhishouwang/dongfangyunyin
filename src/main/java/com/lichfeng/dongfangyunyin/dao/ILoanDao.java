package com.lichfeng.dongfangyunyin.dao;

import com.lichfeng.dongfangyunyin.models.Loan;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author lichfeng
 * @description: some desc
 * @email: 1770555310@qq.com
 * @date 2024/3/5 19:58
 */

@Mapper
public interface ILoanDao {
    List<Loan> queryAllLoanInfo();

    void updateLoan( Loan loan);

    void saveLoan(Loan loan);

    void delete(@Param("id") Integer id);
}

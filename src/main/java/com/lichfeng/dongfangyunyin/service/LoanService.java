package com.lichfeng.dongfangyunyin.service;

import com.lichfeng.dongfangyunyin.models.Loan;

import java.util.List;

/**
 * @author lichfeng
 * @description: some desc
 * @email: 1770555310@qq.com
 * @date 2024/3/5 19:56
 */
public interface LoanService {

    List<Loan> queryAllLoanInfo();

    void updateLoan(Loan loan);

    void saveLoan(Loan loan);

    void delete(Integer id);
}

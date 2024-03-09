package com.lichfeng.dongfangyunyin.service.impl;

import com.lichfeng.dongfangyunyin.dao.ILoanDao;
import com.lichfeng.dongfangyunyin.models.Loan;
import com.lichfeng.dongfangyunyin.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lichfeng
 * @description: some desc
 * @email: 1770555310@qq.com
 * @date 2024/3/5 19:57
 */

@Service
public class LoanServiceImpl implements LoanService {

    @Autowired
    private ILoanDao iLoanDao;
    @Override
    public List<Loan> queryAllLoanInfo() {
        return iLoanDao.queryAllLoanInfo();
    }

    @Override
    public void updateLoan(Loan loan) {
        iLoanDao.updateLoan(loan);
    }

    @Override
    public void saveLoan(Loan loan) {
        iLoanDao.saveLoan(loan);
    }

    @Override
    public void delete(Integer id) {
        iLoanDao.delete(id);
    }

    @Override
    public List<Loan> queryLoansByLoanType(Integer loanType) {
        return iLoanDao.queryLoansByLoanType(loanType);
    }
}

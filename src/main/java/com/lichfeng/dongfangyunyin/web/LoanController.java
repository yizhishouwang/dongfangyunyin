package com.lichfeng.dongfangyunyin.web;

import com.lichfeng.dongfangyunyin.common.ResponseCode;
import com.lichfeng.dongfangyunyin.common.Result;
import com.lichfeng.dongfangyunyin.models.Loan;
import com.lichfeng.dongfangyunyin.service.LoanService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author lichfeng
 * @description: some desc
 * @email: 1770555310@qq.com
 * @date 2024/3/5 19:11
 */

@Slf4j
@RestController
@RequestMapping(value = "/loan")
public class LoanController {

    @Autowired
    private LoanService loanService;
    @GetMapping("/queryAllMicroLoans")
    public Result queryAllMicroLoans(){
        return Result.builder()
                .code(ResponseCode.SUCCESS.getCode())
                .info(ResponseCode.SUCCESS.getInfo())
                .data(loanService.queryAllLoanInfo()).build();
    }

    @GetMapping("/queryLoansByLoanType/{loanType}")
    public Result queryLoansByLoanType(@PathVariable Integer loanType){
        return Result.builder()
                .code(ResponseCode.SUCCESS.getCode())
                .info(ResponseCode.SUCCESS.getInfo())
                .data(loanService.queryLoansByLoanType(loanType)).build();
    }

    @PostMapping("/addOrUpdateLoans")
    public Result addOrUpdateLoans(@RequestBody Loan loan){

        if(loan.getId() != null ){
            loanService.updateLoan(loan);
        }else {
            loanService.saveLoan(loan);
        }

        return Result.builder()
                .code(ResponseCode.SUCCESS.getCode())
                .info(ResponseCode.SUCCESS.getInfo()).build();
    }

    @PostMapping("/deleteLoan/{id}")
    public Result deleteLoan(@PathVariable Integer id){

        loanService.delete(id);

        return Result.builder()
                .code(ResponseCode.SUCCESS.getCode())
                .info(ResponseCode.SUCCESS.getInfo()).build();
    }
}

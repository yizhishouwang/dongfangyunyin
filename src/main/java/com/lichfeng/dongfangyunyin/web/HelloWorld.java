package com.lichfeng.dongfangyunyin.web;

import com.lichfeng.dongfangyunyin.common.ResponseCode;
import com.lichfeng.dongfangyunyin.common.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lichfeng
 * @description: some desc
 * @email: 1770555310@qq.com
 * @date 2024/3/8 8:53
 */

@Slf4j
@RestController
@RequestMapping(value = "/hello")
public class HelloWorld {

    @GetMapping("/world")
    public Result queryAllMicroLoans(){
        return Result.builder()
                .code(ResponseCode.SUCCESS.getCode())
                .info(ResponseCode.SUCCESS.getInfo())
                .data("Hello World").build();
    }
}

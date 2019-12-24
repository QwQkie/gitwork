package com.briup.gitwork.web.controller;

import com.briup.gitwork.bean.Book;
import com.briup.gitwork.util.Message;
import com.briup.gitwork.util.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(description = "图书管理")
public class MarbController {
    @PostMapping("addbookma")
    @ApiOperation(value = "添加图书")
    public Message add(Book book){
        return MessageUtil.success("图书添加成功");
    }
    @GetMapping("deletebookma")
    @ApiOperation(value = "删除图书")
    public Message delete(Book book){
        return MessageUtil.success("图书删除成功");
    }
}

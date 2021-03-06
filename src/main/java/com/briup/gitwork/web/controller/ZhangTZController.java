package com.briup.gitwork.web.controller;

import com.briup.gitwork.bean.Book;
import com.briup.gitwork.util.Message;
import com.briup.gitwork.util.MessageUtil;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(description = "图书管理控制器")
public class ZhangTZController {
    @PostMapping("/add1")
    @ApiOperation(value = "添加图书")
    public Message add1(Book book){
        return MessageUtil.success("添加图书成功");
    }
    @GetMapping("/delete1")
    @ApiOperation(value = "删除图书")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id",value = "图书编号",paramType = "query",dataType = "int",required = true),
            @ApiImplicitParam(name = "name",value = "图书名称",paramType = "query",dataType = "String")
    })
    public Message delete1(int id,String name){
        return  MessageUtil.success("删除图书成功");
    }
    @GetMapping("/update1")
    @ApiOperation(value = "修改图书")
    public Message update2(Book book){
        return  MessageUtil.success("修改图书成功");
    }
}

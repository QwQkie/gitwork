package com.briup.gitwork.web.controller;

import com.briup.gitwork.bean.Book;
import com.briup.gitwork.util.Message;
import com.briup.gitwork.util.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(description = "图书管理系统")
public class BookController {
    @PostMapping("/add")
    @ApiOperation(value = "添加书籍")
    public Message add(Book book){

        return MessageUtil.success("学生书籍成功");
    }
    @GetMapping("delete")
    @ApiOperation(value="删除书籍")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "stuId",value ="编号",paramType = "query",dataType = "int",required = true),
            @ApiImplicitParam(name = "name",value ="书名",paramType = "query",dataType = "string")
    })
    public Message delete(int stuId,String name){
        return  MessageUtil.success("删除书籍成功");
    }
}




package com.briup.gitwork.web.controller;

import com.briup.gitwork.util.Message;
import com.briup.gitwork.util.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(description = "图书管理系统")
public class XiexinController {
    @PostMapping("/add2")
    @ApiOperation(value ="添加书籍" )
    @ApiImplicitParams({
            @ApiImplicitParam(name = "Id",value = "书号",paramType = "query",dataType = "int"),
            @ApiImplicitParam(name = "name",value = "书名",paramType = "query",dataType = "String",required = true)
    })
    public Message add2(int Id, String name){
        return MessageUtil.success("添加书籍成功");

    }

    @PostMapping("/delet2")
    @ApiOperation(value ="删除书籍" )
    public Message delet2(int Id, String name ){
        return MessageUtil.success("删除书籍成功");
    }


}

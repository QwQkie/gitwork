package com.briup.gitwork.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
@ApiModel
public class Book implements Serializable {
   @ApiModelProperty(value = "书籍编号",required = true)
    private int id;
   @ApiModelProperty(value = "书籍名称")
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

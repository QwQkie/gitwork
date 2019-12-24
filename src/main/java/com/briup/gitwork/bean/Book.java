package com.briup.gitwork.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
@ApiModel
public class Book implements Serializable {
    @ApiModelProperty(value = "图书编号",required = true)
    private int id;
    @ApiModelProperty(value = "图书名称")
    private  String name;
    @ApiModelProperty(value = "图书描述")
    private  String desc;

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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}

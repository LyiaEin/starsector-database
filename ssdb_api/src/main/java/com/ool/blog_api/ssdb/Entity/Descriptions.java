package com.ool.blog_api.ssdb.Entity;


import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;

import com.ool.blog_api.base.BaseEntity;


@Data
@TableName("descriptions_vanilla")
@NoArgsConstructor
@Valid
public class Descriptions{

    private String id;
    private String type;
    private String text1;
    private String text2;
    private String text3;
    private String text4;

}

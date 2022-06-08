package com.ool.blog_api.ssdb.DTO;

import com.ool.blog_api.base.BaseEntity;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SearchDTO{

    private String data;
    private Boolean like;
}

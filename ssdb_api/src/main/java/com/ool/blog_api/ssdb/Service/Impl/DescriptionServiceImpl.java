package com.ool.blog_api.ssdb.Service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ool.blog_api.ssdb.Entity.Descriptions;
import com.ool.blog_api.ssdb.Mapper.DescriptionMapper;
import com.ool.blog_api.ssdb.Mapper.ShipDataMapper;
import com.ool.blog_api.ssdb.Service.DescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DescriptionServiceImpl extends ServiceImpl<DescriptionMapper, Descriptions> implements DescriptionService {

    @Autowired
    private DescriptionMapper descriptionMapper;


    @Override
    public Descriptions getdsp(Descriptions qdsp) {
        QueryWrapper<Descriptions> qw = new QueryWrapper<>();
        return baseMapper.selectOne(qw.eq("id",qdsp.getId()).eq("type",qdsp.getType()));
    }
}

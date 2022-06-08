package com.ool.blog_api.ssdb.Service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ool.blog_api.ssdb.DTO.SearchDTO;
import com.ool.blog_api.ssdb.Entity.HullMod;
import com.ool.blog_api.ssdb.Entity.ShipData;
import com.ool.blog_api.ssdb.Mapper.HullModMapper;
import com.ool.blog_api.ssdb.Mapper.ShipDataMapper;
import com.ool.blog_api.ssdb.Service.HullModService;
import com.ool.blog_api.ssdb.Service.ShipDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HullModServiceImpl extends ServiceImpl<HullModMapper, HullMod> implements HullModService {

    @Autowired
    private HullModMapper hullModMapper;


    @Override
    public HullMod getlist(String id) {
        QueryWrapper<HullMod> qw = new QueryWrapper<>();
        return baseMapper.selectOne(qw.eq("id",id));
    }
}

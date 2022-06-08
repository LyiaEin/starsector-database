package com.ool.blog_api.ssdb.Service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ool.blog_api.ssdb.DTO.SearchDTO;
import com.ool.blog_api.ssdb.Entity.ShipData;
import com.ool.blog_api.ssdb.Entity.ShipSystem;
import com.ool.blog_api.ssdb.Mapper.ShipDataMapper;
import com.ool.blog_api.ssdb.Mapper.ShipSystemMapper;
import com.ool.blog_api.ssdb.Service.ShipDataService;
import com.ool.blog_api.ssdb.Service.ShipSystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShipSystemServiceImpl extends ServiceImpl<ShipSystemMapper, ShipSystem> implements ShipSystemService {


    @Override
    public ShipSystem getsystem(String id) {
        QueryWrapper<ShipSystem> qw = new QueryWrapper<>();
        return baseMapper.selectOne(qw.eq("id", id));
    }
}

package com.ool.blog_api.ssdb.Service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ool.blog_api.ssdb.DTO.SearchDTO;
import com.ool.blog_api.ssdb.DTO.WpnDTO;
import com.ool.blog_api.ssdb.Entity.ShipData;
import com.ool.blog_api.ssdb.Mapper.ShipDataMapper;
import com.ool.blog_api.ssdb.Service.ShipDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShipDataServiceImpl extends ServiceImpl<ShipDataMapper, ShipData> implements ShipDataService {

    @Autowired
    private ShipDataMapper shipDataMapper;


    @Override
    public List<ShipData> getalldata() {
        return this.shipDataMapper.getalldata();
    }

    @Override
    public ShipData getavg(float tonnage) {
        System.out.println(tonnage);
//        if (tonnage == 0){
//            tonnage = 1;
//
//        }
        return this.shipDataMapper.getavg(tonnage);
    }

    @Override
    public List<ShipData> searchM(SearchDTO searchDTO) {
        QueryWrapper<ShipData> qw = new QueryWrapper<>();
        if (searchDTO.getLike()){
            return baseMapper.selectList(
                    qw
                            .like("id",searchDTO.getData()).gt("tonnage",1)
                            .or()
                            .like("name",searchDTO.getData()).gt("tonnage",1)
                            .or()
                            .like("designation",searchDTO.getData()).gt("tonnage",1)
                            .or()
                            .like("tech_manufacturer",searchDTO.getData()).gt("tonnage",1)
                            .or()
                            .like("system_id",searchDTO.getData()).gt("tonnage",1));
        }else {
            return baseMapper.selectList(
                    qw
                            .eq("id",searchDTO.getData()).gt("tonnage",1)
                            .or()
                            .eq("name",searchDTO.getData()).gt("tonnage",1)
                            .or()
                            .eq("designation",searchDTO.getData()).gt("tonnage",1)
                            .or()
                            .eq("tech_manufacturer",searchDTO.getData()).gt("tonnage",1)
                            .or()
                            .eq("system_id",searchDTO.getData()).gt("tonnage",1));
        }
    }

    @Override
    public WpnDTO getbiwpn(String id) {
        return this.shipDataMapper.getbiwpn(id);
    }
}

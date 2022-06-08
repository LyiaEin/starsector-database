package com.ool.blog_api.ssdb.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ool.blog_api.ssdb.DTO.WpnDTO;
import com.ool.blog_api.ssdb.Entity.ShipData;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShipDataMapper extends BaseMapper<ShipData> {

    List<ShipData> getalldata();

    ShipData getavg(float tonnage);

    WpnDTO getbiwpn(String id);




}

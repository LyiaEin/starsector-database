package com.ool.blog_api.ssdb.Service;


import com.ool.blog_api.ssdb.DTO.SearchDTO;
import com.ool.blog_api.ssdb.DTO.WpnDTO;
import com.ool.blog_api.ssdb.Entity.ShipData;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ShipDataService {

    List<ShipData> getalldata();

    ShipData getavg(float tonnage);

    List<ShipData> searchM(SearchDTO searchDTO);


    WpnDTO getbiwpn(String id);


}

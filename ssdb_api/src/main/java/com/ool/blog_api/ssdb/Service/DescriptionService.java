package com.ool.blog_api.ssdb.Service;


import com.ool.blog_api.ssdb.DTO.SearchDTO;
import com.ool.blog_api.ssdb.Entity.Descriptions;
import com.ool.blog_api.ssdb.Entity.ShipData;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DescriptionService {

    Descriptions getdsp(Descriptions qdsp);

}

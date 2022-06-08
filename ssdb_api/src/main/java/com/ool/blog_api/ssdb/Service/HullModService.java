package com.ool.blog_api.ssdb.Service;



import com.ool.blog_api.ssdb.Entity.HullMod;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface HullModService {

    HullMod getlist(String id);

}

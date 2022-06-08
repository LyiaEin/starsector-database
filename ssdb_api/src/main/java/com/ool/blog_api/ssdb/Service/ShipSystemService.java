package com.ool.blog_api.ssdb.Service;




import com.ool.blog_api.ssdb.Entity.ShipSystem;
import org.springframework.stereotype.Service;

@Service
public interface ShipSystemService {

    ShipSystem getsystem(String id);

}

package com.ool.blog_api.ssdb.Controller;


import com.ool.blog_api.base.api.ApiResult;
import com.ool.blog_api.ssdb.DTO.SearchDTO;
import com.ool.blog_api.ssdb.DTO.WpnDTO;
import com.ool.blog_api.ssdb.Entity.Descriptions;
import com.ool.blog_api.ssdb.Entity.HullMod;
import com.ool.blog_api.ssdb.Entity.ShipData;
import com.ool.blog_api.ssdb.Entity.ShipSystem;
import com.ool.blog_api.ssdb.Service.DescriptionService;
import com.ool.blog_api.ssdb.Service.HullModService;
import com.ool.blog_api.ssdb.Service.ShipDataService;
import com.ool.blog_api.ssdb.Service.ShipSystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("sd")
public class ShipDataController {

    @Autowired
    private ShipDataService shipDataService;

    @Autowired
    private DescriptionService descriptionService;

    @Autowired
    private HullModService hullModService;

    @Autowired
    private ShipSystemService shipSystemService;

    @RequestMapping(value = "getall",method = {RequestMethod.GET})
    public List<ShipData> alldata() {
        return this.shipDataService.getalldata();
    }

    @RequestMapping(value = "getavg", method = {RequestMethod.POST})
    public ShipData avgdata(@RequestBody ShipData currdata) {
        ShipData shipData = this.shipDataService.getavg(currdata.getTonnage());
        System.out.println(shipData);
        return shipData;
    }

    @RequestMapping(value = "searchM",method = {RequestMethod.POST})
    public ApiResult searchM (@RequestBody SearchDTO searchDTO){
        System.out.println(searchDTO);
        List<ShipData> shipDataList = this.shipDataService.searchM(searchDTO);
        if (!shipDataList.isEmpty()){
            return ApiResult.success(shipDataList);
        }else {
            return ApiResult.failed();
        }

    }

    @RequestMapping(value = "getdsp",method = {RequestMethod.POST})
    public Descriptions getdesp(@RequestBody Descriptions qdsp) {
        System.out.println(qdsp);
        Descriptions dsp = this.descriptionService.getdsp(qdsp);
        if (dsp.getText1() == null){
            dsp.setText1("");
        }
        if (dsp.getText2() == null){
            dsp.setText2("");
        }
        if (dsp.getText3() == null){
            dsp.setText3("");
        }
        if (dsp.getText4() == null){
            dsp.setText4("");
        }
        return dsp;
    }

    @RequestMapping(value = "gethullmod",method = {RequestMethod.POST})
    public ApiResult gethullmod(@RequestBody String[] ids) {
        System.out.println(Arrays.toString(ids));
        List<HullMod> hullmodlist = new ArrayList<>();
        for (int i = 0; i < ids.length; i++) {
            hullmodlist.add(this.hullModService.getlist(ids[i]));
        }

        return ApiResult.success(hullmodlist);
    }

    @RequestMapping(value = "getsystem",method = {RequestMethod.POST})
    public ApiResult getsystem(@RequestBody String[] id) {
        System.out.println(id[0]);
        ShipSystem sys = this.shipSystemService.getsystem(id[0]);


        return ApiResult.success(sys);
    }

    @RequestMapping(value = "getbiweapon",method = {RequestMethod.POST})
    public ApiResult getbiweapon(@RequestBody String[] id) {
        System.out.println(id[0]);
        WpnDTO wpn = this.shipDataService.getbiwpn(id[0]);


        return ApiResult.success(wpn);
    }




}

package com.ool.blog_api.ssdb.Entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;


@Data
@TableName("hull_mods_vanilla")
@NoArgsConstructor
@Valid
public class HullMod {

    private String name;
    private String id;
    private int tier;
    private String rarity;
    private String tech_manufacturer;
    private String tags;
    private String uitags;
    private int base_value;
    private boolean unlocked;
    private boolean hidden;
    private boolean hiddeneverywhere;
    private int cost_frigate;
    private int cost_dest;
    private int cost_cruiser;
    private int cost_capital;
    private String script;
    private String mod_desc;
    private String short_desc;
    private String sprite;

}


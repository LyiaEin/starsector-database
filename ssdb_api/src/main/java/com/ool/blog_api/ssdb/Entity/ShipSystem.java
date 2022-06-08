package com.ool.blog_api.ssdb.Entity;


import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;

@Data
@TableName("ship_systems_vanilla")
@NoArgsConstructor
@Valid
public class ShipSystem {
    private String name;
    private String id;
    private int flux_second;
    private double f_s_base_r;
    private double f_s_base_c;
    private int flux_use;
    private double f_u_base_r;
    private double f_u_base_c;
    private int cr_u;
    private int max_uses;
    private double regen;
    private double charge_up;
    private double active;
    private double down;
    private int cooldown;
    private boolean toggle;
    private boolean noDissipati;
    private boolean noHardDissi;
    private boolean hardFlux;
    private boolean noFiring;
    private boolean noTurning;
    private boolean noStrafing;
    private boolean noAccel;
    private boolean noShield;
    private boolean noVent;
    private boolean isPhaseCloa;
    private String tags;
    private String icon;
}

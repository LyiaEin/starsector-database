package com.ool.blog_api.ssdb.DTO;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ShipDataDTO {

    private int recid;
    private String id;
    private String name;
    private String designation;
    private float tonnage;
    private String tech_manufacturer;
    private String system_name;
    private String system_id;
    private int fleet_pts;
    private int hitpoints;
    private int armor_rating;
    private int max_flux;
    private int e_s_f_fp;
    private int flux_dissipation;
    private int ordnance_points;
    private int fighter_bays;
    private int max_speed;
    private int acceleration;
    private int deceleration;
    private int max_turn_rate;
    private int turn_acceleration;
    private int mass;
    private String shield_type;
    private String defense_id;
    private int shield_arc;
    private double shield_upkeep;
    private double shield_efficiency;
    private double phase_cost;
    private double phase_upkeep;
    private int min_crew;
    private int max_crew;
    private int cargo;
    private int fuel;
    private double fuel_ly;
    private int range_p;
    private int max_burn;
    private int base_value;
    private int cr_p_day;
    private int CR_to_deploy;
    private int peak_CR_sec;
    private double CR_loss_sec;
    private int supplies_rec;
    private int supplies_mo;
    private int c_s;
    private int c_f;
    private int f_s;
    private int f_f;
    private int crew_s;
    private int crew_f;
    private String hints;
    private String tags;
    private double rarity;
    private double breakProb;
    private int minPieces;
    private int maxPieces;
    private String travel_drive;
    private double number;

}

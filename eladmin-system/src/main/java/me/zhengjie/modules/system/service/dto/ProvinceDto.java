package me.zhengjie.modules.system.service.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author zhoudanwei
 * @date 2020-01-10
 */
@Data
public class ProvinceDto implements Serializable {
    private int id;
    private String code;
    private String name;
    private String province;
    private String city;
    private String area;
    private String town;
}
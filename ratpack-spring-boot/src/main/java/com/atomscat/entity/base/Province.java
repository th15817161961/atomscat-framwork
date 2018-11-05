package com.atomscat.entity.base;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Table(name = "province")
public class Province implements Serializable {

    //@ApiModelProperty(value = "null")
    @Column(name = "id")
    @Id
    private long id;
    //@ApiModelProperty(value = "null")
    @Column(name = "name")
    private String name;
    //@ApiModelProperty(value = "null")
    @Column(name = "province_id")
    private String provinceId;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId;
    }

}

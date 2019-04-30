package com.htp.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

public class Department {

    private Long departmentId;

    private String departmentName;

    private Long departmentCapacity;

    private Long factoryId;

    public Department() {
    }

    public Department(Long departmentId, String departmentName, Long departmentCapacity, Long factoryId) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.departmentCapacity = departmentCapacity;
        this.factoryId = factoryId;
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }


}

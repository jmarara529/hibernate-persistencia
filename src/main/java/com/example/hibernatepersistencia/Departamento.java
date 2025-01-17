package com.example.hibernatepersistencia;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "departamentos")
public class Departamento {
    @Id
    @Column(name = "dept_no", columnDefinition = "tinyint UNSIGNED not null")
    private Short id;

    @Column(name = "dnombre", nullable = false, length = 20)
    private String dnombre;

    @Column(name = "loc", length = 15)
    private String loc;

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getDnombre() {
        return dnombre;
    }

    public void setDnombre(String dnombre) {
        this.dnombre = dnombre;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

}
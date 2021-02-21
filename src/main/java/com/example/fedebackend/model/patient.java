package com.example.fedebackend.model;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
public class patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)

    @NotNull
    private Long id ;

    @NotNull
    private int sex ;

    @NotNull
    private int cp ;

    @NotNull
    private int thalach ;

    @NotNull
    private int exang ;

    @NotNull
    private double oldpeak ;

    @NotNull
    private int slope ;

    @NotNull
    private int ca ;

    @NotNull
    private int target ;

    public patient(){

    }
    public patient(int sex, int cp, int thalach, int exang, double oldpeak, int slope, int ca, int target) {
        this.sex = sex;
        this.cp = cp;
        this.thalach = thalach;
        this.exang = exang;
        this.oldpeak = oldpeak;
        this.slope = slope;
        this.ca = ca;
        this.target = target;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public int getThalach() {
        return thalach;
    }

    public void setThalach(int thalach) {
        this.thalach = thalach;
    }

    public int getExang() {
        return exang;
    }

    public void setExang(int exang) {
        this.exang = exang;
    }

    public double getOldpeak() {
        return oldpeak;
    }

    public void setOldpeak(double oldpeak) {
        this.oldpeak = oldpeak;
    }

    public int getSlope() {
        return slope;
    }

    public void setSlope(int slope) {
        this.slope = slope;
    }

    public int getCa() {
        return ca;
    }

    public void setCa(int ca) {
        this.ca = ca;
    }

    public int getTarget() {
        return target;
    }

    public void setTarget(int target) {
        this.target = target;
    }

}

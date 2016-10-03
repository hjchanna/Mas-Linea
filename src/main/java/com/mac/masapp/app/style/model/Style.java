package com.mac.masapp.app.style.model;

import com.mac.masapp.app.cm.model.CmCost;
import com.mac.masapp.app.fabric.model.FabricCost;
import com.mac.masapp.app.tier.model.Tier;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Nidura Prageeth
 */
@Entity(name = "com.mac.masapp.app.style.model.Style")
@Table(name = "style")
public class Style {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer indexNo;
    @Column(name = "style_no")
    private String styleNo;
    @Column(name = "trim_cost")
    private double trimcost;
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "tier")
    private Tier tier;
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "fabric_cost")
    private FabricCost fabricCost;
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "cm_cost")
    private CmCost cmCost;
    private String picture;

    public Style() {
    }

    public Integer getIndexNo() {
        return indexNo;
    }

    public void setIndexNo(Integer indexNo) {
        this.indexNo = indexNo;
    }

    public String getStyleNo() {
        return styleNo;
    }

    public void setStyleNo(String styleNo) {
        this.styleNo = styleNo;
    }

    public double getTrimcost() {
        return trimcost;
    }

    public void setTrimcost(double trimcost) {
        this.trimcost = trimcost;
    }

    public Tier getTier() {
        return tier;
    }

    public void setTier(Tier tier) {
        this.tier = tier;
    }

    public FabricCost getFabricCost() {
        return fabricCost;
    }

    public void setFabricCost(FabricCost fabricCost) {
        this.fabricCost = fabricCost;
    }

    public CmCost getCmCost() {
        return cmCost;
    }

    public void setCmCost(CmCost cmCost) {
        this.cmCost = cmCost;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

}

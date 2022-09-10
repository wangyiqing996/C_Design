package com.example.c_design.domain;

import java.util.Date;

public class Buy {
    private Integer cId;

    private Integer gId;

    private Date bTime;

    private Integer bPrice;

    private Integer bNumber;

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public Integer getgId() {
        return gId;
    }

    public void setgId(Integer gId) {
        this.gId = gId;
    }

    public Date getbTime() {
        return bTime;
    }

    public void setbTime(Date bTime) {
        this.bTime = bTime;
    }

    public Integer getbPrice() {
        return bPrice;
    }

    public void setbPrice(Integer bPrice) {
        this.bPrice = bPrice;
    }

    public Integer getbNumber() {
        return bNumber;
    }

    public void setbNumber(Integer bNumber) {
        this.bNumber = bNumber;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cId=").append(cId);
        sb.append(", gId=").append(gId);
        sb.append(", bTime=").append(bTime);
        sb.append(", bPrice=").append(bPrice);
        sb.append(", bNumber=").append(bNumber);
        sb.append("]");
        return sb.toString();
    }
}
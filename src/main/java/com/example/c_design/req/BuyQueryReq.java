package com.example.c_design.req;

import java.util.Date;

public class BuyQueryReq {
    private Long cId;

    private Long gId;

    private Date bTime;

    private Integer bPrice;

    private Integer bNumber;

    public Long getcId() {
        return cId;
    }

    public void setcId(Long cId) {
        this.cId = cId;
    }

    public Long getgId() {
        return gId;
    }

    public void setgId(Long gId) {
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
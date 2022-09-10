package com.example.c_design.domain;

public class Goods {
    private Integer gId;

    private String gName;

    private Integer gPrice;

    private String gPicture;

    private Integer gNumber;

    public Integer getgId() {
        return gId;
    }

    public void setgId(Integer gId) {
        this.gId = gId;
    }

    public String getgName() {
        return gName;
    }

    public void setgName(String gName) {
        this.gName = gName;
    }

    public Integer getgPrice() {
        return gPrice;
    }

    public void setgPrice(Integer gPrice) {
        this.gPrice = gPrice;
    }

    public String getgPicture() {
        return gPicture;
    }

    public void setgPicture(String gPicture) {
        this.gPicture = gPicture;
    }

    public Integer getgNumber() {
        return gNumber;
    }

    public void setgNumber(Integer gNumber) {
        this.gNumber = gNumber;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", gId=").append(gId);
        sb.append(", gName=").append(gName);
        sb.append(", gPrice=").append(gPrice);
        sb.append(", gPicture=").append(gPicture);
        sb.append(", gNumber=").append(gNumber);
        sb.append("]");
        return sb.toString();
    }
}
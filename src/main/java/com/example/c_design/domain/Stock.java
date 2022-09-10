package com.example.c_design.domain;

public class Stock {
    private Long gId;

    private Long sId;

    public Long getgId() {
        return gId;
    }

    public void setgId(Long gId) {
        this.gId = gId;
    }

    public Long getsId() {
        return sId;
    }

    public void setsId(Long sId) {
        this.sId = sId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", gId=").append(gId);
        sb.append(", sId=").append(sId);
        sb.append("]");
        return sb.toString();
    }
}
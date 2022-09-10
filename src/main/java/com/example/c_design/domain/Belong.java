package com.example.c_design.domain;

public class Belong {
    private Long sId;

    private Long uId;

    public Long getsId() {
        return sId;
    }

    public void setsId(Long sId) {
        this.sId = sId;
    }

    public Long getuId() {
        return uId;
    }

    public void setuId(Long uId) {
        this.uId = uId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sId=").append(sId);
        sb.append(", uId=").append(uId);
        sb.append("]");
        return sb.toString();
    }
}
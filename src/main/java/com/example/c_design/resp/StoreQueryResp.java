package com.example.c_design.resp;

public class StoreQueryResp {
    private Long sId;

    private String sPlace;

    private String sPicture;

    private String sIntroducetion;

    private String sName;

    private String sKind;

    public Long getsId() {
        return sId;
    }

    public void setsId(Long sId) {
        this.sId = sId;
    }

    public String getsPlace() {
        return sPlace;
    }

    public void setsPlace(String sPlace) {
        this.sPlace = sPlace;
    }

    public String getsPicture() {
        return sPicture;
    }

    public void setsPicture(String sPicture) {
        this.sPicture = sPicture;
    }

    public String getsIntroducetion() {
        return sIntroducetion;
    }

    public void setsIntroducetion(String sIntroducetion) {
        this.sIntroducetion = sIntroducetion;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsKind() {
        return sKind;
    }

    public void setsKind(String sKind) {
        this.sKind = sKind;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sId=").append(sId);
        sb.append(", sPlace=").append(sPlace);
        sb.append(", sPicture=").append(sPicture);
        sb.append(", sIntroducetion=").append(sIntroducetion);
        sb.append(", sName=").append(sName);
        sb.append(", sKind=").append(sKind);
        sb.append("]");
        return sb.toString();
    }
}
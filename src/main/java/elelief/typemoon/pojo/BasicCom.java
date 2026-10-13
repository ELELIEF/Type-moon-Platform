package elelief.typemoon.pojo;

public class BasicCom {
    private Integer comId;
    private String comName;
    private String comImg;
    private String comBackimg;
    public BasicCom() {

    }
    public BasicCom(Integer comId, String comName, String comImg, String comBackimg) {
        this.comId = comId;
        this.comName = comName;
        this.comImg = comImg;
        this.comBackimg = comBackimg;

    }
    public Integer getComId() {
        return comId;
    }
    public void setComId(Integer comId) {
        this.comId = comId;
    }
    public String getComName() {
        return comName;
    }
    public void setComName(String comName) {
        this.comName = comName;

    }
    public String getComImg() {
        return comImg;
    }
    public void setComImg(String comImg) {
        this.comImg = comImg;

    }
    public String getComBackimg() {
        return comBackimg;
    }
    public void setComBackimg(String comBackimg) {
        this.comBackimg = comBackimg;
    }
}


package elelief.typemoon.pojo;


import java.util.Date;


public class CompositionMessage {
    private Integer comId;
    private String comName;
    private String comType;
    private String comTheme;
    private Date comDate;
    private String comStory;
    private String comImg;
    private String comBackimg;

    public CompositionMessage(Integer id, String name, String type, String theme, Date date, String storyintroduce, String img,String backimg) {
        this.comId = id;
        this.comName = name;
        this.comType = type;
        this.comTheme = theme;
        this.comDate = date;
        this.comStory = storyintroduce;
        this.comImg = img;
        this.comBackimg = backimg;
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

    public String getComType() {
        return comType;
    }

    public void setComType(String comType) {
        this.comType = comType;
    }

    public String getComTheme() {
        return comTheme;
    }

    public void setComTheme(String comTheme) {
        this.comTheme = comTheme;
    }

    public Date getComDate() {
        return comDate;
    }

    public void setComDate(Date comDate) {
        this.comDate = comDate;
    }

    public String getComStory() {
        return comStory;
    }

    public void setComStory(String comStory) {
        this.comStory = comStory;
    }

    public String getComImg() {
        return comImg;
    }

    public void setComImg(String comImg1) {
        this.comImg = comImg1;
    }

    public String getComBackimg() {
        return comBackimg;
    }

    public void setComBackimg(String comBackimg1) {
        this.comBackimg = comBackimg1;
    }


}


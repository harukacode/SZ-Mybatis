package com.harukacode.SZ;

/**
 * Created by Administrator on 2017-5-23.
 */
public class Course {
    private Integer id;
    private String name;
    private Integer viewNum;
    private Integer collectNum;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getViewNum() {
        return viewNum;
    }

    public void setViewNum(Integer viewNum) {
        this.viewNum = viewNum;
    }

    public Integer getCollectNum() {
        return collectNum;
    }

    public void setCollectNum(Integer collectNum) {
        this.collectNum = collectNum;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", viewNum=" + viewNum +
                ", collectNum=" + collectNum +
                '}';
    }
}

package com.prototypePatternDemo;

public class WeeklyLog implements Cloneable{
    //填写人姓名
    private String name;
    //填写日期
    private String date;
    //填写内容
    private String content;

    public WeeklyLog() {
    }

    public WeeklyLog(String name, String date, String content) {
        this.name = name;
        this.date = date;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    public WeeklyLog clone(){
        try {
            return (WeeklyLog) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            System.out.println("不支持复制！");
            return null;
        }
    }
    public void show(){
        System.out.println("****周报****");
        System.out.println(this.toString());
        System.out.println("--------------------------------");
    }

    @Override
    public String toString() {
        return  "  姓名='" + name + '\'' +
                ",\n  填写日期='" + date + '\'' +
                ",\n  周报内容='" + content + '\'';
    }
}

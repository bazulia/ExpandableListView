package com.bezeka.igor.expandablelistview;

/**
 * Created by Alex on 13.05.2015.
 */
public class ListDataHeader {


    private String title;
    private int icon;

    ListDataHeader(String title, int icon){
        this.title = title;
        this.icon = icon;
    }

    public int getIcon() {
        return icon;
    }

    public String getTitle() {
        return title;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

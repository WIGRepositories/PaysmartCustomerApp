package com.webingate.paysmartcustomerapp.object;

import com.google.gson.annotations.SerializedName;

public class DirectoryHome9ProductsVO {

    @SerializedName("id")
    private String id;

    @SerializedName("icon")
    private String icon;

    @SerializedName("name")
    private String name;

    @SerializedName("selectedicon")
    private String selectedicon;

    @SerializedName("isselected")
    private String isselected;

    public DirectoryHome9ProductsVO(String id, String icon, String name) {
        this.id = id;
        this.icon = icon;
        this.name = name;
    }

    public DirectoryHome9ProductsVO(String id, String icon, String name, String selectedicon) {
        this.id = id;
        this.icon = icon;
        this.name = name;
        this.selectedicon =selectedicon;

    }
    public DirectoryHome9ProductsVO(String id, String icon, String name, String selectedicon,String isselected ) {
        this.id = id;
        this.icon = icon;
        this.name = name;
        this.selectedicon =selectedicon;
        this.isselected=isselected;
    }

    public String getId() {
        return id;
    }

    public String getIcon() {
        return icon;
    }

    public String getSelectedIcon() {
        return selectedicon;
    }

    public String getName() {
        return name;
    }
    public String getselected() {
        return isselected;
    }
}

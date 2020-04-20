package com.brainacad.andreyaa.lms.java_se.lab3_6_annotations.lab3_6_2_3;

import java.util.List;

class User {

    private String name;
    private List<PermissionAction> permissions;

    User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<PermissionAction> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<PermissionAction> permissions) {
        this.permissions = permissions;
    }

    @Override
    public String toString() {
        return "User: " +
                "name = " + name +
                ", permissions: " + permissions;
    }

}

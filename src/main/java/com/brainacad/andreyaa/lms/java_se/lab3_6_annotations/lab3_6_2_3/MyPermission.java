package com.brainacad.andreyaa.lms.java_se.lab3_6_annotations.lab3_6_2_3;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value = ElementType.METHOD)
@Retention(value = RetentionPolicy.RUNTIME)
@interface MyPermission {

    PermissionAction value();

}

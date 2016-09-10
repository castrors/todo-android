package com.castrodev.todo.entity;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.SOURCE;

/**
 * Created by rodrigocastro on 10/09/16.
 */

public class TaskStatus {

    @Retention(SOURCE)
    @IntDef({DONE, TODO})
    public @interface Status {}
    public static final int TODO = 1;
    public static final int DONE = 2;
}

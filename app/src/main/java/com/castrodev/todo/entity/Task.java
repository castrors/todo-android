package com.castrodev.todo.entity;

import java.util.Date;

/**
 * Created by rodrigocastro on 10/09/16.
 */

public class Task {

    private String name;
    private int status;
    private Date createdAt;
    private Date updatedAt;

    public Task(String name) {
        this.name = name;
        setStatus(TaskStatus.TODO);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(@TaskStatus.Status int status) {
        this.status = status;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public boolean isValid() {

        return !getName().isEmpty() && getStatus() != 0;
    }

    public boolean isDone() {
        return getStatus() == TaskStatus.DONE;
    }

    public void beforeSave(){
        Date date = new Date();
        setCreatedAt(date);
        setUpdatedAt(date);
    }
}

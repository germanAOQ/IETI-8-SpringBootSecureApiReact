package com.eci.cosw.springbootsecureapi.model;

public class Task {
    private long id;
    private String title;
    private Status status;
    private String dueDate;
    private String responsable;

    public Task(){

    }

    public Task(long id, String title, Status status, String dueDate, String responsable) {
        this.id = id;
        this.title = title;
        this.status = status;
        this.dueDate = dueDate;
        this.responsable = responsable;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }
}

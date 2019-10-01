package com;

import java.util.Objects;

public class Comments {
private String name;
private  String email;
private  String subject;
private String message;
private  int id;

    public Comments(String name, String email, String subject, String message) {
        this.name = name;
        this.email = email;
        this.subject = subject;
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Comments comments = (Comments) o;
        return id == comments.id &&
                Objects.equals(name, comments.name) &&
                Objects.equals(email, comments.email) &&
                Objects.equals(subject, comments.subject) &&
                Objects.equals(message, comments.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email, subject, message, id);
    }
}

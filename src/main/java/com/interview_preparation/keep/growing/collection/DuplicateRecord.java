package com.interview_preparation.keep.growing.collection;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class DuplicateRecord {
    private String id;
    private String name;
    private LocalDateTime timestamp;

    private LocalDate dob;
    private String fatherName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public DuplicateRecord() {
    }

    public DuplicateRecord(String id, String name, LocalDateTime timestamp, LocalDate dob, String fatherName) {
        this.id = id;
        this.name = name;
        this.timestamp = timestamp;
        this.dob = dob;
        this.fatherName = fatherName;
    }

    @Override
    public String toString() {
        return "DuplicateRecord{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", timestamp=" + timestamp +
                ", dob=" + dob +
                ", fatherName='" + fatherName + '\'' +
                '}';
    }
}

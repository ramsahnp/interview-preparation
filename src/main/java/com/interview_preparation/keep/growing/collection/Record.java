package com.interview_preparation.keep.growing.collection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
public class Record {
    private String id;
    private String name;
    private String fatherName;
    private LocalDate dob;
    private LocalDateTime timestamp;

    private boolean hasDuplicate;
    private List<DuplicateRecord> duplicates;

    public Record(String id, String name, String fatherName, LocalDate dob, LocalDateTime timestamp) {
        this.id=id;
        this.name=name;
        this.dob=dob;
        this.fatherName=fatherName;
        this.timestamp=timestamp;
    }


// Getters and setters

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

    public boolean isHasDuplicate() {
        return hasDuplicate;
    }

    public void setHasDuplicate(boolean hasDuplicate) {
        this.hasDuplicate = hasDuplicate;
    }

    public List<DuplicateRecord> getDuplicates() {
        return duplicates;
    }

    public void setDuplicates(List<DuplicateRecord> duplicates) {
        this.duplicates = duplicates;
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



    @Override
    public String toString() {
        return "Record{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dob='" + dob + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", timestamp=" + timestamp +
                ", hasDuplicate=" + hasDuplicate +
                ", duplicates=" + duplicates +
                '}';
    }
}

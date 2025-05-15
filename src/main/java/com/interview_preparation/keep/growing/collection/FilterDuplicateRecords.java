package com.interview_preparation.keep.growing.collection;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

import static java.lang.System.out;

public class FilterDuplicateRecords {
    public static void main(String[] args) {
        out.println("hello...");
       /* List<Record> records = Arrays.asList(
                new Record("1", "Alice", "12-02-2002", "ram", LocalDateTime.parse("2023-08-10T10:00:00")),
                new Record("2", "Bob","12-02-2002","father", LocalDateTime.parse("2023-08-11T11:00:00")),
                new Record("3", "Alice","12-02-2002","ram", LocalDateTime.parse("2023-08-12T12:00:00")) // duplicate
        );*/

        List<Record> records = Arrays.asList(
                // No duplicate
                new Record("1", "Alice", "Robert", LocalDate.of(1990, 1, 1), LocalDateTime.parse("2023-08-10T10:00:00")),

                // Duplicate Group 1 (Alice, Robert, 1990-01-01)
                new Record("2", "Alice", "Robert", LocalDate.of(1990, 1, 1), LocalDateTime.parse("2023-08-12T12:00:00")),
                new Record("3", "Alice", "Robert", LocalDate.of(1990, 1, 1), LocalDateTime.parse("2023-08-11T11:00:00")),

                // Duplicate Group 2 (Bob, John, 1985-05-05)
                new Record("4", "Bob", "John", LocalDate.of(1985, 5, 5), LocalDateTime.parse("2023-08-09T09:00:00")),
                new Record("5", "Bob", "John", LocalDate.of(1985, 5, 5), LocalDateTime.parse("2023-08-10T10:00:00")),
                new Record("6", "Bob", "John", LocalDate.of(1985, 5, 5), LocalDateTime.parse("2023-08-08T08:00:00")),

                // Same name but different fatherName → Not duplicate
                new Record("7", "Alice", "Martin", LocalDate.of(1990, 1, 1), LocalDateTime.parse("2023-08-14T10:00:00")),

                // Same name and fatherName but different dob → Not duplicate
                new Record("8", "Alice", "Robert", LocalDate.of(1991, 1, 1), LocalDateTime.parse("2023-08-15T10:00:00")),

                // One record only in group
                new Record("9", "Charlie", "David", LocalDate.of(1992, 2, 2), LocalDateTime.parse("2023-08-16T16:00:00")),

                // Duplicate with same timestamp
                new Record("10", "David", "Steve", LocalDate.of(1980, 3, 3), LocalDateTime.parse("2023-08-10T10:00:00")),
                new Record("11", "David", "Steve", LocalDate.of(1980, 3, 3), LocalDateTime.parse("2023-08-10T10:00:00"))
        );


        List<Record> result = processRecords(records);
        out.println(result);
    }

    public static List<Record> processRecords(List<Record> records) {
        // Group records by "name" or any duplicate key
        Map<String, List<Record>> grouped = records.stream()
                .collect(Collectors.groupingBy(record ->
                        record.getName() + "|" + record.getFatherName() + "|" + record.getDob()
                ));

        List<Record> result = new ArrayList<>();

        for (Map.Entry<String, List<Record>> entry : grouped.entrySet()) {
            List<Record> group = entry.getValue();

            // Sort group by timestamp to get latest
            group.sort(Comparator.comparing(Record::getTimestamp).reversed());

            Record latest = group.get(0);
            if (group.size() > 1) {
                latest.setHasDuplicate(true);
                latest.setDuplicates(builder(group));
            } else {
                latest.setHasDuplicate(false);
                latest.setDuplicates(Collections.emptyList());
            }

            result.add(latest);
        }

        return result;
    }

    public static List<DuplicateRecord> builder(List<Record> records){
        List<DuplicateRecord> duplicateRecords = new ArrayList<>();
        if(!records.isEmpty()){
            for(Record record: records ) {
                DuplicateRecord duplicateRecord = new DuplicateRecord();
                duplicateRecord.setId(record.getId());
                duplicateRecord.setName(record.getName());
                duplicateRecord.setTimestamp(record.getTimestamp());
                duplicateRecord.setDob(record.getDob());
                duplicateRecord.setFatherName(record.getFatherName());
                out.println("duplicate: "+duplicateRecord.toString());
                duplicateRecords.add(duplicateRecord);
            }
        }
        return duplicateRecords;
    }
}

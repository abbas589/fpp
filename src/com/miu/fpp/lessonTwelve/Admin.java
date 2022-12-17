package com.miu.fpp.lessonTwelve;

import java.util.*;
import java.util.stream.Collectors;

public class Admin {
    public static HashMap<Key, Student> processStudents(List<Student> students) {
        HashMap<Key, Student> keyStudentHashMap = new HashMap<>();
        //implement
        for (Student student : students) {
            keyStudentHashMap.put(new Key(student.getFirstName(), student.getLastName()), student);
        }
        return keyStudentHashMap;
    }

    public static double computeAverageGPA(HashMap<Key, Student> maps) {
        //implements
        double gpaSum = 0;
        double count = 0;


//        return maps.values().stream().map(Student::getGpa).collect(Collectors.averagingDouble(Double::doubleValue));

        Iterator<Student> studentIterator = maps.values().iterator();
        while (studentIterator.hasNext()) {
            gpaSum += studentIterator.next().getGpa();
//            System.out.println("Current gpa sum: "+gpaSum);
            ++count;
//            System.out.println("Current count: "+count);
        }

        return gpaSum/count;
    }
}

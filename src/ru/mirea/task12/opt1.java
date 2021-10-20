package ru.mirea.task12;

import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;

public class opt1 {

    static class Student {
        int id, score;

        public Student() {
            this.id = (int) (Math.random() * 90001);
            this.score = (int) (Math.random() * 101);
        }

        public Student(int id, int score) {
            this.id = id;
            this.score = score;
        }

        public int getScore() {
            return this.score;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "id=" + this.id +
                    ", score=" + this.score +
                    '}';
        }

        public int getId() {
            return this.id;
        }
    }

    static class SortingStudentsByGPA implements Comparator<Student> {
        @Override
        public int compare(Student a, Student b) {
            return Integer.compare(b.getScore(), a.getScore());
        }

        public static void main(String[] args) {
            ArrayList<Student> studArr = new ArrayList<>();
            for (int i = 0; i < 20; i++) {
                studArr.add(new Student());
                System.out.print(studArr.get(i).getScore() + " ");
            }
            studArr.sort(new SortingStudentsByGPA());
            System.out.println();
            for (int i = 0; i < 20; i++)
                System.out.print(studArr.get(i).getScore() + " ");
        }
    }
}

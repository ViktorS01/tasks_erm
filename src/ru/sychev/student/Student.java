package ru.sychev.student;

import java.util.Arrays;

public class Student <T> {
    String name;
    T[]  rating;
    Checker<T> ch;

    public Student(String name, T[] rating, Checker<T> ch) {
        this.ch = ch;
        this.name = name;
        setRating(rating, ch);
    }

    public void setRating(T[] rating, Checker<T> ch) {
        for (int i = 0; i < rating.length; i++)
        if (!ch.check(rating[i])) throw new IllegalArgumentException("incorrect rating");
        this.rating = rating;
    }

    public String getRating() {
        return Arrays.toString(rating);
    }

    public String toString() {
        if (this.rating == null) {
            return this.name + ": Средняя оценка: 0";
        } else {
            return this.name + ": " + Arrays.toString(rating) + ", "+ "Средняя оценка: ";// + getAverage(rating) + excellent_student_check(rating);
        }
    }

//        public static  int getAverage ( int[] rating){
//            int average;
//            int num = 0;
//            int count = 0;
//            for (int i = 0; i < rating.length; i++) {
//                num += rating[i];
//                count++;
//            }
//            average = num / count;
//            return average;
//        }
//
//        public String excellent_student_check (int[] rating) {
//            if (rating == null) return "";
//            for (int i = 0; i < rating.length;) {
//                if (rating[i] == 5){
//                    i++;
//                }
//                else{
//                    return "";
//                }
//            }
//            return " - Отличник";
//        }
}

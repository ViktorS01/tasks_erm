package ru.sychev.student;

import ru.sychev.geometry.Point;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Student <T>{
    private String name;
    private Checker<T> ch;
    private Stack forRating = new Stack();


    public Student(String name, List rating, Checker<T> ch) {
        this.ch = ch;
        this.name = name;
        setRating(rating, ch);
    }

    public Student(String name){
        this.name = name;
    }

    public Student(){}

    public void setRating(List<T> rating, Checker<T> ch) {
        for (int i = 0; i < rating.size(); i++) {
            if (!ch.check(rating.get(i))) throw new IllegalArgumentException("incorrect rating");
            forRating.push(rating);
        }
    }

    public void addRating (T...rating){
        for(T p: rating)
            this.forRating.push(p);
    }

    public Stack getRating() {
        return forRating;
    }

    public String toString() {
        if (this.forRating.empty() == true) {
            return this.name + ": Средняя оценка: 0";
        } else {
            return this.name + ": " + forRating.toString(); //+ ", "+ "Средняя оценка: ";// + getAverage(rating) + excellent_student_check(rating);
        }
    }

    public  void undo(){
        forRating.pop();
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

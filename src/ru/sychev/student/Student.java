package ru.sychev.student;

import ru.sychev.geometry.Point;

import java.util.*;

public class Student <T>{
    private String name;
    private String name1;
    private Checker<T> ch;
    private List rates = new ArrayList();

    private Deque <Action> hist = new ArrayDeque<>();

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
            rates.add(rating);
        }
    }

    public void addRating (T rating){
            if (!ch.check(rating)) throw new IllegalArgumentException("incorrect rating");
            rates.add(rating);
            hist.push(()->rates.remove(rates.size()-1));
    }

    public  void setName (String name){
        String name1 = this.name;
        hist.push(()->this.name = name1);
        this.name = name;
    }

    public List getRating() {
        return rates;
    }

    public String toString() {
        if (this.rates == null) {
            return this.name + ": Средняя оценка: 0";
        } else {
            return this.name + ": " + rates.toString(); //+ ", "+ "Средняя оценка: ";// + getAverage(rating) + excellent_student_check(rating);
        }
    }

    public void undo(){
        hist.pop().action();
    }














    private class Memento implements Save{
        String name;
        List<Integer> arr;

        public Memento (String name, List arr){
            this.name = name;
            this.arr = new ArrayList(arr);
        }

        public void load (){
            Student.this.name = name;
            Student.this.rates = new ArrayList(arr);
        }
    }

    public Memento saveState (){
        return new Memento(name, rates);
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

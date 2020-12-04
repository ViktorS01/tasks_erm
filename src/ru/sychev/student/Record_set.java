package ru.sychev.student;
public class Record_set {
    String name_object;
    String surname_teacher;
    int rate;

    public Record_set (String name_object, String surname_teacher, int rate){
        this.name_object = name_object;
        this.rate = rate;
        this.surname_teacher = surname_teacher;
    }

    public String toString(){
        return name_object + ", " + rate + ", " + surname_teacher;
    }


}

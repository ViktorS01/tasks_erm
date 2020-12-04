package ru.sychev.student;

public class Record_book {
    long number;
    String name;
    Record_set[] recordset;

    public Record_book (long number, String name, Record_set[] recordset){
        this.name = name;
        this.number = number;
        this.recordset = recordset;
    }
    public String toString(){
        String result = name + ", " + number + ": ";

        for (int i = 0; i < recordset.length; i++ ){
            result += "\n" + "\t" + recordset[i];
        }
        return result;
    }
}

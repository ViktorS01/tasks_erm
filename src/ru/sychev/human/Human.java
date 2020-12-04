package ru.sychev.human;

public class Human {
    String name;
    String surname;
    String patronymic;

    public Human(String name, String patronymic,String surname){
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }

    public Human(String name){
        this.name = name;
    }

    public String toString()
    {
        String result = "";

        if (name != null)
            result += name + " ";

        if (patronymic != null)
            result += patronymic + " ";

        if (surname != null)
            result += surname;

        return result.trim();
    }
}
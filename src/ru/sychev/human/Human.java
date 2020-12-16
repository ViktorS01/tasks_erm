package ru.sychev.human;
//объект который умеет генерировать объект builder

public class Human {
    String name;
    String surname;
    String patronymic;

    public Human(String name, String patronymic,String surname){
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }
//
//    public Human(String name, String surname){
//        this.name = name;
//        this.surname = surname;
//    }
//
//    public Human(String name){
//        this.name = name;
//    }

    public static class NameBuilder {
        String name;
        String surname;
        String patronymic;

        public Human getName(){
            return new Human (name, patronymic, surname);
        }

        public NameBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public NameBuilder setPatronymic(String patronymic) {
            this.patronymic = patronymic;
            return this;
        }

        public NameBuilder setSurname(String surname) {
            this.surname = surname;
            return this;
        }
    }

    public static NameBuilder getNameBuilder (){
        return new NameBuilder();
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
package ru.sychev.human;

public class Person {
    private int height;
    Human human;
    final Person father;

    public Person (Person father, Human human, int height) {
        setHeight(height);

        this.human = human;
        this.father = father;

        GoToFather();
    }

    public Person (String name, int height){
        this(null, new Human(name, null,null), height);
    }

    public Person (Person father, String name, int height){
        this(father, new Human(name, null,null), height);
    }

    public Person ( Human human, int height){
        this( null, human, height);
    }

    public void setHeight(int height) {
        if (height < 0 || height > 500) throw new IllegalArgumentException("incorrect height");
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public Person getFather() {
        return father;
    }

    private void GoToFather (){
        if (this.father != null && this.father.human != null) {
            if (this.father.human.surname != null)
                this.human.surname = father.human.surname;

            if (this.father.human.name != null)
                this.human.patronymic = father.human.name + "ович";
        }
    }

    public String toString(){
        return human + " , " + height;
    }

    public Human getName() {
        return human;
    }

    public String getFullName(){
        return human.toString();
    }

    public void setName(Human human) {
        this.human = human;
        GoToFather();
    }
}
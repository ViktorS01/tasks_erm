package ru.sychev.work;

class Department {
    private String nameOfDepartment;

    private Person boss;

    public Department(String nameOfDepartment, Person boss){
        this.boss = boss;
        this.nameOfDepartment = nameOfDepartment;
    }

    public Department(String nameOfDepartment){
        this.nameOfDepartment = nameOfDepartment;
    }

    public String getNameOfDepartment() {
        return nameOfDepartment;
    }

    public Person getBoss() {
        return boss;
    }

    public void setBoss(Person person) {
        if (person.getDepartment() != this)
            throw new IllegalArgumentException();

        this.boss = person;
    }
}

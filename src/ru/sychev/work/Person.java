package ru.sychev.work;

public class Person {
    private String name;
    private Department department;

    public Person (String name, Department department){
        this.department = department;
        this.name = name;
    }

    public String toString (){
        if (name != department.getBoss().name) {
            return name + " работает в отделе " + department.getNameOfDepartment()
                    + " , начальник которого " + department.getBoss().name;
        }
        else {
            return name + " начальник отдела " + department.getNameOfDepartment();
        }
    }

    public Department getDepartment() {
        return department;
    }
}

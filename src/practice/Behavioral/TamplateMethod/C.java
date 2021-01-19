package practice.Behavioral.TamplateMethod;

public abstract class C {
    public void tempMethod(){
        System.out.println(1);
        dif();
        System.out.println(3);
    }

    public abstract void dif();
}

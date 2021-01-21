package practice.Tasks.Chain;

public class OtdelKadrov implements Otdel{
    Otdel otdel;

    public void next(Otdel otdel) {
        this.otdel = otdel;
    }

    public void toDo(String mess) {
        char [] mess2 = mess.toCharArray();
        for (char x : mess2){
            if (x == 'f'){
                accept(mess);
                break;
            }
            else notAccept(mess);
            break;
        }
    }

    public void accept(String mess){
        System.out.println("Принято otdel kadrov: " + mess);
        if (otdel != null){
            otdel.toDo(mess);
        }
    }

    public void notAccept(String mess){
        System.out.println("Отказано otdel kadrov: " + mess);
    }
}

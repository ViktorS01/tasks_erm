package practice.Tasks.Chain;

public class SafeOtdel implements Otdel{
    Otdel otdel;

    public void next(Otdel otdel) {
        this.otdel = otdel;
    }

    public void toDo(String mess) {
        char [] mess2 = mess.toCharArray();
        for (char x : mess2){
            if (x == 'g'){
                accept(mess);
                break;
            }
            else notAccept(mess);
            break;
        }
    }

    public void accept(String mess){
        System.out.println("Принято safe otdel: " + mess);
        if (otdel != null){
            otdel.toDo(mess);
        }
    }

    public void notAccept(String mess){
        System.out.println("Отказано safe otdel: " + mess);
    }
}

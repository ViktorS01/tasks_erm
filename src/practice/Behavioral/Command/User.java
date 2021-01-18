package practice.Behavioral.Command;

public class User {
    Command KostyaMes;
    Command OnWOT;
    Command Power;

    public User(Command commandKostyaMes, Command commandOnWOT, Command commandPower) {
        this.KostyaMes = commandKostyaMes;
        this.OnWOT = commandOnWOT;
        this.Power = commandPower;
    }

    public void message (){
        KostyaMes.execute();
    }

    public void WOT (){
        OnWOT.execute();
    }

    public void vkl (){
        Power.execute();
    }



}

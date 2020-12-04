package ru.sychev.animals;
import java.util.Random;

public class Parrot extends Bird {
    public String text;
    private Random random = new Random();

    public Parrot (String text){
        this.text = text;
    }
    @Override
    public void Song(){
        String newSong = randomText(1);
        System.out.println(newSong);
    }

    public void Song(int count){
        String newSong = randomText(count);
        System.out.println(newSong);
    }

    public String  randomText(int count) {
        char[] newText =  text.toCharArray();

        for(int i = 0; i < count; i++) {

            int firstSymbol = random.nextInt(newText.length);
            int secondSymbol = random.nextInt(newText.length);

            char temp = newText[firstSymbol];

            newText[firstSymbol] = newText[secondSymbol];
            newText[secondSymbol] = temp;

        }
        return new String (newText);
    }
}

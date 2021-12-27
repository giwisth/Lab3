import abstractclasses.Hero;
import animals.*;
import enums.Emotion;
import enums.Feeling;
import enums.Location;
import prog.Tale;

public class Main {
    public static void main(String[] args){
        Tale story = new Tale();
        Hero kenga = new Kenga("Кенга", Location.KENGAHOUSE, Emotion.NEUTRAL, Feeling.NEUTRAL);
        Hero pooh = new Pooh("Пух",Location.POOHHOUSE, Emotion.NOTFEAR,Feeling.NEUTRAL);
        Hero piglet = new Piglet("Пятачок", Location.UNKNOWN,Emotion.NEUTRAL,Feeling.NEUTRAL);
        Hero ru = new LittleRu("Крошка Ру", Location.KENGAHOUSE,Emotion.NEUTRAL,Feeling.NEUTRAL);
        Hero rabbit = new Rabbit("Кролик", Location.RABBITHOUSE,Emotion.NEUTRAL,Feeling.NEUTRAL);
        Tigra tigra = new Tigra("Тигра",Location.UNKNOWN,Emotion.NEUTRAL,Feeling.NEUTRAL);
        Bees bees = new Bees();

        story.setHeroes(pooh, piglet, tigra, rabbit, ru, kenga, bees);
        story.go();
    }
}

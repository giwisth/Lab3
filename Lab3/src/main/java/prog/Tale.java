package prog;

import abstractclasses.Hero;
import animals.Bees;
import animals.Tigra;
import enums.*;
import extensions.Extensions;
import java.util.Objects;

public class Tale {
    private Hero pooh;
    private Hero piglet;
    private Tigra tigra;
    private Hero rabbit;
    private Hero ru;
    private Hero kenga;
    private Bees bees;
    public void setHeroes(Hero pooh, Hero piglet, Tigra tigra, Hero rabbit, Hero ru, Hero kenga, Bees bees){
        this.pooh = pooh;
        this.piglet = piglet;
        this.tigra = tigra;
        this.rabbit = rabbit;
        this.ru = ru;
        this.kenga = kenga;
        this.bees = bees;
    }
    public void go(){
        pooh.getEmotion();
        Extensions.when();
        pooh.imagine("");
        bees.makeHoney();
        Extensions.today();
        pooh.pity("их");
        Extensions.printVoidLine();

        pooh.speakWith("это",piglet);
        Extensions.when();
        piglet.goTo(Location.POOHHOUSE);
        Extensions.printVoidLine();

        piglet.speak(", что");
        piglet.think("как");
        tigra.willSetFeeling(Feeling.COLD);
        tigra.willSetEmotion(Emotion.SADNESS);
        Extensions.when();
        tigra.loseSomeoneFake(Location.FOREST);
        Extensions.today();
        Extensions.printVoidLine();

        pooh.goToWith(piglet, Location.RABBITHOUSE);
        rabbit.speak(", что день самый подходящий для их затеи");
        Extensions.because();
        tigra.jump();
        Extensions.when();
        tigra.willDisappear();
        pooh.willRunAway();
        tigra.willNeverSee();
        Extensions.printVoidLine();

        pooh.goToWith(piglet, rabbit, Location.KENGAHOUSE);
        ru.getRelationship(Relationship.CLOSEFRIEND, tigra);
        ru.isWaiting(pooh,piglet,rabbit);
        ru.spoilIt();
        rabbit.cover(BodyPart.MOUTH,BodyPart.PAW);
        rabbit.whisper(pooh.getName(), "Положитесь на меня");
        rabbit.goTo(kenga);
    }

    public int hashCode(){
        return Objects.hash(pooh,piglet,tigra,rabbit,ru,kenga,bees);
    }
    public boolean equals(Object o){
        if (this == o) return true;
        if (o==null || getClass()!=o.getClass())return false;
        Tale h = (Tale) o;
        return Objects.equals(pooh, h.pooh) && Objects.equals(piglet,h.piglet) &&
                Objects.equals(tigra,h.tigra) && Objects.equals(rabbit,h.rabbit) &&
                Objects.equals(ru,h.ru) && Objects.equals(kenga,h.kenga) && Objects.equals(bees,h.bees);
    }
    public String toString(){
        return this.getClass()+"{" +"pooh='"+pooh+'\''+", piglet='"+
                piglet+'\''+", tigra='"+tigra+'\''+", rabbit='"+
                rabbit+'\''+", ru='"+ru+'\''+", kenga='"+kenga+'\''+", bees='"+bees+'\''+'}';
    }
}

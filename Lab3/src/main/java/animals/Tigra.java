package animals;

import abstractclasses.Hero;
import enums.Emotion;
import enums.Feeling;
import enums.Location;
import interfaces.LookingFor;
import interfaces.Lost;
import java.util.Objects;

public class Tigra extends Hero implements Lost, LookingFor{

    public Tigra(String name, Location location, Emotion emotion, Feeling feeling) {
        super(name, location, emotion, feeling);
    }
    public boolean seeSomeone() {
        return false;
    }

    public void see(Hero hero) {
        if(seeSomeone()){
            System.out.print(getName()+" видит "+hero.getName());
        }else{
            System.out.println(getName()+" никого не видит ");
        }
    }
    public void willNeverSee(){
        System.out.println(getName()+" больше никогда их не увидит ");
    }
    public void willDisappear() {
        System.out.println(getName()+" скроется из виду ");
    }
    @Override
    public void imagine(String s) {

    }
    @Override
    public void think(String s) {

    }
    public int hashCode(){
        return Objects.hash(name,location,emotion,feeling);
    }
    public boolean equals(Object o){
        if (this == o) return true;
        if (o==null || getClass()!=o.getClass())return false;
        Tigra h = (Tigra) o;
        return Objects.equals(name, h.name) && Objects.equals(location,h.location) &&
                Objects.equals(emotion,h.emotion) && Objects.equals(feeling,h.feeling);
    }
    public String toString(){
        return this.getClass()+"{" +"name='"+name+'\''+", location='"+location+'\''
                +", emotion='"+emotion+'\''+", feeling='"+feeling+'\''+'}';
    }
}

package animals;

import abstractclasses.Hero;
import enums.Emotion;
import enums.Feeling;
import enums.Location;
import java.util.Objects;

public class Rabbit extends Hero {

    public Rabbit(String name, Location location, Emotion emotion, Feeling feeling) {
        super(name, location, emotion, feeling);
    }
    public void imagine(String s) {

    }
    public void think(String s) {

    }
    public int hashCode(){
        return Objects.hash(name,location,emotion,feeling);
    }
    public boolean equals(Object o){
        if (this == o) return true;
        if (o==null || getClass()!=o.getClass())return false;
        Rabbit h = (Rabbit) o;
        return Objects.equals(name, h.name) && Objects.equals(location,h.location) &&
                Objects.equals(emotion,h.emotion) && Objects.equals(feeling,h.feeling);
    }
    public String toString(){
        return this.getClass()+"{" +"name='"+name+'\''+", location='"+location+'\''
                +", emotion='"+emotion+'\''+", feeling='"+feeling+'\''+'}';
    }
}

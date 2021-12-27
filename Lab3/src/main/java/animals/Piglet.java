package animals;

import abstractclasses.Hero;
import enums.Emotion;
import enums.Feeling;
import enums.Location;
import interfaces.Thoughts;

import java.util.Objects;

public class Piglet extends Hero implements Thoughts{

    public Piglet(String name, Location location, Emotion emotion, Feeling feeling) {
        super(name, location, emotion, feeling);
    }
    @Override
    public void think(String s) {
        System.out.println(getName()+ " думал не столько об этом, сколько о том, " + s);
    } 
    @Override
    public void imagine(String s) {
    }
    public int hashCode(){
        return Objects.hash(name,location,emotion,feeling);
    }
    public boolean equals(Object o){
        if (this == o) return true;
        if (o==null || getClass()!=o.getClass())return false;
        Piglet h = (Piglet) o;
        return Objects.equals(name, h.name) && Objects.equals(location,h.location) &&
                Objects.equals(emotion,h.emotion) && Objects.equals(feeling,h.feeling);
    }
    public String toString(){
        return this.getClass()+"{" +"name='"+name+'\''+", location='"+location+'\''
                +", emotion='"+emotion+'\''+", feeling='"+feeling+'\''+'}';
    }
}

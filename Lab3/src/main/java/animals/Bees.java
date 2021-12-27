package animals;

import abstractclasses.NonMainHeroes;
import java.util.Objects;

public class Bees extends NonMainHeroes{
    private boolean done = false;

    @Override
    public void honeyReadiness(boolean done){
        this.done = done;
    }
    @Override
    public void makeHoney() {
        if (done){
            System.out.println("пчёлы сделают мёд ");
        }else{
            System.out.print(" пчёлы не сделают мёд");
        }
    }
    public int hashCode(){
        return Objects.hash(done);
    }
    public boolean equals(Object o){
        if (this == o) return true;
        if (o==null || getClass()!=o.getClass())return false;
        Bees bee = (Bees) o;
        return Objects.equals(done, bee.done);
    }
    public String toString(){
        return this.getClass()+"{" +"done='"+done+'\''+'}';
    }
}

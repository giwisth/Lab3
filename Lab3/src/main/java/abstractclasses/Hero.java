package abstractclasses;

import animals.Tigra;
import enums.*;
import interfaces.*;
import java.util.Objects;

public abstract class Hero implements Talkable, Walkable, Actions, Status,  Wait, Thoughts {
    protected String name;
    protected Location location;
    protected Emotion emotion;
    protected Feeling feeling;
    
    public Hero(String name, Location location, Emotion emotion, Feeling feeling) {
        this.name = name;
        this.location = location;
        this.emotion = emotion;
        this.feeling = feeling;
    }

    @Override
    public void speak(String s){
        System.out.println(name + " сказал " + s);
    }
    public void speakWith(String s, Hero h){
        System.out.println(name + " сказал " + s +" "+ h.name);
    }
    @Override
    public void whisper(String h, String s) {
        System.out.println(name + " прошептал " + h + ": " + s);
    }
    public void cover(BodyPart bodyPart, BodyPart bodyPartSub){
        System.out.println(getName()+" прикрыл"+bodyPart.getDescription()+" своей"+bodyPartSub.getDescription());
    }
    @Override
    public void willRunAway(){
        System.out.println("Все убегут");
    }
    @Override
    public boolean isWaiting(Hero h1, Hero h2, Hero h3) {
        System.out.println(" тоже ждёт " + h1.name+", "+h2.name+" и "+h3.name);
        return true;
    }
    @Override
    public void jump() {
        System.out.println(name + " всегда выскакивает вперед ");
    }
    public void loseSomeoneFake(Location l){
        System.out.print(name +" как-будто потеряют в " + l.getDescription());
    }
    @Override
    public void goTo(Location location){
        this.location = location;
        System.out.println(name + " пришёл в " + location.getDescription()+".");
    }
    @Override
    public void goToWith(Hero h, Location location) {
        this.location = location;
        System.out.println(name + " и " + h.name + " пришли в " + location.getDescription()+".");
    }
    @Override
    public void goToWith(Hero h1, Hero h2, Location location) {
        this.location = location;
        System.out.println(name + ", " + h1.name + " и " + h2.name + " пришли в " + location.getDescription()+".");
    }
    @Override
    public void goTo(Hero hero) {
        System.out.println(name + " подошёл к " + hero.name);
    }
    @Override
    public Location getLocation(){
        return location;
    }
    @Override
    public void willSetEmotion(Emotion emotion){
        this.emotion = emotion;
        System.out.println(name + " станет " + emotion.getDescription());
    }
    @Override
    public void setEmotion(Emotion emotion){
        this.emotion = emotion;
        System.out.println(name + " стало " + emotion.getDescription());
    }
    public void pity(String s){
        this.emotion = Emotion.PITY;
        System.out.println(name + " стало жалко " + s);
    }
    @Override
    public Emotion getEmotion(){
        System.out.println(name+emotion.getDescription());
        return emotion;
    }
    @Override
    public void setFeeling(Feeling feeling){
        this.feeling = feeling;
        System.out.println(name + " стало " + feeling.getDescription());
    }
    @Override
    public void willSetFeeling(Feeling feeling){
        this.feeling = feeling;
        System.out.println(name + " станет " + feeling.getDescription());
    }
    @Override
    public Feeling getFeeling(){
        System.out.println(feeling.getDescription());
        return feeling;
    }
    public Relationship getRelationship(Relationship r, Tigra t){
        System.out.print(name+r.getDescription()+" "+ t.getName() +",");
        return r;
    }
    public void spoilIt(){
        System.out.println("Это портило всё дело");
    }
    public String getName(){
        return name;
    }
    public int hashCode(){
        return Objects.hash(name,location,emotion,feeling);
    }
    public boolean equals(Object o){
        if (this == o) return true;
        if (o==null || getClass()!=o.getClass())return false;
        Hero h = (Hero) o;
        return Objects.equals(name, h.name) && Objects.equals(location,h.location) &&
                Objects.equals(emotion,h.emotion) && Objects.equals(feeling,h.feeling);
    }
    public String toString(){
        return this.getClass()+"{" +"name='"+name+'\''+", location='"+location+'\''
                +", emotion='"+emotion+'\''+", feeling='"+feeling+'\''+'}';
    }

}

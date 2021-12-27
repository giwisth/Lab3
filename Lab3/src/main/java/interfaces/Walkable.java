package interfaces;

import abstractclasses.Hero;
import enums.Location;
public interface Walkable {
    public void goTo(Location location);
    public void goTo(Hero hero);
    public void goToWith(Hero h, Location location);
    public void goToWith(Hero h1,Hero h2,Location location);
    public Location getLocation();
}

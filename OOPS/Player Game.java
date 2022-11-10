import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
interface ISaveable{
    public List<String> write();
    public void read(List<String> list);
}

class Player implements ISaveable{
    private String name;
    private String weapon;
    private int hitPoints;
    private int strength;

    public Player(String name, int hitPoints, int strength){
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = "Sword";
    }

    public List<String> write(){
        List<String> list = new ArrayList<>();
        list.add(this.name);
        list.add(Integer.toString(this.hitPoints));
        list.add(Integer.toString(this.strength));
        list.add(this.weapon);

        return list;
    }

    public void read(List<String> list1){
        if(!list1.isEmpty() && list1.size()>0){
            this.name = list1.get(0);
            this.hitPoints = Integer.parseInt(list1.get(1));
            this.strength = Integer.parseInt(list1.get(2));
            this.weapon = list1.get(3);

        }
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setHitPoints(int hitPoints){
        this.hitPoints = hitPoints;
    }
    public int getHitPoints(){
        return hitPoints;
    }
    public void setStrength(int strength){
        this.strength = strength;
    }
    public int getStrength(){
        return strength;
    }
    public void setWeapon(String weapon){
        this.weapon = weapon;
    }
    public String getWeapon(){
        return weapon;
    }

    public String toString(){
        return "player{name='" + this.name+"', hitPoints=" + this.hitPoints
        + ", strength=" + this.strength + ", weapon='" + this.weapon + "'}";

    }
     
}


class Monster implements ISaveable{
    private String name;
    private int hitPoints;
    private int strength;
   
    public Monster(String name, int hitPoints,int strength){
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public List<String> write(){
        List<String> list = new ArrayList<>();
        list.add(this.name);
        list.add(Integer.toString(this.hitPoints));
        list.add(Integer.toString(this.strength));
        return list;
    }

    public void read(List<String> list2){
        if(!list2.isEmpty() && list2.size()>0){
            this.name = list2.get(0);
            this.hitPoints = Integer.parseInt(list2.get(1));
            this.strength = Integer.parseInt(list2.get(2));
        }
    }

    public String toString(){
        return "Monster{name='" + this.name + "', hitPoints=" + this.hitPoints +", strength=" + this.strength +"}";
            }

    public String getName(){
        return name;
    }
   
    public int getHitPoints(){
        return hitPoints;
    }
   
    public int getStrength(){
        return strength;
    }

}

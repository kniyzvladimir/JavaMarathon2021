package day11.task2;

public class Task2 {
    public static void main(String[] args) {
        Warrior warrior = new Warrior();
        Paladin paladin = new Paladin();
        Magician magician = new Magician();
        Shaman shaman = new Shaman();

        warrior.physicalAttack(paladin);
            System.out.println(paladin.toString());
        paladin.physicalAttack(magician);
            System.out.println(magician.toString());
        shaman.healTeammate(magician);
            System.out.println(magician.toString());
        magician.magicalAttack(paladin);
            System.out.println(paladin.toString());
        shaman.physicalAttack(warrior);
            System.out.println(warrior.toString());
        paladin.healHimself();
            System.out.println(paladin.toString());

        for (int i = 0; i < 5; i++){
            warrior.physicalAttack(magician);
            System.out.println(magician.toString());
        }

    }
}

abstract class Hero {
    public final int maxHEALTH = 100;
    public final int minHEALTH = 0;
    private int health;
    private double physDef;
    private double magicDef;
    private int physAtt;
    private int magicAtt;
    private String classHero;

    public int getHealth() {
        return health;
    }
    public double getPhysDef() {
        return physDef;
    }
    public double getMagicDef() {
        return magicDef;
    }
    public void setHealth(int health) {
        this.health = health;
    }

}

class Warrior extends Hero implements PhysAttack{
    private int health = 100;
    private double physDef = 0.8;
    private double magicDef = 0;
    private int physAtt = 30;
    private int magicAtt = 0;
    private String classHero = "Warrior";

    public int getHealth() {
        return health;
    }
    public double getPhysDef() {
        return physDef;
    }
    public double getMagicDef() {
        return magicDef;
    }
    public void setHealth(int health) {
        this.health = health;
    }

    public void physicalAttack(Hero hero){
        double locHealthD = hero.getHealth() - ((1 - hero.getPhysDef()) * this.physAtt);
        int locHealth = (int) locHealthD;
        if (locHealth < 0){
            hero.setHealth(0);
            System.out.println("Герой погиб");
        } else {
            hero.setHealth(locHealth);
        }
    }
    public String toString(){
        return this.classHero + "{health=" + this.getHealth() + "}";
    }

}

class Paladin extends Hero implements Healer, PhysAttack{
    private int health = 100;
    private double physDef = 0.5;
    private double magicDef= 0.2;
    private int physAtt = 15;
    private int magicAtt = 0;
    private int healHimself = 25;
    private int healTeammate = 10;
    private String classHero = "Paladin";

    public int getHealth() {
        return health;
    }
    public double getPhysDef() {
        return physDef;
    }
    public double getMagicDef() {
        return magicDef;
    }
    public void setHealth(int health) {
        this.health = health;
    }


    public void healHimself(){
        if(this.health + this.healHimself > maxHEALTH){
            this.health = maxHEALTH;
        } else {
            this.health += this.healHimself;
        }
    }
    public void healTeammate(Hero hero){
        if(hero.getHealth() + this.healTeammate > maxHEALTH){
            hero.setHealth(maxHEALTH);
        } else {
            hero.setHealth((hero.getHealth() + this.healTeammate));
        }
    }
    public void physicalAttack(Hero hero){
        double locHealthD = hero.getHealth() - ((1-hero.getPhysDef()) * this.physAtt);
        int locHealth = (int) locHealthD;
        if (locHealth < 0){
            hero.setHealth(0);
            System.out.println("Герой погиб");
        } else {
            hero.setHealth(locHealth);
        }
    }
    public String toString(){
        return this.classHero + "{health=" + this.getHealth() + "}";
    }
}

class Magician extends Hero implements PhysAttack, MagicAttack{
    private int health = 100;
    private double physDef = 0;
    private double magicDef = 80;
    private int physAtt = 5;
    private int magicAtt = 20;
    private String classHero = "Magician";

    public int getHealth() {
        return health;
    }
    public double getPhysDef() {
        return physDef;
    }
    public double getMagicDef() {
        return magicDef;
    }
    public void setHealth(int health) {
        this.health = health;
    }

    public void physicalAttack(Hero hero){
        double locHealthD = hero.getHealth() - ((1 - hero.getPhysDef()) * this.physAtt);
        int locHealth = (int) locHealthD;
        if (locHealth < 0){
            hero.setHealth(0);
            System.out.println("Герой погиб");
        } else {
            hero.setHealth(locHealth);
        }
    }
    public void magicalAttack(Hero hero){
        double locHealthD = hero.getHealth() - ((1 - hero.getMagicDef()) * this.magicAtt);
        int locHealth = (int) locHealthD;
        if (locHealth < 0){
            hero.setHealth(0);
            System.out.println("Герой погиб");
        } else {
            hero.setHealth(locHealth);
        }
    }
    public String toString(){
        return this.classHero + "{health=" + this.getHealth() + "}";
    }
}

class Shaman extends Hero implements Healer, PhysAttack, MagicAttack{
    private int health = 100;
    private double physDef = 20;
    private double magicDef = 20;
    private int physAtt = 10;
    private int magicAtt = 15;
    private int healHimself = 50;
    private int healTeammate = 30;
    private String classHero = "Shaman";

    public int getHealth() {
        return health;
    }
    public double getPhysDef() {
        return physDef;
    }
    public double getMagicDef() {
        return magicDef;
    }
    public void setHealth(int health) {
        this.health = health;
    }

    public void healHimself(){
        if(this.health + this.healHimself > maxHEALTH){
            this.health = maxHEALTH;
        } else {
            this.health += this.healHimself;
        }
    }
    public void healTeammate(Hero hero){
        if(hero.getHealth() + this.healTeammate > maxHEALTH){
            hero.setHealth(maxHEALTH);
        } else {
            hero.setHealth((hero.getHealth() + this.healTeammate));
        }
    }
    public void physicalAttack(Hero hero){
        double locHealthD = hero.getHealth() - ((1 - hero.getPhysDef()) * this.physAtt);
        int locHealth = (int) locHealthD;
        if (locHealth < 0){
            hero.setHealth(0);
            System.out.println("Герой погиб");
        } else {
            hero.setHealth(locHealth);
        }
    }

    public void magicalAttack(Hero hero){
        double locHealthD = hero.getHealth() - ((1 - hero.getMagicDef()) * this.magicAtt);
        int locHealth = (int) locHealthD;
        if (locHealth < 0){
            hero.setHealth(0);
            System.out.println("Герой погиб");
        } else {
            hero.setHealth(locHealth);
        }
    }
    public String toString(){
        return this.classHero + "{health=" + this.getHealth() + "}";
    }

}

interface Healer {
    void healHimself();
    void healTeammate(Hero hero);
}
interface PhysAttack{
    void physicalAttack(Hero hero);
}
interface MagicAttack{
    void magicalAttack(Hero hero);
}

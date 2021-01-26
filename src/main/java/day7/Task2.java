package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int randInt = random.nextInt(11) + 90;

        Player p1 = new Player(randInt);
        Player p2 = new Player(randInt);
        Player p3 = new Player(randInt);
        Player p4 = new Player(randInt);
        Player p5 = new Player(randInt);
        Player p6 = new Player(randInt);
        Player p7 = new Player(randInt);

        while(p1.getStamina() > 0){
            p1.run();
        }
        Player.info();


    }
}
class Player{
    private int stamina;
    Player(int stamina){
        this.stamina = stamina;
        if (countPlayers < 6){
            countPlayers++;
        }
    }

    private final int MAX_STAMINA = 100;
    private final int MIN_STAMINA = 0;
    private static int countPlayers = 0;

    public int getStamina(){
        return stamina;
    }
    public static int getCountPlayers(){
        return countPlayers;
    }
    public void run(){
        stamina--;
        if (stamina == MIN_STAMINA){
            System.out.println("Игрок покинул поле");
            countPlayers -= 1;
        }
    }
    public static void info(){
        if (countPlayers < 6){
            System.out.println("Команды не полные, количество свободных мест на поле: " + (6 - countPlayers));
        }else System.out.println("На поле нет свободных мес");
    }


}
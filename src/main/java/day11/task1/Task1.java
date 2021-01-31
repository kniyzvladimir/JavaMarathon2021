package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Picker p1 = new Picker();
        Picker p2 = new Picker();
        Courier c1 = new Courier();
        Courier c2 = new Courier();

        for (int i = 0; i != 6002; i++){
            p1.doWork(warehouse);
            p2.doWork(warehouse);
            c1.doWork(warehouse);
            c2.doWork(warehouse);
        }

        p1.bonus(warehouse);
        p2.bonus(warehouse);
        c1.bonus(warehouse);
        c2.bonus(warehouse);

        p1.bonus(warehouse);
        p2.bonus(warehouse);
        c1.bonus(warehouse);
        c2.bonus(warehouse);

        System.out.println(p1.getSalary());
        System.out.println(c1.getSalary());

    }
}
class  Warehouse{
    public static int countPickedOrders;
    public static int countDeliveredOrders;

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }
    public int getCountPickedOrders() {
        return countPickedOrders;
    }
    public String toString(){
        return "countPickedOrders - количество собранных заказов; countDeliveredOrders - количество доставленных заказов";
    }
}

class Picker implements Worker{
    private int salary;
    private int isPayed;
    private int stavkaZp = 80;

    Picker(){}

    public int getSalary() {
        return salary;
    }

    public int getIsPayed() {
        return isPayed;
    }

    public void setIsPayed(int isPayed) {
        this.isPayed = isPayed;
    }

    public String toString() {
        return "salary - заработная плата; isPayed - был выплачен бонус или нет";
    }

    public void doWork(Warehouse warehouse) {
        salary += stavkaZp;
        Warehouse.countPickedOrders += 1;
    }

    public void bonus(Warehouse warehouse) {
        if (Warehouse.countPickedOrders >= 10000 && this.getIsPayed() == 0) {
            this.setIsPayed(70000);
            System.out.println("Бонусачислен в размере" + this.getIsPayed());
        } else if (this.getIsPayed() > 0) {
            System.out.println("Бонус уже был выплачен");
        } else if (Warehouse.countPickedOrders < 10000) {
            System.out.println("Бонус пока не доступен");
        }
    }
}

class Courier implements Worker{
    private int salary;
    private int isPayed;
    private int stavkaZp = 100;

    Courier(){}

    public int getSalary() {
        return salary;
    }
    public int getIsPayed() {
        return isPayed;
    }

    public void setIsPayed(int isPayed) {
        this.isPayed = isPayed;
    }

    public String toString(){
        return "salary - заработная плата; isPayed - был выплачен бонус или нет";
    }

    public void doWork(Warehouse warehouse) {
        salary += stavkaZp;
        warehouse.countDeliveredOrders += 1;
    }
    public void bonus(Warehouse warehouse) {
        if (Warehouse.countPickedOrders >= 10000 && this.getIsPayed() == 0) {
            this.setIsPayed(50000);
            System.out.println("Бонусачислен в размере" + this.getIsPayed());
        } else if (this.getIsPayed() > 0) {
            System.out.println("Бонус уже был выплачен");
        } else if (Warehouse.countPickedOrders < 10000) {
            System.out.println("Бонус пока не доступен");
        }
    }
}

interface Worker{
    void doWork(Warehouse warehouse);
    void bonus(Warehouse warehouse);
}


package ADAPTER;

/**
 * Created by glab on 3/2/17.
 */
public class Adapter {

   public static void main(String[] args){

        EnemyTank rx7Tank = new EnemyTank();

        EnemyTank fredThetank = new EnemyTank();

        IEnemyattacker tankAdapter = new EnemyTankAdaqter(fredThetank );

        System.out.println("The Robot");

        fredThetank .assigndriver("Paul");
        fredThetank .driveforword();
        fredThetank .fireweapon();
        System.out.println();

        System.out.println("The Enemy Tank");

        rx7Tank.driveforword();
        rx7Tank.fireweapon();
        rx7Tank.assigndriver("Frank");
        System.out.println();

        System.out.println("The Robot with Adapter");

        tankAdapter.assigndriver("Mark");
        tankAdapter.driveforword();
        tankAdapter.fireweapon();

    }


}

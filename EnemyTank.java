package ADAPTER;

/**
 * Created by glab on 3/2/17.
 */
import java.util.Random;
public class EnemyTank implements IEnemyattacker {
    Random generator = new Random();
    @Override
    public void fireweapon() {
        int attackDamage = generator.nextInt(10) + 1;

        System.out.println("Enemy Tank Does " + attackDamage + " Damage");
    }

    @Override
    public void driveforword() {

        int attackDamage = generator.nextInt(10) + 1;

        System.out.println("Enemy Tank Does " + attackDamage + " Damage");

    }

    @Override
    public void assigndriver(String drivername) {
        int movement = generator.nextInt(5) + 1;

        System.out.println("Enemy Tank moves " + movement + " spaces");

    }
}

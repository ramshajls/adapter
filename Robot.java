package ADAPTER;

/**
 * Created by glab on 3/2/17.
 */
import java.util.Random;
public class Robot implements IEnemyattacker {

    Random generator = new Random();

    public void smashWithHands() {

        int attackDamage = generator.nextInt(10) + 1;

        System.out.println("Enemy Robot Causes " + attackDamage + " Damage With Its Hands");

    }
    @Override
    public void fireweapon() {

        int movement = generator.nextInt(5) + 1;

        System.out.println("Enemy Robot Walks Forward " + movement + " spaces");

    }

    @Override
    public void driveforword() {
        int movement = generator.nextInt(5) + 1;

        System.out.println("Enemy Robot Walks Forward " + movement + " spaces");


    }

    @Override
    public void assigndriver(String drivername) {

        System.out.println("Enemy Robot Tramps on " + drivername);

    }
}

package ADAPTER;

/**
 * Created by glab on 3/2/17.
 */
public class EnemyTankAdaqter implements IEnemyattacker {
    EnemyTank thetank;
    public EnemyTankAdaqter( EnemyTank newtank){

        thetank = newtank;

    }
    @Override
    public void fireweapon() {
        thetank.fireweapon();
    }

    @Override
    public void driveforword() {
        thetank.driveforword();

    }

    @Override
    public void assigndriver(String drivername) {
        thetank.assigndriver(drivername);

    }
}

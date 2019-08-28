import java.util.*;

public class EnemyShipTesting{
public static void main(String[] args) {
    EnemyShipFactor shipFactor = new EnemyShipFactor();

    EnemyShip theEnemy = null;
    
    Scanner userInput = new Scanner(System.in);

    System.out.println("What Type of ship? (U / R / B)");

    if(userInput.hasNextLine()){

        String typeOfShip = userInput.nextLine();
        theEnemy = shipFactor.makeEnemyShip(typeOfShip);

    }

    if(theEnemy != null){

        doStuffEnemy(theEnemy);
    }

    else System.out.println("Please only use letter U, R, or B next time");


    
}
public static void doStuffEnemy(EnemyShip anEnemyShip) {
    anEnemyShip.displayEnemyShip();

    anEnemyShip.followHeroShip();

    anEnemyShip.enemyShipShoots();
    
}
}
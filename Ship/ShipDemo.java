import java.util.ArrayList;
public class ShipDemo
   {
      public static void main(String[] args)
      {
         WindPoweredShip w1 = new WindPoweredShip(1000.0, 200.0, 5);
         WindPoweredShip w2 = new WindPoweredShip(3000.0, 400.0, 6);
         PropellerPoweredShip p1 = new PropellerPoweredShip(5000.0, 600.0, 7);
         PropellerPoweredShip p2 = new PropellerPoweredShip(7000.0, 800.0, 8);
         
         Ship[] ships = {w1, w2, p1, p2};
         
         for(Ship ship : ships)
         {
            System.out.println(ship);
         }
      }
   }

package BeingsOfEarth;
import LivingBeings.LivingBeings;
import SkyBeings.SkyBeing;
public class Human extends LivingBeings implements EarthBeing, SkyBeing {
    @Override
    public void born(){
        System.out.println("A new human has been born!");
    }
    @Override
    public void grow(){
        System.out.println("The human has grown!");
    }
    @Override
    public void reproduce(){
        System.out.println("The human has had children!");
    }
    @Override
    public void die(){
        System.out.println("The human has died!");
    }
    @Override
    public void respawn(){
        System.out.println("The human has respawned!");
    }
    @Override
    public void fly(){
        System.out.println("The human is flying!!!!");
    }
    public void changeDimension(){
        System.out.println("The human has traveled to another dimension!");
    }
}


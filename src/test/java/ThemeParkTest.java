import attractions.*;
import org.junit.Before;
import org.junit.Test;
import stalls.*;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {
    ThemePark themePark;
    RollerCoaster rollerCoaster;
    Playground playground;
    Park park;
    Dodgems dodgems;
    ArrayList<Attraction>attractions;
    CandyflossStall candyflossStall;
    IceCreamStall iceCreamStall;
    TobaccoStall tobaccoStall;
    ArrayList<Stall>stalls;
    @Before

    public void begore() {
        rollerCoaster=new RollerCoaster("GrandPix",3);
        playground=new Playground("CricketPlay",4);
        park=new Park("KidZone",5);
        dodgems=new Dodgems("CarRide",5);
        iceCreamStall=new IceCreamStall("CoolCool","Sree", ParkingSpot.A1);
        tobaccoStall=new TobaccoStall("LoveToba","Uday", ParkingSpot.A2);
        candyflossStall=new CandyflossStall("CandyWorld","Ved", ParkingSpot.A3);
        attractions= new ArrayList<>();
        stalls=new ArrayList<>();
        attractions.add(rollerCoaster);
        attractions.add(playground);
        attractions.add(park);
        attractions.add(dodgems);
        stalls.add(iceCreamStall);
        stalls.add(tobaccoStall);
        stalls.add(candyflossStall);

        themePark = new ThemePark(attractions,stalls);
    }
    @Test
    public void hasAttractions(){
        assertEquals(4,attractions.size());
    }
    @Test
    public void hasStalls(){
        assertEquals(3,stalls.size());
    }


}
import attractions.*;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;
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
    Visitor visitor;
    Visitor visitor1;
    Visitor visitor2;
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
        visitor = new Visitor(15,200,200);
        visitor1 = new Visitor(10,200,200);
        visitor2 = new Visitor(12, 200, 200);
    }
    @Test
    public void hasAttractions(){
        assertEquals(4,attractions.size());
    }
    @Test
    public void hasStalls(){
        assertEquals(3,stalls.size());
    }

    @Test
    public void checkReviewedStalls(){
        assertEquals(7,themePark.getAllReviewed().size());
    }
    @Test
    public void checkVisitorVisit(){
        themePark.visit(visitor,rollerCoaster);
        themePark.visit(visitor,playground);
        assertEquals(2,visitor.getVisitedlist());
    }
    @Test
    public void checkVisitCountOfRollerCoaster(){
        themePark.visit(visitor,rollerCoaster);
        themePark.visit(visitor2,rollerCoaster);
        assertEquals(2,rollerCoaster.getVisitCount());
    }
    @Test
    public void getHashRatings(){
        System.out.println(themePark.getallReviews());
    }

    @Test
    public void checkVisitorsAllowedlist(){
        themePark.getAllReviewed();
        System.out.println(themePark.getAllAllowedFor(visitor));
    }
    @Test
    public void checkVisitorsUnderAgedAllowedlist(){
        themePark.getAllReviewed();
        System.out.println(themePark.getAllAllowedFor(visitor1));
    }

}

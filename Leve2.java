import java.util.*;
import greenfoot.*;
import java.awt.Color;
/**
 * Write a description of class Leve1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Leve2 extends Background
{
     private int fish_;
    private int speed_;
     private Shark player_;

    /**
     * Constructor for objects of class Leve1.
     * 
     */
    public Leve2()
    {
        super ();
        populate(30);
        setSpeed(super.getSpeed()+2);
         Shark.fishCount_=0;
    }


}

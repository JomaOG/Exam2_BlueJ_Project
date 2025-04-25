import java.util.*;

/**
 * Write a description of class PracticeQuestion25 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PracticeQuestion25
{
    // instance variables - replace the example below with your own
    
    /**
     * Constructor for objects of class PracticeQuestion25
     */
    public PracticeQuestion25()
    {
        
    }
    
    public void fever(ArrayList<Double> temperatures) {
        // Question 25
        int count = 0;
        double max = 0.0;
        for(double temp : temperatures) {
            if(temp > 37.5) { count++; }
            if(max < temp) {max = temp;}
        }
        System.out.println("fevers #:" +count);
        System.out.println("max temp:" +max);
        
        // Question 26
        System.out.println(Collections.max(temperatures));
        
        // Question 27
        Collections.sort(temperatures);
        System.out.println(temperatures.getLast());
        
    }
}

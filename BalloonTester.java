/*I affirm that this program is entirely 
 *my own work and none of it is the work of any other person.
 *@author Alina Lebron - Section 1
 */
 
public class BalloonTester 
{
        //create a main class
    
        public static void main(String[] args)
        
        {
                /*Step 1&2: create two objects - one with an altitude of 100
                *2nd one with an altitude of -100 meters
                */
            
            Balloon redBalloon = new Balloon("redBalloon", 100) ;
            Balloon blueBalloon = new Balloon("blueBalloon", -100) ;
            
            
            /* Step 3: Call the accessor methods of the Balloon class to get
             * the name and altitude of each Balloon object. 
             * Print the data, one object per line.
             */ 
            
           
            //declaring variables for the first object (redBalloon)
            
            String theName ;
            int theAltitude ;
            
            // Calling the accessor methods for redBalloon to print the data
            
            theName = redBalloon.getName() ;
            theAltitude = redBalloon.getAltitude() ;
            
            System.out.println("The name of the first balloon is " + theName + 
                    "," + " and its altitude is at " + theAltitude 
                    + " meters.") ;
            
            /* Calling the accessor methods for blueBalloon to print the data
             * using @param theNameB and @param theAltitudeB
             */
         
            String theNameB ;
            int theAltitudeB ;
            
            theNameB = blueBalloon.getName() ;
            theAltitudeB = blueBalloon.getAltitude() ;
            
            System.out.println("The name of the second balloon is " + theNameB + 
                    "," + " and its altitude is at " + theAltitudeB 
                    + " meters.") ;
                    // Receiving logic error *** it's supposed to say - 100 meters
            
            //Step 4: Make redBalloon ascend 250 meters
            
            redBalloon.ascendTo(250);
            
            //Step 5: Make blueBalloon adjust the altitude by 150 meters
            
            blueBalloon.adjustAltitude(150) ;
            
            //Step 6: Print the name and new altitudes of each object
            
            theName = redBalloon.getName() ;
            theAltitude = redBalloon.getAltitude() ;
            
            System.out.println("The name of the first balloon is " + theName + 
                    "," + " and its altitude is at " + theAltitude 
                    + " meters.") ;
            
           
            theNameB = blueBalloon.getName() ;
            theAltitudeB = blueBalloon.getAltitude() ;
            
            System.out.println("The name of the second balloon is " + theNameB + 
                    "," + " and its altitude is at " + theAltitudeB
                    + " meters.") ;
            
            
            //Step 7: decrease the altitude of redBalloon by 150 meters
            
            redBalloon.adjustAltitude(-150);
            
            /* Step 8: Make blueBalloon descend to the same altitude as
             *the other object
            */
            
            theAltitude = redBalloon.getAltitude() ;
            theAltitudeB = redBalloon.getAltitude() ;
            
            blueBalloon.descendTo(theAltitudeB) ;
            
            /*Step 9: Call the accessor methods to get the name and 
             *altitude of each object. Print the data, one object per line.
             */
            
         System.out.println("The name of the first balloon is " + theName + 
                    "," + " and its altitude is at " + theAltitude 
                    + " meters.") ;
         
         System.out.println("The name of the second balloon is " + theNameB + 
                    "," + " and its altitude is at " + theAltitudeB
                    + " meters.") ;
         
         /*Step 10: Move redBalloon
           *to an altitude that is four times its current altitude
          */
        
         redBalloon.ascendTo(theAltitude*4) ;
         
         theAltitude = redBalloon.getAltitude() ;
         
         /*Step 11: Attempt to move blueBalloon to an altitude 
          *that is 150 meters below its current altitude
          */
         
         blueBalloon.descendTo(-150) ;
         
         /*Step 12: Call the accessor methods to get the name 
          *and altitude of each object. Print the data, one object per line
          */      
         
         theAltitudeB = blueBalloon.getAltitude() ;
         
         
         System.out.println("The name of the first balloon is " + theName + 
                    "," + " and its altitude is at " + theAltitude 
                    + " meters.") ;
         
         System.out.println("The name of the second balloon is " + theNameB + 
                    "," + " and its altitude is at " + theAltitudeB
                    + " meters.") ;
            }
    
}

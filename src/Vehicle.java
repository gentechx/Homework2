/**
 * Created by Exustior on 3/11/2017.
 */
public class Vehicle {
    double fuel;
    double mpg;
    double baseMpg;
    double scaleFactor;
    int currentSpeed;



public static void updateMpg(double baseMpg, double scaleFactor, int currentSpeed) {

    double mpg;

    mpg = baseMpg-(scaleFactor*currentSpeed) + (Math.pow(0.02718281828,(currentSpeed)/20));


}

}
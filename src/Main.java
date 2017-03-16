import java.io.FileReader;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


/**
 * Created by Exustior on 3/11/2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {

        Scanner s = null;

        try {
            s = new Scanner(new BufferedReader(new FileReader("D:\\Homework2\\src\\car_data.csv")));

            while (s.hasNext()) {


                System.out.println(s.next());
            }
        } finally {
            if (s != null) {
                s.close();
            }
        }


        Car car = new Car();
        ArrayList<Car> CarList = new ArrayList<Car>();
        CarList.add(car);

        PrintWriter outputFile = new PrintWriter("processed_cars.txt");
        outputFile.println(car);
        outputFile.close();






    }

    static class Car extends Vehicle {
        private String make;

        public String getMake() {
            return make;
        }

        public void setMake(String make) {
            this.make = make;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        private String model;


    }



}

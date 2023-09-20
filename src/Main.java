import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList; // import the ArrayList class


public class Main {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        int quantity = myObj.nextInt();

        if(quantity < 1 || quantity>20){
            System.out.println("Enter number between 1 and 20");
            return;
        }

        Random random = new Random();
        int quantity_laptop = 0;
        int quantity_smartphone = 0;
        int quantity_tablet = 0;
        double total_price = 0;
        double total_weight = 0;

        ArrayList<Double> price_list = new ArrayList<>();
        ArrayList<Double> weight_list = new ArrayList<>();

        for(int i =0; i < quantity; i++){
            int random_number = random.nextInt(30);
            if(random_number <= 10){
                Smartphone apple = new Smartphone();
                apple.setPrice(random.nextDouble(20000));
                apple.setWeight(random.nextDouble(5));

                price_list.add(apple.getPrice());
                weight_list.add(apple.getWeight());
                quantity_smartphone += 1;
            } else  if(random_number <= 20){
                Laptop hp = new Laptop();
                hp.setPrice(random.nextDouble(20000));
                hp.setWeight(random.nextDouble(5));

                price_list.add(hp.getPrice());
                weight_list.add(hp.getWeight());
                quantity_laptop += 1;
            } else {
                Tablet sumsung = new Tablet();
                sumsung.setPrice(random.nextDouble(20000));
                sumsung.setWeight(random.nextDouble(5));

                price_list.add(sumsung.getPrice());
                weight_list.add(sumsung.getWeight());
                quantity_tablet += 1;
            }


        }

        for(int j = 0; j < quantity; j++){
            total_price += price_list.get(j);
            total_weight += weight_list.get(j);
        }
        System.out.println("Total Price: " + total_price);
        System.out.println("Total weight: " + total_weight + " kg");
        System.out.println("Smartphone: " + quantity_smartphone);
        System.out.println("Laptop: " + quantity_laptop);
        System.out.println("Tablet: " + quantity_tablet);
    }
}
public class Main{
    
    public static void main(String[] args){
        Car mycar = new Car();
        mycar.brand = "Mercedez-Benz";
        mycar.color = "grey";
        mycar.speed = 100;

        // System.out.println(mycar.brand);
        mycar.displayInfo();
    }
}
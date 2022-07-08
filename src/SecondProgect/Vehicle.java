package SecondProgect;

public class Vehicle {
    double vehiclePrice;
    double calculateSalesPrice(){
        return vehiclePrice;
    }
}
class Truck extends Vehicle {
    double vehiclePrice=150000;
    double weight;
    double calculateSalesPrice(double weight) {
        if (weight > 2000) {
            vehiclePrice=vehiclePrice-(vehiclePrice*10/100);
        } else{
            vehiclePrice=vehiclePrice-(vehiclePrice*20/100);
        }
        return vehiclePrice;
    }
}
class Sedan extends Vehicle {
    double vehiclePrice=20000;
    double length;
    double calculateSalesPrice(double lenght) {
        if(length>20){
            vehiclePrice=vehiclePrice-(vehiclePrice*5/100);
        }else{
            vehiclePrice=vehiclePrice-(vehiclePrice*10/100);
        }
        return vehiclePrice;
    }
}
class VehicleTester{
    public static void main(String[] args) {
        Truck truck=new Truck();
        System.out.println("The sale price of truck is "+truck.calculateSalesPrice(6000));

        Sedan sedan=new Sedan();
        System.out.println("The sale price of sedan is "+sedan.calculateSalesPrice(14.7));
    }
}

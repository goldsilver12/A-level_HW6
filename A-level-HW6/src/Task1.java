public class Task1 {

    public static void main(String[] args) {

        Phone testPhone1 =  new Phone(
                "380991828079",
                "Apple Iphone 12",
                0.134 );

        Phone testPhone2 =  new Phone(
                "380999999999",
                "Samsung S20");
        testPhone2.weight = 0.155;

        Phone testPhone3 =  new Phone();
        testPhone3.number = "380992121212";
        testPhone3.model = "Samsung J5";
        testPhone3.weight = 0.279;

        testPhone1.displayInfo();
        testPhone2.displayInfo();
        testPhone3.displayInfo();

        testPhone1.receiveCall("Vlad");
        testPhone1.receiveCall("Elizabeth");
        testPhone1.receiveCall("Ann");


    }

}

class Phone {

    String number;
    String model;
    double weight;

   public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

   public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(){

    }
    public static void receiveCall(String name){
        System.out.println(name + " is calling you!" );
        System.out.println();
    }

   public String getNumber(){
       return number;
   }

   public void displayInfo(){
       System.out.println("Phone number: " + number + "\nPhone model: " + model + "\nPhone weight: " + weight);
       System.out.println();
   }

}

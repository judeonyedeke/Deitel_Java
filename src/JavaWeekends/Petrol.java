package JavaWeekends;

public class Petrol {

    public static void main(String[] args){

        PetrolPurchase myPetrolPurchase = new PetrolPurchase("Alabama", "Diesel", 1000, 20, 5, 0.25);

        System.out.printf("Station Location is: %s%n", myPetrolPurchase.getStationLocation());
        System.out.printf("Petrol type is: %s%n", myPetrolPurchase.getPetrolType());
        System.out.printf("Petrol quantity is: %d%n", myPetrolPurchase.getPetrolQuantity());
        System.out.printf("I purchased %d litres%n", myPetrolPurchase.getLitrePurchase());
        System.out.printf("Petrol was sold at $%d%n", myPetrolPurchase.getPetrolPrice());
        System.out.printf("The discount per litre: %.2f%n", myPetrolPurchase.getPetrolDiscount());

        System.out.printf("The net amount is: %.2f%n", myPetrolPurchase.getPurchaseAmount());


    }
}

package JavaWeekends;

public class PetrolPurchase {

    private String stationLocation;
    private String petrolType;
    private int petrolQuantity;
    private int litrePurchase;
    private int petrolPrice;
    private double petrolDiscount;

    public PetrolPurchase(String stationLocation, String petrolType,int petrolQuantity, int litrePurchase, int petrolPrice, double petrolDiscount){
        this.stationLocation = stationLocation;
        this.petrolType = petrolType;
        this.petrolQuantity = petrolQuantity;
        this.litrePurchase = litrePurchase;
        this.litrePurchase = litrePurchase;
        this.petrolPrice = petrolPrice;
        this.petrolDiscount = petrolDiscount;
    }


        public void setStationLocation (String stationLocation){
            this.stationLocation = stationLocation;
        }

        public String getStationLocation () {
            return stationLocation;
        }

        public void setPetrolType (String petrolType){
            this.petrolType = petrolType;
        }

        public String getPetrolType () {
            return petrolType;
        }

        public void setPetrolQuantity ( int petrolQuantity){
            this.petrolQuantity = petrolQuantity;
        }

        public int getPetrolQuantity () {
            return petrolQuantity;
        }

        public void setLitrePurchase (int litrePurchase){
            this.litrePurchase = litrePurchase;
        }

        public int getLitrePurchase () {
            return litrePurchase;
        }

        public void setPetrolPrice ( int petrolPrice){
            this.petrolPrice = petrolPrice;
        }

        public int getPetrolPrice () {
            return petrolPrice;
        }

        public void setPetrolDiscount ( int petrolDiscount){
            this.petrolDiscount = petrolDiscount;
        }

        public double getPetrolDiscount () {
            return petrolDiscount;
        }

        public double getPurchaseAmount(){

        double netAmount = petrolPrice * petrolQuantity - petrolDiscount;

        return netAmount;

        }
}

public class PhysicalPerson extends Client {

    public void put(double amountToPut) {
        if (amountToPut > 0) {
            super.put(amountToPut);
        }
    }

    public void take(double amountToTake) {
        super.take(amountToTake);
    }

}

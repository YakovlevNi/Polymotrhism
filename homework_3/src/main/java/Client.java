public abstract class Client {
    private double moneyAmount = 0;

    public double getAmount() {

        return moneyAmount;
    }

    public void put(double amountToPut) {
        if (amountToPut > 0) {
            moneyAmount = moneyAmount + amountToPut;
        }

    }

    public void take(double amountToTake) {
        if (moneyAmount > amountToTake) {
            moneyAmount = moneyAmount - amountToTake;
        }

    }

}

public class LegalPerson extends Client {
    public void take(double amountToTake) {
        super.take(amountToTake + ((amountToTake / 100) * 1));
    }
}

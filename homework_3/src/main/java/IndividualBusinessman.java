public class IndividualBusinessman extends Client {
    @Override
    public void put(double amountToPut) {
        if (amountToPut < 1000 && amountToPut > 0) {
            super.put(amountToPut - ((amountToPut / 100) * 1));
        }
        if (amountToPut >= 1000) {
            super.put(amountToPut - ((amountToPut / 100) * 0.5));
        }
    }

    public void take(double amountToTake) {
        super.take(amountToTake);
    }
}


public class CreditPaymentService {
    public int calculate(int term, int amount) {
        double percent = 9.99;
        double inter1 = percent / 12 / 100;
        double inter2 = Math.pow(1 + inter1,term);
        double inter3 = inter2 - 1;
        double coef = inter1 * inter2 / inter3;
        int payment = (int) (coef * amount);

        return payment;
    }
}

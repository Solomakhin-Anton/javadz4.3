public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int amount = 1_000_000;

        int creditPaymentOneYear = service.calculate(12, amount);
        System.out.println(creditPaymentOneYear);

        int creditPaymentTwoYears = service.calculate(24, amount);
        System.out.println(creditPaymentTwoYears);

        int creditPaymentThreeYears = service.calculate(36, amount);
        System.out.println(creditPaymentThreeYears);
    }
}

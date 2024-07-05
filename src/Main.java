public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        System.out.println(service);
        int weightKg = 70;
        double heightM = 1.84;
        int bmi = service.calculate(weightKg, heightM);
        System.out.println("BMI:"+ bmi);
    }
}
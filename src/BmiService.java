public class BmiService {
    public double calculate (int weightKg, double heightM) {
        double result;
        result = (weightKg / (heightM * heightM));
        return result;
    }
}
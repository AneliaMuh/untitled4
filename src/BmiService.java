public class BmiService {
    public int calculate (int weightKg, double heightM) {
        double result;
        result = (weightKg / (heightM * heightM));
        return (int) result;
    }
}
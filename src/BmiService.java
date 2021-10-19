public class BmiService {
    public double calculate(double weight, double height) {
        double heightCm = height / 100;
        double bmi = weight / (heightCm * heightCm);
        return bmi;
    }
}

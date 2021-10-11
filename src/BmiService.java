public class BmiService {
    public double calculate(double weight, double height) {
        double height_cm = height / 100;
        double bmi = weight / (height_cm * height_cm);
        return bmi;
    }
}

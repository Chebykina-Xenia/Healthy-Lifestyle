public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 164;
        double weight = 85.5;
        double bmi = service.calculate(weight, height);
        System.out.println(bmi);
    }
}
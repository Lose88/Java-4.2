public class BmiService {
    public double calculate(double w, double h) {
        double bmiIndex;
        bmiIndex = w / (h * 2);
        return bmiIndex;

    }
}

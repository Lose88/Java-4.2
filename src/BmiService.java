public class BmiService {
    public double calculate(double weight, double height) {
        double bmiIndex;
        bmiIndex = weight / (height * height);
        return bmiIndex;
    }
}




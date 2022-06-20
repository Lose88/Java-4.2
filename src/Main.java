public class Main {

    public static void main(String[] args) {

        BmiService service = new BmiService();
        double weight = 100.0;
        double height = 1.86;
        service.pow(height);


        double index = service.calculate(weight, service.pow(height));
        System.out.println("Ваш индекс массы тела: " + index);

    }
}
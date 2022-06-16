public class Main {

    public static void main(String[] args) {

        BmiService service = new BmiService();
        double index = service.calculate(98.0, 1.86);
        System.out.println("Ваш индекс массы тела: " + index);

    }
}
public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        double bmi = service.calculate(1.67, 72);
        System.out.println("Индекс массы Вашего тела:" + bmi);

    }
}

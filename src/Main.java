public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float weight = 56f;
        float height = 1.68f;
        float bmi = service.calculate(weight, height);
        System.out.println("Ваш индекс массы тела равен " + bmi);
    }
}
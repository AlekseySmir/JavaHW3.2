public class BmiService {

    public double calculate(double high, int weight) {

        double result = weight/(high*high);

        return result;
    }
}

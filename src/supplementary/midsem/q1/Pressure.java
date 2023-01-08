package supplementary.midsem.q1;

public class Pressure {
    public static void main(String[] args) {
        Pressure obj = new Pressure();
        System.out.println(obj.gasLaw(5, 25, 10));
    }

    public float gasLaw(int R, int T, int V) {
        float pressure = (float)(R * T) / (float)(V);
        return pressure;
    }
}

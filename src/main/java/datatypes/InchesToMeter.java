package datatypes;

import java.math.RoundingMode;

public class InchesToMeter {

    public static void main(String[] args) {
        float inches = 100f;
        float meter = inchesToMeter(inches);
        System.out.println(meter+" mt");
    }
    static float inchesToMeter(float value) {
        return value * 0.0254f;

    }
}

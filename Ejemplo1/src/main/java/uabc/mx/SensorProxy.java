package uabc.mx;

import java.util.ArrayList;
import java.util.Random;

public class SensorProxy {
    //La idea es simular que mediante otros medios, las
    //variables de sensores son actualizadas de manera paralela.
    ArrayList<Float> sensores;
    Random random;
    public SensorProxy() {
        random = new Random();
        sensores = new ArrayList<Float>(2);
        sensores.add(0.0F);
        sensores.add(0.0F);
    }

    public void leerSensores() {
        sensores.set(0,random.nextFloat());
        sensores.set(1,random.nextFloat());
    }

    public void updateData() {
        leerSensores();
        for (Float sensor: sensores) {
            System.out.print(sensor);
            System.out.print(" ");
        }
        System.out.println();
    }
}

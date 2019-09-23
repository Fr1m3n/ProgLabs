import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // Пункт 1
        short[] y = new short[13];
        for(short i = 4; i < 17; i++){
            y[i - 4] = i;
        }
        // ------

        // Пункт 2

        float[] x = new float[12];
        Random rand = new Random();
        for(int i = 0; i < 12; i++){
            x[i] = rand.nextFloat() * 19.0f - 5.0f;
        }
        // -------

        // Пункт 3
        double[][] p = new double[13][12];
        for(int i = 0; i < 13; i++){
            for(int j = 0; j < 12; j++){
                double localX = x[j];
                // sin(e^((x*(x-3))^2))
                if(y[i] == 9){
                    p[i][j] = Math.sin(Math.pow(Math.E, Math.pow(localX * (localX - 3.0d), 2.0d)));
                } else if(y[i] == 4 || y[i] >= 7 && y[i] <= 12){
                    p[i][j] = Math.tan(Math.pow(Math.E, Math.tan(localX)));
                } else {
                    p[i][j] = Math.atan(1.0d / Math.pow(Math.E, Math.pow(3.0d / (Math.pow(Math.cos(Math.exp(Math.pow((localX + 2.0d), 2.0d))) ,2.0d) + 1) ,Math.cbrt(Math.pow(0.5d / (2.0d + localX), 2.0d) * (Math.pow(Math.E, localX) + 1.0d)))));
                }
                //System.out.println(String.valueOf(p[i][j]) + " y[i] == " + String.valueOf(y[i]) + " x[j] == " + String.valueOf(x[j]));
            }
        }
        // -------

        // Пункт 4
        for(int i = 0; i < 13; i++){
            //System.out.print(String.valueOf(i) + ' ');
            for(int j = 0; j < 12; j++){
                System.out.print(String.format("%.2f ", p[i][j]));
            }
            System.out.println();
        }
        // -------
    }
}

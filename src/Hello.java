public class Hello {
    public static void main(String[] args) {
        byte p = 18;
        short[] a = new short[8];
        for (int i = 0; i < a.length; i++) {
            a[i] = p;
            p -= 2;
        }
        double[] x = new double[16];
        for (int i = 0; i < x.length; i++) {
            x[i] = Math.random() * (12 + 4) - 4;
        }
        double[][] matritsa = new double[8][16];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 16; j++) {
                if (a[i] == 4) {
                    matritsa[i][j] = 3 / (Math.sin(Math.pow(2 * x[j], 2)) - 1);
                } else if (a[i] == 10 || a[i] == 12 || a[i] == 14 || a[i] == 16) {
                    matritsa[i][j] = (1 - Math.atan(Math.pow(((x[j] + 4) / 16), 2))) / 1 / 3;
                } else {
                    matritsa[i][j] = Math.pow(Math.asin(Math.pow(1 / (Math.pow(Math.E, Math.abs(x[j]))), 2)), 3 * (1 -
                            Math.pow((Math.atan(1 / Math.pow(Math.E, Math.abs(x[j])))) / (3), (x[j] - 0.25) / Math.sin(x[j]))));
                }
            }
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 16; j++) {
                System.out.printf("%9.3f", matritsa[i][j]);
            }
            System.out.print("\n");
        }
    }
}
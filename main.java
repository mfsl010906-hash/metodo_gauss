public class main {
    public static void main(String[] args) {
        double[][] matriz = defmatrizz.defmatriz();

        Gauss.eliminacionGaussiana(matriz);
        double[] solucion = Gauss.sustiticionRegresiva(matriz);

        System.out.println("Solución del sistema de ecuaciones:");
        for (int i = 0; i < solucion.length; i++) {
            System.out.printf("x[%d] = %.4f%n", i, solucion[i]);
        }
    }
}
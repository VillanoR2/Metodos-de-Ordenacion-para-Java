import java.util.Arrays;

public class main {
    public static void main(String[] args) {

        Intercalacion ordenar = new Intercalacion();
        int vector1[] = { 5, 6, 7, 33, 44, 1, 7 };
        int vector2[] = { 2, 56, 789, 456, 4 };

        System.out.println("Arreglos Originales");
        System.out.print("Vector 1: ");
        ordenar.mostrarArreglo(vector1);
        System.out.print("Vector 2: ");
        ordenar.mostrarArreglo(vector2);
        Arrays.sort(vector1);
        Arrays.sort(vector2);
        System.out.println("Arreglos Originales Ordenados");
        System.out.print("Vector 1: ");
        ordenar.mostrarArreglo(vector1);
        System.out.print("Vector 2: ");
        ordenar.mostrarArreglo(vector2);
        System.out.println("Vector Resultante Ordenado por Intercalacion");
        ordenar.intercalacion(vector1, vector2);

    }
}

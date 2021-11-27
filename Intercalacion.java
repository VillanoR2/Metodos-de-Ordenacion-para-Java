import javax.sound.sampled.SourceDataLine;

public class Intercalacion {
    public void intercalacion(int[] arregloA, int[] arregloB) {
        int i = 0, j = 0, k = 0;
        int arregloC[] = new int[arregloA.length + arregloB.length];
        int pasadas = 0;

        while (i < arregloA.length && j < arregloB.length) {
            if (arregloA[i] < arregloB[j]) {
                arregloC[k] = arregloA[i];
                i++;
                pasadas++;
            } else {
                arregloC[k] = arregloB[j];
                j++;
                pasadas++;
            }
            k++;
        }

        while (i < arregloA.length) {
            arregloC[k] = arregloA[i];
            i++;
            k++;
        }

        while (j < arregloB.length) {
            arregloC[k] = arregloB[j];
            j++;
            k++;
        }
        mostrarArreglo(arregloC);
        System.out.println("El algoritmo comparó " + pasadas + " veces");

    }

    public void mostrarArreglo(int[] arreglo) {
        int i = 0;
        while (i < arreglo.length) {
            System.out.print("[" + arreglo[i] + "] ");
            i++;
        }
        System.out.println("");
    }
}

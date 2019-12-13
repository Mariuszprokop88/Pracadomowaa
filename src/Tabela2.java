import java.util.Random;

public class Tabela2 {
    public static void main(String[] args) {
        int [][] macierz = new int [3][3];
        int licznk = 0;
        for (int i = 0; i < macierz.length; i++){
            for (int j = 0; j < macierz.length; j++){
                licznk++;
                macierz[i][j] =licznk;
                System.out.print((macierz[i][j]) + " | ");
            }
            System.out.println();
        }
    int sum=0;
        for(int i = 0; i < macierz.length; i++){
            for (int j =0; j < macierz[i].length; j++){
                sum = sum+macierz[i][j];
            }
        }
        System.out.print("suma: " + sum);
        for(int i = 0; i < macierz.length; i++){
            for (int j =0; j < macierz[i].length; j++){

    }
            System.out.println();
        }

    }}

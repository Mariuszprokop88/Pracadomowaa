import java.util.Random;

public class Tabela1 {
    public static void main(String[] args) {




        double [][] macierz = new double [10][10];
        double licznk = 0;
        for (int i = 0; i < macierz.length; i++){
            for (int j = 0; j < macierz.length; j++){
                licznk++;
                macierz[i][j] =licznk;
                System.out.print((macierz[i][j]) + " | ");
            }
            System.out.println();
    }
        System.out.println();
        Random random = new Random();
        for (int i = 0; i<macierz.length; i++){
            for(int j = 0; j<macierz.length; j++){
                macierz[i][j]= random.nextInt(10);
                System.out.print((macierz[i][j]) + " | ");
            }
            System.out.println();
        }

        int sum=0;
        for(int i = 0; i < macierz.length; i++){
            for (int j =0; j < macierz[i].length; j++){
                sum = (int) (sum+macierz[i][j]);
            }
        }
        System.out.print("suma: " + sum);
        System.out.println();
        for(int i = 0; i < macierz.length; i++){
            for (int j =0; j < macierz[i].length; j++){
                System.out.print(macierz[i][j] + " ");
            }
    }

}}

public class tabele3 {
    public static void main(String[] args) {
        int [][] macierz = new int [3][3];
        int licznk = 0;
        for (int i = 0; i < macierz.length; i++){
            for (int j = 0; j < macierz[i].length; j++){
                licznk++;
                macierz[i][j] =licznk;
                System.out.print((macierz[j][i]) + " | ");
            }
            System.out.println();
    }
}}

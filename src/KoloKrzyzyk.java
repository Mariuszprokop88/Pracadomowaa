import java.util.Scanner;

class KolkoKrzyzyk {
    public static char turn = 'X';
    public static int row, col;
    public static Scanner scanner = new Scanner(System.in);
    public static char [][]board = new char[3][3];


    public static void main(String[] args) {
        board = new char[3][3];
        for(int i = 0; i < 3; i++){
            for (int j = 0; j<3; j++){
                board[i][j]= '_';
            }
        }

        Play();
    }
    public static void Play(){
        boolean playing = true;
        Printboard();
        while (playing){
            System.out.println("please enter row and colmn: ");
            row = scanner.nextInt()-1;
            col= scanner.nextInt()-1;
            board[row][col]= turn;
            if(Gameover(row,col)){
                playing = false;
                System.out.println("game over ");

            }
            Printboard();

            if (turn == 'X')
                turn = 'O';
            else
                turn = 'X';


        }


    }
    public static void Printboard(){
        for(int i = 0; i < 3; i++){
            System.out.println();
            for (int j = 0; j<3; j++){
                if(j==0)
                    System.out.print("| ");
                System.out.print(board[i][j] + " | ");
            }
        }
        System.out.println();
    }
    public static boolean Gameover(int rMove, int cMove){
        if(board[0][cMove]==board[1][cMove]
            && board[0][cMove]==board[2][cMove])
            return true;
        if(board[0][rMove]==board[1][cMove]
                && board[0][rMove]==board[2][rMove])
            return true;
        if(board[0][0]== board[1][1]&& board[0][0]==board[2][2]
            && board[1][1]!='_')
        return true;
        if(board[0][2]== board[1][1]&& board[0][2]==board[2][0]
                && board[1][1]!='_')
    return true;
    return false;
    }

}

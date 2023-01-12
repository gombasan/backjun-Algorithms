import java.util.Scanner;


/*3003번 킹,퀸,룩,비숍,나이트,폰*/
public class Chess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] chess = new int[6];
        int[] result = {1,1,2,2,2,8};
        for (int i = 0; i < chess.length; i++) {
            chess[i] = sc.nextInt();

            int numChk = chess[i] - result[i];
            result[i] = numChk;
            if(numChk > 0 ) {
                result[i] = numChk * -1;
            }

            if(numChk<0){
                result[i] = numChk * -1;
            }
        }
        for (int i = 0; i < 6; i++) {
            System.out.println(result[i]);
        }


    }
}

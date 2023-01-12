import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        System.out.println(solution(7));
    }
    public static int solution(int n) {
        int answer = 0;
        int result = 1;
        for(int i=1; i<=10; i++) {
            result *= i;

            if(result == n) {
                answer = i;
                break;
            }
            else if(result >n) {
                answer = i-1;
                break;
            }
        }


        return answer;
    }

}

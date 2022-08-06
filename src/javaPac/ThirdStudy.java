package javaPac;
import java.util.*;
public class ThirdStudy {

    static class QuestionBank2 {
        public static void main(String[] args){
            int sum = 0;
            Scanner scanner = new Scanner(System.in);
            int N = scanner.nextInt();
            for(int i =1;i<=N;i++){
                sum += i;
            }
            System.out.println(sum);
        }
    }
    static class QuestionBanek3 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n1 = scanner.nextInt();
            int n2 = scanner.nextInt();
            int sum = 0;
            for (int i = n1; i <= n2; i++) {
                sum += i;
            }
            System.out.println(sum);


        }
    }
    static class QuestionBank4 {
        public static void main(String[] args){
            for(int i =1;i<=100;i++){
                if(i%3 == 0){
                    System.out.printf("%d " ,i);
                }
            }
        }

    }
    static class QuestionBank5{
        public static void main(String[] args){
            for(int i =1;i<=10;i++){
                for(int j = 0;j<10;j++){
                    int num = i+j;
                    if(num>10){
                        num -= 10;
                    }
                    System.out.printf("%d ",num);

                }
                System.out.println();
            }
        }
    }
}

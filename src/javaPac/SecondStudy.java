package javaPac;

import java.util.*;

/*
class Dictionary {
    private static String[] kor = {"사람", "아기", "돈", "미래", "희망"};
    private static String[] eng = {"love", "baby", "money", "future", "hope"};

    public static void kor2Eng() {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("한글 단어?");
            String input = scanner.nextLine();
            if (input.equals("그만")){
                break;
            }
            if(Arrays.asList(kor).contains(input)){
                for(int i = 0;i<kor.length;i++){
                    if(kor[i].equals(input)){
                        System.out.println(input + "은 " +eng[i]);
                    }
                }
            }
            else{
                System.out.println(input + "는 저의 사전에 없습니다.");
            }
        }




    }
}
class DicApp{
    public static void main(String[] args){
        System.out.println("한영 단어 검색 프로그램입니다.");
        Dictionary.kor2Eng();
    }
}
*/
/*
class chart{
    static String[] Schart = {"---","---","---","---","---","---","---","---","---","---"};
    static String[] Achart = {"---","---","---","---","---","---","---","---","---","---"};
    static String[] Bchart = {"---","---","---","---","---","---","---","---","---","---"};
}
class reservation_machine{
    public static void machine(int N){
        Scanner scanner = new Scanner(System.in);
        if(N == 1){
            for(int i =0;i<chart.Schart.length;i++){
                System.out.print(chart.Schart[i] + " ");
            }
            System.out.println();
        }
        else if (N==2){
            for(int i =0;i<chart.Achart.length;i++){
                System.out.print(chart.Achart[i] + " ");
            }
            System.out.println();
        }
        else if (N==3){
            for(int i =0;i<chart.Bchart.length;i++){
                System.out.print(chart.Bchart[i] + " ");
            }
            System.out.println();
        }

        System.out.print("이름>>");
        String name = scanner.nextLine();
        System.out.print("번호>>");
        int num = scanner.nextInt();
        if(N == 1){
            chart.Schart[num-1] = name;
        }
        else if (N==2){
            chart.Achart[num-1] = name;
        }
        else if (N==3){
            chart.Bchart[num-1] = name;
        }
    }
}
class reservation{
    public static void main(String[] args){
        System.out.println("명품콘서트홀 에약 시스템입니다.");
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("예약:1, 조희:2, 취소:3, 끝내기:4>>");
            int input = scanner.nextInt();

            if (input == 4){
                break;
            }
            if(input == 1){
                System.out.print("좌석구분 S(1), A(2), B(3)>>");
                int input2 = scanner.nextInt();
                if(input2 == 1){
                    reservation_machine.machine(1);
                }
                if(input2 == 2){
                    reservation_machine.machine(2);
                }
                if(input2 == 3) {
                    reservation_machine.machine(3);
                }

            }
            if(input == 2){
                for(int i =0;i<chart.Schart.length;i++){
                    System.out.print(chart.Schart[i] + " ");
                }
                System.out.println();
                for(int i =0;i<chart.Achart.length;i++){
                    System.out.print(chart.Achart[i] + " ");
                }
                System.out.println();
                for(int i =0;i<chart.Bchart.length;i++){
                    System.out.print(chart.Bchart[i] + " ");
                }
                System.out.println();
                System.out.println("<<<조회를 완료하였습니다.>>>");
            }
            if(input == 3){

                System.out.print("좌석구분 S(1), A(2), B(3)>>");
                int seat_num = scanner.nextInt();

                if(seat_num == 1){
                    for(int i =0;i<chart.Schart.length;i++){
                        System.out.print(chart.Schart[i] + " ");
                    }
                    System.out.println();
                    String name2 = scanner.nextLine();
                    for(int i = 0;i<chart.Schart.length;i++){
                        if(name2.equals(chart.Schart[i])){
                            chart.Schart[i] = "---";
                        }
                    }
                }
                else if(seat_num == 2){
                    for(int i =0;i<chart.Achart.length;i++){
                        System.out.print(chart.Achart[i] + " ");
                    }
                    String name2 = scanner.nextLine();
                    System.out.println();

                    for(int i = 0;i<chart.Achart.length;i++){
                        if(name2.equals(chart.Achart[i])){
                            chart.Achart[i] = "---";
                        }
                    }
                }
                else if (seat_num == 3){
                    for(int i =0;i<chart.Bchart.length;i++){
                        System.out.print(chart.Bchart[i] + " ");
                    }
                    System.out.println();
                    String name2 = scanner.nextLine();
                    for(int i = 0;i<chart.Bchart.length;i++){
                        if(name2.equals(chart.Bchart[i])){
                            chart.Bchart[i] = "---";
                        }
                    }
                }
            }
        }

    }
}*/
/*
//18
class Bread_making{
    public static void Bread1(){
        System.out.println("빵을 만들었습니다");
    }
    public static void Bread2(int n){
        for(int i = 0;i<n;i++){
            System.out.println("빵을 만들었습니다");
        }
    }
    public static void Bread3(int n){
        for(int i = 0;i<n;i++){
            System.out.println("크림빵을 만들었습니다");
        }
    }
    public static void main(String[] args){
        Bread1();
        Bread2(3);
        Bread3(4);
    }

}
*/


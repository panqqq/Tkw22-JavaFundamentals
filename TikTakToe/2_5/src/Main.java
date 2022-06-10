import java.util.Arrays;
import java.util.Scanner;



public class Main {
    public static void show(String val){
        switch (val) {
            case "BeginGame" -> System.out.println("---------");
            case "BeginLine" -> System.out.print("| ");
            case "EndLine" -> System.out.print("|");
            case "EndGame" -> System.out.println("---------");
        }


    }
    public static void main(String[] args) {
        char[][] tik = new char[3][3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < tik.length; i++) {
            for (int j = 0; j < tik[i].length; j++) {
                char res = sc.next().charAt(0);
                tik[i][j] = res;
            }
        }
        show("BeginGame");
        for (char[] tak : tik) {
            show("BeginLine");
            for (char toe : tak) {
                System.out.print(toe + " ");
            }
            show("EndLine");
            System.out.println();
        }
        show("EndGame");


        
        /*for (int i = 0; i < tik.length; i++) {
            System.out.println(Arrays.toString(tik[i]));
        }*/

    }
}
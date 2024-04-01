import com.app.service.AreaImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner s=new Scanner(System.in);
        try(s;){
            try{
                while(true){
                    System.out.println("=====QUADRILATERAL AREA FORMULA=====");
                    System.out.println("========Choice=======");
                    System.out.println("\t1.Square Area" +
                            "\n\t2.Recatangle Area" +
                            "\n\t3.Parallelogram Area" +
                            "\n\t4.Tropezoid Area" +
                            "\n\t5.Rhombus Area" +
                            "\n\t6.Kite Area" +
                            "\n\t7.Exit");
                    System.out.println("Enter the choice");
                    switch (Integer.parseInt(s.nextLine())){
                        case 1:
                            System.out.println("Enter the length of square");
                            AreaImpl ob=new AreaImpl();
                           int result= (int) ob.square(s.nextInt());
                           System.out.println(result);


                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                        case 5:
                            break;
                        case 6:
                            break;
                        case 7:
                            break;
                        default:
                            System.out.println("Invalid choice..");
                            continue;
                    }
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
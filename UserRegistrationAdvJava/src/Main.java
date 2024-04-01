import com.app.user.User;

import java.util.Scanner;

public class Main {

        private static final String url="jdbc:mysql://localhost:3306/mydb";
        private static final String username="root";
        private static final String password="root";

        public static void main(String[] args) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");

            }catch (ClassNotFoundException e){
                e.printStackTrace();
            }
            Scanner scanner=new Scanner(System.in);

            User ob=new User();
            ob.userRegistration();
    }
}
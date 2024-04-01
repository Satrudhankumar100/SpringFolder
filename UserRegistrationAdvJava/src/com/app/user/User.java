package com.app.user;

import java.nio.channels.ScatteringByteChannel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class User {

    private Connection connection;
    Scanner scanner=new Scanner(System.in);
    public User(Connection connection, Scanner scanner){
        this.connection=connection;
        this.scanner=scanner;
    }

    public User() {

    }

    public void userRegistration(){
        System.out.println("Enter User Name:");
        String uname=scanner.nextLine();
        System.out.println("Enter User Email");
        String uemail=scanner.nextLine();
        System.out.println("Enter User Mobile Number");
        Long umobile=scanner.nextLong();
        System.out.println("Enter User Passwored ");
        String upassword=scanner.nextLine();
        try{
            String query="INSERT INTO USER(NAME,EMAIL,MOBILE,PASSWORD) VALUES(?,?,?,?)";
            PreparedStatement preparedStatement=connection.prepareStatement(query);
preparedStatement.setString(1,uname);
preparedStatement.setString(2,uemail);
preparedStatement.setDouble(3,umobile);
preparedStatement.setString(4,upassword);
            int k=preparedStatement.executeUpdate();
            if(k>0){
                System.out.println("Registered Successfully");
            }else{
                System.out.println("Registred Unsuccessful..");
            }
        }catch(SQLException e){
            e.printStackTrace();
        }

    }


    public void viewUserRegistration(){
        System.out.println("Enter your mobile number ");
       Long umobile= scanner.nextLong();
       System.out.println("Enter your password");
       String upassword=scanner.nextLine();
       try{
           String query="SELECT * FROM USER WHERE MOBILE=?,PASSWORED=?";
           PreparedStatement preparedStatement=connection.prepareStatement(query);
            ResultSet rs=preparedStatement.executeQuery();
            while(rs.next()){
              Long mobile=  rs.getLong("mobile");
             String password=   rs.getString("password");
             if((mobile==umobile) && (upassword==password)){
                 System.out.println("Login Successfully");
             }else{
                 System.out.println("Invalid Credential");
             }
            }


       }catch (SQLException e){
           e.printStackTrace();
       }


    }

}


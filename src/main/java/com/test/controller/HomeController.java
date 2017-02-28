package com.test.controller;

import com.sun.xml.internal.ws.policy.sourcemodel.ModelNode;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import java.sql.*; //importing sql package


@Controller
public class HomeController {

    @RequestMapping("/")

    public ModelAndView helloWorld() throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/CoffeeApp";
        String userName = "CoffeeUser";
        String password = "coffeepassword";
        String query = "SELECT * FROM Users";

        Class.forName("com.mysql.jdbc.Driver");

        Connection con = DriverManager.getConnection(url, userName, password);

        Statement st = con.createStatement();

        ResultSet rs = st.executeQuery(query);

        rs.next();

        String firstName = rs.getString("FName");
        String lastName = rs.getString("LName");


        st.close();
        con.close();

        return new
                ModelAndView("welcome","message","Hello World");

    }
/*
    @RequestMapping("welcome")

    public ModelAndView helloWorld2()
    {
        return new
                ModelAndView("welcome2","message","Hello World2");

    }
*/
    @RequestMapping("welcome")
    public ModelAndView processFormMethod(@RequestParam("FName") String fName,
                                          @RequestParam("Password") String lName){

        String message =  "Welcome, " + fName + "!";
            return new
                ModelAndView("welcome2","message",message);

    }

    @RequestMapping("register")
    public ModelAndView registerMethod() throws ClassNotFoundException, SQLException {
        /*String url = "jdbc:mysql://localhost:3306/CoffeeApp";
        String userName = "CoffeeUser";
        String password = "coffeepassword";
        String query = "INSERT INTO Users(ID, FName, LName, DOB) Values(UserName, firstName, lastName, dob)";

        Class.forName("com.mysql.jdbc.Driver");

        Connection con = DriverManager.getConnection(url, userName, password);

        //Statement st = con.createStatement();
        // don't need above for adding
        PreparedStatement pst = con.prepareStatement("INSERT INTO Users(ID, FName, LName, DOB)" + "values(?, ?, ?, ?)");
        pst.executeUpdate();
//  + values(?, >, >, >)
 //       pst.setSTring(1, bla)




       // ResultSet rs = st.executeQuery(query);

       // rs.next();


            // don't need st
        //st.close();
        con.close();
*/

        return new
                ModelAndView("registrationPage","registerMessage","Register");



    }


    @RequestMapping("registered")
    public ModelAndView registered(@RequestParam("UserName") String UserName,
                                   @RequestParam("FName") String firstName,
                                   @RequestParam("LName") String lastName,
                                   @RequestParam("dob") String dob) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/CoffeeApp";
        String userName = "CoffeeUser";
        String password = "coffeepassword";

        Class.forName("com.mysql.jdbc.Driver");

        Connection con = DriverManager.getConnection(url, userName, password);

        PreparedStatement pst = con.prepareStatement("INSERT INTO Users(ID, FName, LName, DOB)" + " values(?, ?, ?, ?)");
        pst.setString(1, UserName);
        pst.setString(2, firstName);
        pst.setString(3, lastName);
        pst.setString(4, dob);
        pst.executeUpdate();

        String message = "" + firstName + " " + lastName + " registered!";

        con.close();
            return new
                ModelAndView("registeredPage","message",message);

    }
   @RequestMapping("dbReturn")
    public ModelAndView helloWorldDB() throws SQLException, ClassNotFoundException {

        String url = "jdbc:mysql://localhost:3306/CoffeeApp";
        String userName = "CoffeeUser";
        String password = "coffeepassword";
        String query = "SELECT * FROM Users";

        Class.forName("com.mysql.jdbc.Driver");

        Connection con = DriverManager.getConnection(url, userName, password);

        Statement st = con.createStatement();

        ResultSet rs = st.executeQuery(query);

        rs.next();

        String firstName = rs.getString("FName");
        String lastName = rs.getString("LName");


        st.close();
        con.close();

        return new ModelAndView("databasePage", "message", firstName + " " + lastName);



   }
}

package com.test.controller;

import com.sun.xml.internal.ws.policy.sourcemodel.ModelNode;
import com.test.models.Products;
import com.test.models.Users;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import java.sql.*; //importing sql package
import java.util.ArrayList;


@Controller
public class HomeController {

    @RequestMapping("/")

    public ModelAndView helloWorld() throws ClassNotFoundException, SQLException {
        String message = "Log In Here";
        return new
                ModelAndView("welcome","message", message);

    }
/*
    @RequestMapping("welcome")

    public ModelAndView helloWorld2()
    {
        return new
                ModelAndView("welcome2","message","Hello World2");

    }
*/

    public ArrayList<Products> getProducts() throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/CoffeeApp";
        String userName = "CoffeeUser";
        String password = "coffeepassword";

        Class.forName("com.mysql.jdbc.Driver");

        Connection con = DriverManager.getConnection(url, userName, password);

        String query = "SELECT * FROM Products";

        ArrayList<Products>  productList = new ArrayList<Products>();

        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        int count = 0;
        while (rs.next()) {
            count += 1;
            Products temp = new Products(rs.getString("ProductID"), rs.getString("name"), rs.getString("price"));
            productList.add(temp);
        }

        return productList;
    }


    @RequestMapping("welcome")
    public ModelAndView processFormMethod(@RequestParam("UserName") String UserName,
                                          @RequestParam("Password") String Password) throws ClassNotFoundException, SQLException {

        String url = "jdbc:mysql://localhost:3306/CoffeeApp";
        String userName = "CoffeeUser";
        String password = "coffeepassword";
        String query = "SELECT * FROM Products";
        String theQuery = "SELECT * FROM USERS WHERE ID = ?";


        Class.forName("com.mysql.jdbc.Driver");

        Connection con = DriverManager.getConnection(url, userName, password);
        Connection conn = DriverManager.getConnection(url, userName, password);
        Statement st = con.createStatement();

        ResultSet rs = st.executeQuery(query);

        ArrayList<Products> productsList = new ArrayList<Products>();
        ModelAndView model;
        model = new ModelAndView("welcome", "message", "WRONG INFO");
        while (rs.next()) {
            Products temp = new Products(rs.getString("ProductID"), rs.getString("name"), rs.getString("price"));
            productsList.add(temp);
        }

        rs.close();
        st.close();
        con.close();

        try {
            PreparedStatement ps = conn.prepareStatement(theQuery);
            ps.setString(1, UserName);

            ResultSet rsss = ps.executeQuery();

            while (rsss.next()) {
                System.out.println("HELFJALFIJ");
                System.out.println(UserName);
                System.out.println(rsss.getString("FName"));
                System.out.println(rsss.getString("LName"));
                model = new ModelAndView("welcome2", "welcome", "Welcome " + rsss.getString("FName"));
                model.addObject("message", productsList);
            }

            rsss.close();
        }
        catch (SQLException se)
        {
            // log exception;
            throw se;
        }

        conn.close();
        return model;
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

        String query = "SELECT ID FROM USERS WHERE ID = 'UserName'";
        Statement st = con.createStatement();

        ResultSet rs = st.executeQuery(query);
//        String theID = rs.getString("ID");
        String message = "" + firstName + " " + lastName + " registered!";
        boolean empty = true;
        while (rs.next()) {
            empty = false;
        }

        final int MYSQL_DUPLICATE_PK = 1062;

        try{
            //code that throws sql exception
            PreparedStatement pst = con.prepareStatement("INSERT INTO Users(ID, FName, LName, DOB)" + " values(?, ?, ?, ?)");
            pst.setString(1, UserName);
            pst.setString(2, firstName);
            pst.setString(3, lastName);
            pst.setString(4, dob);
            pst.executeUpdate();
        } catch(SQLException e){
            if(e.getErrorCode() == MYSQL_DUPLICATE_PK ){
                //duplicate primary key
                 con.close();
                return new
                    ModelAndView("registeredPage","message", "User already exists!!!!");
            }
        }


        con.close();
            return new
                ModelAndView("registeredPage","message",message);

    }
   @RequestMapping("dbReturn")
    public ModelAndView helloWorldDB() throws SQLException, ClassNotFoundException {

        String url = "jdbc:mysql://localhost:3306/CoffeeApp";
        String userName = "CoffeeUser";
        String password = "coffeepassword";
        String boyko = "aboyko";
        String query = "SELECT * FROM Users";


        Class.forName("com.mysql.jdbc.Driver");

        Connection con = DriverManager.getConnection(url, userName, password);

        Statement st = con.createStatement();

        ResultSet rs = st.executeQuery(query);
        ArrayList<Users> usersList = new ArrayList<Users>();
        int counter = 0;
        String firstName = "";
        String lastName = "";
        while (rs.next()) {
            counter += 1;
            firstName = rs.getString("FName");
            lastName = rs.getString("LName");
            Users temp = new Users(rs.getString("ID"), rs.getString("FName"),
                                   rs.getString("LName"), rs.getString("dob"),
                                   rs.getString("password"));

            usersList.add(temp);
        }
        st.close();
        con.close();

        return new ModelAndView("databasePage", "message", usersList);



   }
}

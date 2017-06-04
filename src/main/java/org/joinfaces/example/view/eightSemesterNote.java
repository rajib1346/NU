/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.joinfaces.example.view;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;
@ManagedBean
@SessionScoped
public class eightSemesterNote {
     private String selectedname;
private Scanner x;

String line;
    public String getSelectedname() {
        return selectedname;
    }

    public void setSelectedname(String selectedname) {
        this.selectedname = selectedname;
    }

    public ArrayList<String> getTabelElement() {

        ArrayList<String> list = new ArrayList<String>();
        list.add("book");
        list.add("note");
        return list;
    }

    public List<tabelElement> getLocation() throws  FileNotFoundException, IOException {
         

        List<tabelElement> list = new ArrayList<tabelElement>();
       //  BufferedReader br=null;

      //  br=new BufferedReader(new FileReader("C:\\Users\\Acer\\Documents\\NetBeansProjects\\NuCseHome\\text"));
      
//        Class.forName("com.mysql.jdbc.Driver");
//        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fast", "root", "");
//
//        Statement stmt = con.createStatement();
//        ResultSet rs = stmt.executeQuery("select id,location,fileName,Author,size from " + selectedname + "");
 URL oracle = new URL("http://shawonislam.com/rajib/eightnote.txt");
    BufferedReader in = new BufferedReader(
    new InputStreamReader(oracle.openStream()));

    String inputLine;
        while((inputLine = in.readLine()) != null) {
            tabelElement element = new tabelElement();
              
           // element.setId(rs.getString("id"));
            element.setLocation(inputLine);
//            element.setLocation(rs.getString("location"));
//            element.setAuthor(rs.getString("Author"));
//            element.setSize(rs.getString("size"));

            list.add(element);
        }

        return list;
    }
 public List<tabelElement> getLink() throws  FileNotFoundException, IOException {

        List<tabelElement> listlink = new ArrayList<tabelElement>();
 
 URL oracle = new URL("http://shawonislam.com/rajib/eightlink.txt");
    BufferedReader in = new BufferedReader(
    new InputStreamReader(oracle.openStream()));

    String inputLine;
        while((inputLine = in.readLine()) != null) {
            tabelElement elementlink = new tabelElement();
              
           // element.setId(rs.getString("id"));
            elementlink.setLocationlink(inputLine);
//            element.setLocation(rs.getString("location"));
//            element.setAuthor(rs.getString("Author"));
//            element.setSize(rs.getString("size"));

            listlink.add(elementlink);
        }

        return listlink;
    }
        public List<tabelElement> getNoti() throws  FileNotFoundException, IOException {

        List<tabelElement> listnoti = new ArrayList<tabelElement>();
       //  BufferedReader br=null;

      //  br=new BufferedReader(new FileReader("C:\\Users\\Acer\\Documents\\NetBeansProjects\\NuCseHome\\text"));
      
//        Class.forName("com.mysql.jdbc.Driver");
//        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fast", "root", "");
//
//        Statement stmt = con.createStatement();
//        ResultSet rs = stmt.executeQuery("select id,location,fileName,Author,size from " + selectedname + "");
 URL oracle = new URL("http://shawonislam.com/rajib/eightnoti.txt");
    BufferedReader in = new BufferedReader(
    new InputStreamReader(oracle.openStream()));

    String inputLine;
        while((inputLine = in.readLine()) != null) {
            tabelElement notification = new tabelElement();
              
           // element.setId(rs.getString("id"));
            notification.setNotification(inputLine);
//            element.setLocation(rs.getString("location"));
//            element.setAuthor(rs.getString("Author"));
//            element.setSize(rs.getString("size"));

            listnoti.add(notification);
        }

        return listnoti;
    }
   
}

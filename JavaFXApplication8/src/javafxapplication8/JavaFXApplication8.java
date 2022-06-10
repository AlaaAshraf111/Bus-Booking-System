/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import static javafx.scene.input.KeyCode.F;
import static javafx.scene.input.KeyCode.S;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

/**
 *
 * @author Fatma
 */
public class JavaFXApplication8 extends Application {
   
      double bus7550; int p50=200; double j; 
        double bus7560;  int p60=250;
        double bus7562;  int p62=300;
        double bus7565;  int p65=370;
        double bus7570; double bus7575; int p70=400; int p75=420;
        double a;  int b=0;
            
    @Override
    
    public void start(Stage primaryStage) {
       Label busnoseats=new Label();
        Button btn = new Button("Login");
        Button btn1 = new Button("Create account");
        Button btn2 = new Button("Submit");
        Button btn3 = new Button("Exit");
        Button btn4 = new Button("Add");
        Button btn5= new Button("Edit ");
        Button btn7 = new Button("Show Bus List");
        Button btn20 = new Button("Show Information");
        Button btn21 = new Button("Add To My Booking");
        Button btn22 = new Button("Cancel");
        Button btn23 = new Button("Show Booking List");
        Button btn121 = new Button("Save");                        //Create objects of Button  
       
        Font f3=Font.font("Times New Roman", FontWeight.BOLD, 20);          //Create an object of Font 
        //Create TextFields & set them uneditable to show bus list
        TextField btn8=new TextField(); btn8.setEditable(false); btn8.setVisible(true);btn8.setFont(f3); btn8.setMinSize(760.00, 15.00);
        TextField btn9=new TextField();btn9.setEditable(false); btn9.setVisible(true);  btn9.setFont(f3); btn9.setMinSize(760.00, 15.00);
        TextField btn10=new TextField();btn10.setEditable(false); btn10.setVisible(true); btn10.setFont(f3);btn10.setMinSize(760.00, 15.00);
        TextField btn11=new TextField();btn11.setEditable(false); btn11.setVisible(true); btn11.setFont(f3);btn11.setMinSize(760.00, 15.00);
        TextField btn12=new TextField();btn12.setEditable(false); btn12.setVisible(true); btn12.setFont(f3);btn12.setMinSize(760.00, 15.00);
        TextField btn13=new TextField();btn13.setEditable(false); btn13.setVisible(true); btn13.setFont(f3);btn13.setMinSize(770.00, 15.00);
        TextField btn14=new TextField();btn14.setEditable(false); btn14.setVisible(true); btn14.setFont(f3);btn14.setMinSize(760.00, 15.00);
        TextField btn15=new TextField();btn15.setEditable(false); btn15.setVisible(true); btn15.setFont(f3);btn15.setMinSize(760.00, 15.00);
        TextField btn16=new TextField();btn16.setEditable(false); btn16.setVisible(true); btn16.setFont(f3);btn16.setMinSize(760.00, 15.00);
        TextField btn17=new TextField();btn17.setEditable(false); btn17.setVisible(true); btn17.setFont(f3);btn17.setMinSize(760.00, 15.00);
                 //Create Nodes of TextField to enter username & password during login or creating                                                
        TextField t =new TextField(); TextField tt =new TextField();
        TextField t1 =new TextField(); TextField tt1 =new TextField();
        TextField busno =new TextField();  //create TextField to enter bus number 
        Font f1=Font.font("Times New Roman", 22); Font f2=Font.font("Times New Roman", 20);  //Create an object of Font 
                 //Create objects of  Label to makes titles of username & password
        Label l1 =new Label("username"); l1.setFont(f1); l1.setTextFill(Color.WHITE);
        Label l2 =new Label("Password"); l2.setFont(f1); l2.setTextFill(Color.WHITE);
        
        Label l=new Label();                                 //Create an object of label used in login process        
           //create objects of label show masseges 
        Label lll=new Label("username or pass is wrong !!!");
        Label lwrongbook=new Label("Sorry,There is no available seats on this Bus!");
        Label lsave =new Label("Editing is done");
        Label lsworng =new Label("Sorry,There is enough seats!");
         Label lsworng1 =new Label("Sorry,There is enough seats!");
        Label leditwrong =new Label("Sorry,You can't edit this reservation more than twice. You can call bus station manager for any problem 01*****.");
        Label lnobooking =new Label();                     //create an object of Label used in adding reservation to booking list
        Label lnobookingedit =new Label();                  //Create an object of Label used in show more information in editing reservation 
        Label lcal =new Label();                           //create an object of Label used in editing process
        Label led =new Label("1");                                 //Create an object of Label used in editing process 
                    //create objects of Font
        Label l3 =new Label("username"); l3.setFont(f1); l3.setTextFill(Color.WHITE);
        Label l4 =new Label("Password"); l4.setFont(f1); l4.setTextFill(Color.WHITE);
        
        Label ll4 =new Label("Enter Bus number"); ll4.setFont(f1); ll4.setTextFill(Color.WHITE); //create an object of Label to make a title
        //create objects of Label used in editing & searching process
        Label llsearch =new Label(); Label lledit =new Label();  
        Label  lledit1 =new Label(); Label lledit2 =new Label(); Label lledit3 =new Label();
        //create objects of Label used in view booking list
        Label Hallo =new Label(); Hallo.setFont(f1); Hallo.setTextFill(Color.WHEAT); Hallo.setOpacity(1);
        Label inf=new Label();inf.setOpacity(1); inf.setTextFill(Color.WHITE); inf.setFont(f2);    
         VBox g =new VBox(10);             //Create pane & set the vertical distance between objects in booking list stage
        HBox h1=new HBox(10);              //Create pane & set the horizontal distance between objects in booking list stage
        h1.getChildren().addAll(btn4,btn5);    // Add objects on pane 
        g.getChildren().addAll( Hallo,inf,h1); g.setAlignment(Pos.CENTER); //Add nodes to pane Set the position of the pane
        Pane rt2 = new Pane();                             //Create a pane
        Image im2;                                         //Create an object of Image 
        im2 = new Image("images (1).jpg");                  //Add image to the Image object
       ImageView vvv;                                      //Create an object of ImageView 
        vvv = new ImageView(im2);                         //Add the object of Image to ImageView
        vvv.fitHeightProperty().bind(rt2.heightProperty().divide(1));      //Set the dimensions of the image according to the dimensions of the pane
        vvv.fitWidthProperty().bind(rt2.widthProperty().divide(1));
        vvv.setX(0); vvv.setY(0);           //Set the position of the image on the pane
        rt2.getChildren().addAll(vvv,g);                  //Add nodes on the pane
        Scene scene1 = new Scene(rt2, 700, 350);              //Create scene and add pane to it
        Stage primaryStage1 =new Stage();                      //Create Booking list stage
        primaryStage1.setTitle("Welcome");                        //Set tile to Booking list stage
        primaryStage1.setScene(scene1);                        //Add scene to stage
          
              //Create pane, scene and stage for first message stage about a wrong in login process 
        StackPane pan =new StackPane(lll);                      //Create pane and add a node to it
        Scene scene2 = new Scene(pan, 350, 200);              //Create scene, add node to scene and set its dimension
        Stage primaryStage2 =new Stage();                            //Create massage stage 
        primaryStage2.setTitle("Wrong!"); primaryStage2.setResizable(false);            //Set a title of the stage and set it unresizable
        primaryStage2.setScene(scene2);                      //Add scene to the massage stage
         
             //Create pane, scene and stage for second message stage about a wrong in Booking process 
        StackPane panwrongbook =new StackPane(lwrongbook);              //Create pane
        Scene scenewrongbook = new Scene(panwrongbook, 350, 200);    //Create scene and add pane to it
        Stage primaryStage7 =new Stage();                                  //Create massage stage
        primaryStage7.setTitle("Wrong!"); primaryStage7.setResizable(false);           //Set a title of the stage and set it unresizable
        primaryStage7.setScene(scenewrongbook);                          //Add scene to the stage
        
          //Create pane, scene and stage for third message stage about a conformation of Editing process 
        StackPane pansave =new StackPane(lsave);                            //Create pane
        Scene scenesave = new Scene(pansave, 350, 200);              //Create scene and add pane to it
        Stage primaryStageSave =new Stage();                         //Create massage stage
        primaryStageSave.setTitle("Done"); primaryStageSave.setResizable(false);       //Set a title of the stage and set it unresizable
        primaryStageSave.setScene(scenesave);            //Add scene to the stage
        
            //Create pane, scene and stage for fourth message stage about a wrong in save editing
        StackPane pansworng =new StackPane(lsworng);                        //Create pane 
        Scene scenesworng= new Scene(pansworng, 350, 200);          //Create scene and add pane to it & set its dimension
        Stage primaryStagesworng =new Stage();                        //Create massage stage
        primaryStagesworng.setTitle("Wrong!"); primaryStagesworng.setResizable(false);   //Set a title of the stage and set it unresizable
        primaryStagesworng.setScene(scenesworng);                         //Add scene to the stage
        //Create pane, scene and stage for fifth message stage about a wrong in save editing
        StackPane paneditwrong =new StackPane(leditwrong);                  //Create pane
        Scene sceneeditwrong = new Scene(paneditwrong, 850, 200);     //Create scene and add pane to it & set its dimension
        Stage primaryStageeditwrong =new Stage();                          //Create massage stage
        primaryStageeditwrong.setTitle("Wrong"); primaryStageeditwrong.setResizable(false);     //Set a title of the stage and set it unresizable
        primaryStageeditwrong.setScene(sceneeditwrong);           //Add scene to the stage
        //Create pane, scene and stage for sixth message stage about a wrong in adding process
        StackPane pansworng1 =new StackPane(lsworng1);                        //Create pane 
        Scene scenesworng1= new Scene(pansworng1, 350, 200);          //Create scene and add pane to it & set its dimension
        Stage primaryStagesworng1 =new Stage();                        //Create massage stage
        primaryStagesworng1.setTitle("Wrong!"); primaryStagesworng1.setResizable(false);   //Set a title of the stage and set it unresizable
        primaryStagesworng1.setScene(scenesworng1);                         //Add scene to the stage
        
        HBox h4 =new HBox(75);                          //Create Pane used in login stage
        h4.getChildren().addAll(btn2,btn3);              //Add nodes to pane
        GridPane root1 =new GridPane();                   //Create pane to arrange the nodes on login stage
        root1.addColumn(12, l3,l4); root1.addColumn(20, t1,tt1,h4);     //Add Nodes to the pane
        root1.setHgap(10); root1.setVgap(10);                   //Set the vertical & the horizontal distance between nodes
          
       root1.setPadding(new Insets(80,40,10,40));           //Set the distance between the pane and the border of the stage
                           //Set an image on the create account stage
        Pane rt1 = new Pane();                        //Create pane 
        Image im1;                                    //Create an object of Image
        im1 = new Image("images.jpg");                 //Add image to the Image object 
       ImageView vv;                                   //Create an object of ImageView
        vv = new ImageView(im1);                       //Add object Image to the ImageView
        vv.fitHeightProperty().bind(rt1.heightProperty().divide(1));         //Set the dimensions of the image according to the dimensions of the pane
        vv.fitWidthProperty().bind(rt1.widthProperty().divide(1));
        vv.setX(0); vv.setY(0);                                        //Set the position of the image on the pane
          
        rt1.getChildren().addAll(vv,root1);                 //Add nodes on the pane
        Scene scene3 = new Scene(rt1, 650, 450);             //Create scene and add pane to it
        Stage primaryStage3 =new Stage();                    //Create create account stage
        primaryStage3.setTitle("Create Acount");              //Set a title of create account stage
        primaryStage3.setScene(scene3); primaryStage3.setResizable(false);            //Add scene to stage & set it unresizable
                          //Set an image on the adding stage
        Pane rtpane = new Pane();                               //Create pane 
       Image imadd = new Image("images (2).jpg");                 //Create an object of Image & add image to it
       ImageView vadd = new ImageView(imadd);                     //Create an object of ImageView & add the Image object to it
        vadd.fitHeightProperty().bind(rtpane.heightProperty().divide(1));         //Set the dimentions of the image according to the dimensions of the pane
        vadd.fitWidthProperty().bind(rtpane.widthProperty().divide(1));
        vadd.setX(0); vadd.setY(0);                                       //Set the position of the image on the pane
       GridPane g1 =new GridPane();                              //Create pane to add nodes to adding stage
       VBox vhbtn9 =new VBox(10);                                   //Create pane to arrange nodes on adding stage
       vhbtn9.getChildren().addAll(btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15,btn16,btn17);   //Add nodes to pane
       vhbtn9.setPadding(new Insets(20,20,10,133));                                   //Set the distance between the pane and the border of the stage
      HBox h= new HBox(5);                                               //Create pane to add buttons on add stage
      h.getChildren().addAll(ll4,busno,btn20); h.setPadding(new Insets(20,40,10,133));    //Add nodes to pane and Set the distance between the pane and the border of the stage
       
        VBox vlayadd =new VBox(10);   vlayadd.getChildren().addAll(vhbtn9,h);        //Create pane to arrange nodes on add stage
        g1.setPadding(new Insets(20,40,10,40));                                 //Set the distance between the pane and the border of the stage
        rtpane.getChildren().addAll(vadd,vlayadd);                         //Add nodes to pane
        
        Scene sceneadd = new Scene(rtpane, 1000, 650);                   //Create scene & set its dimention
        Stage primaryStage4 =new Stage();                             //Create adding stage
        primaryStage4.setTitle("Adding Stage");                         //Set title of adding stage
        primaryStage4.setScene(sceneadd);                          //Add scene to stage       
        primaryStage4.setResizable(false);                            //Set the stage unresizable
          //Create Labels & set their text font and TextFields & set them uneditable to show reservation information in adding process
        Label lbook1 =new Label("Bus number:"); lbook1.setFont(f3); lbook1.setTextFill(Color.WHITE);
        Label lbook2 =new Label("Location:");  lbook2.setFont(f3); lbook2.setTextFill(Color.WHITE);
        Label lbook3 =new Label("Distnation:"); lbook3.setFont(f3); lbook3.setTextFill(Color.WHITE);
        Label lbook4 =new Label("Leaving Date:"); lbook4.setFont(f3); lbook4.setTextFill(Color.WHITE);
        Label lbook5 =new Label("Arrival Date:");lbook5.setFont(f3); lbook5.setTextFill(Color.WHITE);
        Label lbook6 =new Label("Leaving Time:"); lbook6.setFont(f3); lbook6.setTextFill(Color.WHITE);
        Label lbook7 =new Label("Arrival Time:"); lbook7.setFont(f3); lbook7.setTextFill(Color.WHITE);
        Label lbook8 =new Label("Aviable Seats:");lbook8.setFont(f3); lbook8.setTextFill(Color.WHITE);
        Label lbook9 =new Label("Ticket Price:");lbook9.setFont(f3); lbook9.setTextFill(Color.WHITE);
        TextField tbook1=new TextField(); tbook1.setEditable(false);
        TextField tbook2=new TextField(); tbook2.setEditable(false);
        TextField tbook3=new TextField(); tbook3.setEditable(false);
        TextField tbook4=new TextField(); tbook4.setEditable(false);
        TextField tbook5=new TextField(); tbook5.setEditable(false);
        TextField tbook6=new TextField(); tbook6.setEditable(false);
        TextField tbook7=new TextField(); tbook7.setEditable(false);
        TextField tbook8=new TextField(); tbook8.setEditable(false);
        TextField tbook9=new TextField(); tbook9.setEditable(false);
           //Create Labels & set their text font and TextFields to enter user information in adding process
        Label lbookinf1 =new Label("ID no.:"); lbookinf1.setFont(f3); lbookinf1.setTextFill(Color.WHITE);
        Label lbookinf2 =new Label("Phone number:");  lbookinf2.setFont(f3); lbookinf2.setTextFill(Color.WHITE);
        Label lbookinf3 =new Label("First Name:"); lbookinf3.setFont(f3); lbookinf3.setTextFill(Color.WHITE);
        Label lbookinf4 =new Label("Last Name:"); lbookinf4.setFont(f3); lbookinf4.setTextFill(Color.WHITE);
        Label lbookinf5 =new Label("Num. of Seats:");lbookinf5.setFont(f3); lbookinf5.setTextFill(Color.WHITE);
        Label lbookinf6 =new Label("Enter Your Information To Book Tickects:");lbookinf6.setFont(f3); lbookinf6.setTextFill(Color.WHITE);
        TextField tbookinf1=new TextField(); 
        TextField tbookinf2=new TextField(); 
        TextField tbookinf3=new TextField(); 
        TextField tbookinf4=new TextField(); 
        TextField tbookinf5=new TextField(); 
                       //Create panes to arrange labels and TextField on adding stage no.2 
        FlowPane fbook=new FlowPane();                                             //Create pane
        fbook.getChildren().addAll( lbook1,tbook1); fbook.setHgap(10); fbook.setAlignment(Pos.CENTER);             //Add nodes to pane & set the horizontal distance between nodes & set it in center
         GridPane hbook1=new GridPane();                                      //create pane
        hbook1.addColumn(10,lbook2,lbook4,lbook6,lbook8); hbook1.addColumn(15,tbook2,tbook4,tbook6,tbook8); hbook1.addColumn(20,lbook3,lbook5,lbook7,lbook9); hbook1.addColumn(25,tbook3,tbook5,tbook7,tbook9);   //Add nodes to pane
        GridPane hbook2=new GridPane();                                            //create pane
        hbook2.addColumn(10,lbookinf1,lbookinf3,lbookinf5); hbook2.addColumn(15,tbookinf1,tbookinf3,tbookinf5); hbook2.addColumn(20,lbookinf2,lbookinf4); hbook2.addColumn(25,tbookinf2,tbookinf4);              //Add nodes to pane
        FlowPane fbook1=new FlowPane();                                             //create pane
        fbook1.getChildren().addAll( lbookinf6); fbook1.setHgap(10); fbook1.setAlignment(Pos.CENTER);            //Add nodes to pane & set the horizontal distance between nodes & set it in center
        FlowPane fbook3=new FlowPane();                                            //create pane
        fbook3.getChildren().addAll( btn21,btn22,btn23); fbook3.setHgap(10); fbook3.setAlignment(Pos.CENTER);      //Add nodes to pane & set the horizontal distance between nodes & set it in center
        VBox vbook1 =new VBox(10);                                                  //create pane
        vbook1.getChildren().addAll(fbook,hbook1,fbook1,hbook2,fbook3);                //Add nodes to pane
        FlowPane fbook2=new FlowPane();                                           //create pane
        fbook2.getChildren().addAll( vbook1); fbook2.setHgap(10); fbook2.setAlignment(Pos.CENTER);              //Add nodes to pane & set the horizontal distance between nodes & set it in center
                    //Set an image on the adding stage no.2
        Pane bookpane = new Pane();                                  //Create pane
       Image imbook= new Image("images (3).jpg");                     //Create an object of Image & add image to it
       ImageView vbook = new ImageView(imbook);                      //Create an object of ImageView & add the Image object to it
        vbook.fitHeightProperty().bind(bookpane.heightProperty().divide(1));            //Set the dimensions of the image according to the dimensions of the pane
        vbook.fitWidthProperty().bind(bookpane.widthProperty().divide(1));
        vbook.setX(0); vbook.setY(0);                                                                       //Set the position of the image on the pane
        bookpane.getChildren().addAll(vbook,fbook2); fbook2.setPadding(new Insets(20,40,10,133));                      //Add nodes to pane and Set the distance between the pane and the border of the stage
        Scene scenebook = new Scene(bookpane, 900, 550);                                              //Create scene & set its dimension
        Stage primaryStage6 =new Stage();                                                                 //Create adding stage no.2
        primaryStage6.setTitle("Adding Stage no.2");                                                         //Set title of adding stage no.2
        primaryStage6.setScene(scenebook);                                                                  //Add scene to stage  
        primaryStage6.setResizable(false);                                                            //Set the stage unresizable
              //Create Labels & set their text font and TextFields & set them uneditable to show reservation information in editing process
        Label lbook0 =new Label("Enter Booking no.:"); lbook0.setFont(f3); lbook0.setTextFill(Color.WHITE);
        Label lbook11 =new Label("Bus number:"); lbook11.setFont(f3); lbook11.setTextFill(Color.WHITE);
        Label lbook12 =new Label("Location:");  lbook12.setFont(f3); lbook12.setTextFill(Color.WHITE);
        Label lbook13 =new Label("Destination:"); lbook13.setFont(f3); lbook13.setTextFill(Color.WHITE);
        Label lbook14 =new Label("Leaving Date:"); lbook14.setFont(f3);  lbook14.setTextFill(Color.WHITE);
        Label lbook15 =new Label("Arrival Date:");lbook15.setFont(f3); lbook15.setTextFill(Color.WHITE);
        Label lbook16 =new Label("Leaving Time:"); lbook16.setFont(f3); lbook16.setTextFill(Color.WHITE);
        Label lbook17 =new Label("Arrival Time:"); lbook17.setFont(f3); lbook17.setTextFill(Color.WHITE);
        Label lbook18 =new Label("Aviable Seats:");lbook18.setFont(f3); lbook18.setTextFill(Color.WHITE);
        Label lbook19 =new Label("Ticket Price:");lbook19.setFont(f3); lbook19.setTextFill(Color.WHITE);
        TextField tbook0=new TextField();
        TextField tbook11=new TextField(); tbook11.setEditable(false);
        TextField tbook12=new TextField(); tbook12.setEditable(false);
        TextField tbook13=new TextField(); tbook13.setEditable(false);
        TextField tbook14=new TextField(); tbook14.setEditable(false);
        TextField tbook15=new TextField(); tbook15.setEditable(false);
        TextField tbook16=new TextField(); tbook16.setEditable(false);
        TextField tbook17=new TextField(); tbook17.setEditable(false);
        TextField tbook18=new TextField(); tbook18.setEditable(false);
        TextField tbook19=new TextField(); tbook19.setEditable(false);
                   //Create Labels & set their text font and TextFields to enter user information in editing process
        Label lbookinf11 =new Label("ID no.:"); lbookinf11.setFont(f3); lbookinf11.setTextFill(Color.WHITE);
        Label lbookinf12 =new Label("Phone number:");  lbookinf12.setFont(f3); lbookinf12.setTextFill(Color.WHITE);
        Label lbookinf13 =new Label("First Name:"); lbookinf13.setFont(f3); lbookinf13.setTextFill(Color.WHITE);
        Label lbookinf14 =new Label("Last Name:"); lbookinf14.setFont(f3); lbookinf14.setTextFill(Color.WHITE);
        Label lbookinf15 =new Label("Num. of Seats:");lbookinf15.setFont(f3); lbookinf15.setTextFill(Color.WHITE);
        Label lbookinf16 =new Label("Enter Your Information To Book Tickets:");lbookinf16.setFont(f3); lbookinf16.setTextFill(Color.WHITE);
        Label lbookinf17 =new Label("Modification of Booking list:");lbookinf17.setFont(f3); lbookinf17.setTextFill(Color.WHITE);
        TextField tbookinf11=new TextField(); 
        TextField tbookinf12=new TextField(); 
        TextField tbookinf13=new TextField(); 
        TextField tbookinf14=new TextField(); 
        TextField tbookinf15=new TextField(); 
                      //Create panes to arrange labels and TextField on editing stage
       FlowPane fbook110=new FlowPane();                                    //Create pane
        fbook110.getChildren().addAll( lbookinf17); fbook110.setHgap(10); fbook110.setAlignment(Pos.CENTER);                    //Add nodes to pane & set the horizontal distance between nodes & set it in center
         GridPane hbook11=new GridPane();                                           //create pane
        hbook11.addColumn(10,lbook0,lbook12,lbook14,lbook16,lbook18); hbook11.addColumn(15, tbook0, tbook12,tbook14,tbook16,tbook18); hbook11.addColumn(20,lbook11,lbook13,lbook15,lbook17,lbook19); hbook11.addColumn(25,tbook11,tbook13,tbook15,tbook17,tbook19);    //Add nodes to pane
        GridPane hbook12=new GridPane();                                            //create pane
        hbook12.addColumn(10,lbookinf11,lbookinf13,lbookinf15); hbook12.addColumn(15,tbookinf11,tbookinf13,tbookinf15); hbook12.addColumn(20,lbookinf12,lbookinf14); hbook12.addColumn(25,tbookinf12,tbookinf14);                //Add nodes to pane
        FlowPane fbook11=new FlowPane();                                              //create pane
        fbook11.getChildren().addAll( lbookinf16); fbook11.setHgap(10); fbook11.setAlignment(Pos.CENTER);                                //Add nodes to pane & set the horizontal distance between nodes & set it in center
        FlowPane fbook13=new FlowPane();                                                    //create pane
        fbook13.getChildren().addAll( btn121); fbook13.setHgap(10); fbook13.setAlignment(Pos.CENTER);                      //Add nodes to pane & set the horizontal distance between nodes & set it in center
        VBox vbook11 =new VBox(10);                                                       //create pane
        vbook11.getChildren().addAll(fbook110,hbook11,fbook11,hbook12,fbook13);              //Add nodes to pane
        FlowPane fbook12=new FlowPane();                                                      //create pane
        fbook12.getChildren().addAll( vbook11); fbook12.setHgap(10); fbook12.setAlignment(Pos.CENTER);                        //Add nodes to pane & set the horizontal distance between nodes & set it in center
                         //Set an image on the editing stage
        Pane editpane = new Pane();                                      //Create pane
       Image imbook1= new Image("images (3).jpg");                              //Create an object of Image & add image to it
       ImageView vbookv1 = new ImageView(imbook1);                           //Create an object of ImageView & add the Image object to it
        vbookv1.fitHeightProperty().bind(editpane.heightProperty().divide(1));                      //Set the dimensions of the image according to the dimensions of the pane
        vbookv1.fitWidthProperty().bind(editpane.widthProperty().divide(1));
        vbookv1.setX(0); vbookv1.setY(0);                                                 //Set the position of the image on the pane
       editpane.getChildren().addAll(vbookv1,fbook12); fbook12.setPadding(new Insets(20,40,10,133));               //Add nodes to pane and Set the distance between the pane and the border of the stage
        Scene sceneedit = new Scene(editpane, 900, 550);                               //Create scene & set its dimension
        Stage primaryStage8 =new Stage();                                                     //Create editing stage
        primaryStage8.setTitle("Editing Stage");                                        //Set title of editing stage
        primaryStage8.setScene(sceneedit);                                                   //Add scene to stage
        primaryStage8.setResizable(false);                                          //Set the stage unresizable
       
       btn.setOnAction(e-> {                   //Code for login process//
                try {
                    Scanner s=new Scanner(new File("file.txt"));        //Reading usernames & passwords file to compare input inf. with saving inf.
                    
                    while(s.hasNext()){
                    String n =s.nextLine();                                                   
                    l.setText(n);                                                               //Store data form file in label
                    if (l.getText().equals(t.getText()+tt.getText())){                            //Comparing the input data with stored data
                        String name = t.getText()+tt.getText()+".txt";        
                try{        
                     //Reading from the user's booking list information file
                    Scanner s1=new Scanner(new File(name));
                    while(s1.hasNext()){ 
                     
                    String nn =s1.nextLine();
                        
                        inf.setText(inf.getText()+"\n"+nn);                          //Display booking information in label
                    }Hallo.setText("Hallo"+"  "+t.getText()+"!");                 
                        primaryStage.close();
                        primaryStage1.show();                                      //Show Booking list Stage with reversations list
                        
                } catch(FileNotFoundException ex) {
                    PrintWriter log =new PrintWriter(new File (t.getText()+tt.getText()+".txt"));   //Create new file to new user with initial empty reservations list
                log.println(""); 
                } break;} 
                    else if(!l.getText().equals(t.getText()+tt.getText())){      
                        primaryStage2.show();                                 //Show the first message stage about a wrong in login process 
                    }}
                        
                } catch (FileNotFoundException ex) {
                    System.out.println("Not Found");
                }
        });
        
        btn1.setOnAction(e->{
            primaryStage3.show();                                  //Show the create account stage
        });
        
        btn2.setOnAction(e->{                                        //Code for create account process//     
            
            boolean ture = true;
           
            PrintWriter pp;
            try {
                pp = new PrintWriter(new FileOutputStream(new File("file.txt"),ture));    
                pp.println(t1.getText()+tt1.getText());                           //Store username & pass about the new user
            pp.close();
             primaryStage3.close();                                                //Close create account stage
            } catch (FileNotFoundException ex) {
                    System.out.println("Not Found");
            }
            
});
         btn3.setOnAction(e->{                         //Code for exit create account stage without any storage data//
            primaryStage3.close();
        });
         
          btn4.setOnAction(e->{                           //Code for show adding stage//    
            primaryStage4.show();
        });btn5.setOnAction(e->{                            //Code for show editing stage//
            primaryStage8.show();    
        });
        tbook0.setOnKeyPressed(e->{try{                           //Code for show reservation inf. in editing stage//
             String name = t.getText()+tt.getText()+".txt";
                                                //Read data from files
             Scanner s9=new Scanner(new File(name));                      
        Scanner s10=new Scanner(new File("Passengers' Information.txt"));
        Scanner se10=new Scanner(new File("Passengers' Information edit1.txt"));
        Scanner se11=new Scanner(new File("Passengers' Information edit2.txt"));
        Scanner s11=new Scanner(new File("Busseats.txt"));
        while(s9.hasNext()){
                            String nnsearch =s9.next();
                             lledit.setText(nnsearch);                     //Store data from user reservation’s inf. file in label
                            
                             if ((lledit.getText().equals((tbook0.getText())))){      //Compare this data with input data 
                              //Show reservation details in TextFields
                                 for(int i=0;i<8;i++){
                                 String nline =s9.next();
                                 if (i==0)                                        
                              tbook11.setText(nline); 
                          else if(i==1)
                             tbook11.setText(nline);
                                 else if(i==2)
                             tbook12.setText(nline);
                          else if(i==3)
                             tbook14.setText(nline);
                           else if(i==4)
                             tbook16.setText(nline);
                          else if(i==5)
                             tbook13.setText(nline);
                          else if(i==6)
                             tbook15.setText(nline);
                          else 
                             tbook17.setText(nline);}
        while(s10.hasNext()){
                            String nnsearch1 =s10.next();
                             lledit1.setText(nnsearch1);                                 //Store data from Passengers' Information file in label
                            
                             if ((lledit1.getText().equals((tbook0.getText())))){              //Compare this data with input data
                              //Show reservation details and personal inf. in TextFields
                                 for(int i=0;i<5;i++){
                                 String nline =s10.next(); 
                                 if (i==0)                     
                              tbookinf11.setText(nline);                           
                          else if(i==1)
                             tbookinf13.setText(nline);
                                 else if(i==2)
                             tbookinf14.setText(nline);
                          else if(i==3)
                             tbookinf12.setText(nline);
                           else 
                             tbookinf15.setText(nline);
                          }}}
        while(se10.hasNext()){
                            String nnsearch1 =se10.next();
                             lledit2.setText(nnsearch1);                          //Store data from Passengers' Information edit1 file in label
                            
                             if ((lledit2.getText().equals((tbook0.getText())))){   //Compare this data with input data
                             //Show reservation details and personal inf. in TextFields
                                 for(int i=0;i<5;i++){
                                 String nline =se10.next();
                                 if (i==0)        
                              tbookinf11.setText(nline);                                 
                          else if(i==1)
                             tbookinf13.setText(nline);
                                 else if(i==2)
                             tbookinf14.setText(nline);
                          else if(i==3)
                             tbookinf12.setText(nline);
                           else 
                             tbookinf15.setText(nline);
                          }}}
     while(se11.hasNext()){
                            String nnsearch1 =se11.next();
                             lledit3.setText(nnsearch1);                      //Store data from Passengers' Information edit2 file in label
                            
                             if ((lledit3.getText().equals((tbook0.getText())))){        //Compare this data with input data
                              //Show reservation details and personal inf. in TextFields
                                 for(int i=0;i<5;i++){
                                 String nline =se11.next();
                                 if (i==0)
                              tbookinf11.setText(nline); 
                          else if(i==1)
                             tbookinf13.setText(nline);
                                 else if(i==2)
                             tbookinf14.setText(nline);
                          else if(i==3)
                             tbookinf12.setText(nline);
                           else 
                             tbookinf15.setText(nline);
                          }}}
              while(s11.hasNext()){                        
                         for(int i=0;i<6;i++){
                              
                             String nn =s11.nextLine();                     //Store data from Busseats file in label
                                 //Store no. of available seats in variables to be easy to be shown or modify
                             if (i==0){
                              lnobookingedit.setText(nn);
                                bus7550 = (int)Double.parseDouble(lnobookingedit.getText());}     
                             else if(i==1){
                             lnobookingedit.setText(nn);
                             bus7560 = (int)Double.parseDouble(lnobookingedit.getText());}
                             else if(i==2){
                              lnobookingedit.setText(nn);
                             bus7565 = (int)Double.parseDouble(lnobookingedit.getText());}
                             else if(i==3){
                              lnobookingedit.setText(nn);
                             bus7562 = (int)Double.parseDouble(lnobookingedit.getText());}
                             else if(i==4){
                              lnobookingedit.setText(nn);
                             bus7570 = (int)Double.parseDouble(lnobookingedit.getText());}
                             else {
                             lnobookingedit.setText(nn);
                             bus7575 = (int)Double.parseDouble(lnobookingedit.getText());}}}
            double tmp,m;
            double mm= Double.parseDouble(tbook11.getText());                     //Store input bus number in variable
            int mm1= (int)mm;
            if (mm1==7550){                                                      
            tmp= bus7550;
            m=p50;
            tbook18.setText(String.format("%3.0f",tmp));                         //Display number of available seats
            tbook19.setText(String.format("%3.0f",m));}                            //Display the price of ticket
          else if (mm1==7560){
             tmp= bus7560;
             m=p60;
            tbook18.setText(String.format("%3.0f",tmp));                             //Display number of available seats
            tbook19.setText(String.format("%3.0f",m));}                              //Display the price of ticket
           else if (mm1==7565){
             tmp= bus7565;
             m=p65;
            tbook18.setText(String.format("%3.0f",tmp));                             //Display number of available seats
            tbook19.setText(String.format("%3.0f",m));}                                 //Display the price of ticket
           else if (mm1==7562){
             tmp= bus7562;
             m=p62;
            tbook18.setText(String.format("%3.0f",tmp));                            //Display number of available seats
            tbook19.setText(String.format("%3.0f",m));}                            //Display the price of ticket
           else if (mm1==7570){
             tmp= bus7570;
             m=p70;
            tbook18.setText(String.format("%3.0f",tmp));                           //Display number of available seats
            tbook19.setText(String.format("%3.0f",m));}                             //Display the price of ticket
          else {
            tmp= bus7575;
            m=p75;
            tbook18.setText(String.format("%3.0f",tmp));                             //Display number of available seats
            tbook19.setText(String.format("%3.0f",m));}                                 //Display the price of ticket
                             }} lcal.setText(tbookinf15.getText()); }catch (FileNotFoundException ex) {
                    System.out.println("Not Found");}
        });
        btn121.setOnAction(e->{                                                    //Code for saving edit //
        try{                                              //Reading and writing form and in file 
            Scanner s12 =new Scanner(new File("Passengers' Information.txt"));
             Scanner see10=new Scanner(new File("Passengers' Information edit1.txt"));
        Scanner see11=new Scanner(new File("Passengers' Information edit2.txt"));     
        PrintWriter p12 =new PrintWriter(new FileOutputStream(new File("Passengers' Information edit1.txt"),true));
        PrintWriter pp12 =new PrintWriter(new FileOutputStream(new File("Passengers' Information edit2.txt"),true));
                                      //Store text from TextField in variables to be easy to be displayed or modify
        double tmp1 = Double.parseDouble(lcal.getText());
        double tmp2 = Double.parseDouble(tbookinf15.getText());
        double tmp3 = Double.parseDouble(tbook18.getText());
        double tmpt =tmp1+tmp3-tmp2;
        if((tmp1+tmp3-tmp2)<0){ primaryStagesworng.show();                  //Show the fourth message stage about a wrong in save editing
        }
        else{ 

        while(see11.hasNext()){
        String n=see11.next();                                                   //Store data from Passengers' Information edit2 file in label
        if(tbook0.getText().equals(n)){                                          //Compare this data with input data
            led.setText("2"); a = Double.parseDouble(led.getText()); b=(int) a;       //Determined values for some variables used in comparisons
        
        primaryStageeditwrong.show();                                            //Show the fifth message stage about a  wrong in save editing
        }}
       if(b!=2){
         while(see10.hasNext()){
        String n0=see10.next();                                                  //Store data from Passengers' Information edit1 file in label
        if(tbook0.getText().equals(n0)){                                             //Compare this data with input data
            //Store the input new data of editing
        pp12.println(n0+"  "+tbookinf11.getText()+"  "+tbookinf13.getText()+"  "+tbookinf14.getText()+"  "+tbookinf12.getText()+"  "+tbookinf15.getText());
         led.setText("3"); a = Double.parseDouble(led.getText()); b=(int) a;              //Determined values for some variables used in comparisons
      primaryStageSave.show();                                                         //Show the third massage stage about a conformation of Editing process
        }}}if((b!=3)&&(b!=2)){
         while(s12.hasNext()){
        String nn=s12.next();                                                         //Store data from Passengers' Information edit file in label
        if(tbook0.getText().equals(nn)){                                                 //Compare this data with input data
                  //Store the input new data of editing 
            p12.println(nn+"  "+tbookinf11.getText()+"  "+tbookinf13.getText()+"  "+tbookinf14.getText()+"  "+tbookinf12.getText()+"  "+tbookinf15.getText());
           primaryStageSave.show();                                                 //Show the third message stage about a conformation of Editing process
        
        }}} if((b!=2)){  
                //Read data from Busseats file
        PrintWriter ped3=new PrintWriter(new FileOutputStream(new File("Busseats.txt"),false));
        double mm= Double.parseDouble(tbook11.getText());     
                                  int mm1= (int)mm;
                                 if (mm1==7550)
                                       bus7550=tmpt;
                                                        
                                 else if (mm1==7560)
                                       bus7560=tmpt;
                                else if (mm1==7565)
                                       bus7565=tmpt;
                                else if (mm1==7562)
                                       bus7562=tmpt;
                                else if (mm1==7570)
                                       bus7570=tmpt;
                                
                                else 
                                       bus7575=tmpt;
                       //Store the new data of number available seats from editing process
      ped3.println(String.format("%3.0f",bus7550)+"\n"+String.format("%3.0f",bus7560)+"\n"+String.format("%3.0f",bus7565)+"\n"+String.format("%3.0f",bus7562)+"\n"+String.format("%3.0f",bus7570)+"\n"+String.format("%3.0f",bus7575));
                                ped3.close();                      
        } }
           primaryStage8.close();                                        //Close the editing stage
           p12.close(); pp12.close(); 
        System.out.println(led.getText());
        }catch (FileNotFoundException ex) {
                    System.out.println("Not Found");}
        
        });
        
        btn7.setOnAction(e->{                                                //Code for display buses list//
                 try{  //Reading from the buses information file called "flieadd"
                     Scanner s2=new Scanner(new File("flieadd.txt"));
                   for(int i=7;i<=17;i++){ 
                    if(s2.hasNext()==true){
                    String nline =s2.nextLine();                                 //Store data from flieadd file in label
                  //Display buses data in uneditable TextFields
                          if (i==8)
                             
                              btn8.setText(nline); 
                          else if(i==9)
                             btn9.setText(nline);
                          else if(i==10)
                             btn10.setText(nline);
                           else if(i==11)
                             btn11.setText(nline);
                          else if(i==12)
                             btn12.setText(nline);
                           else if(i==13)
                             btn13.setText(nline);
                          else if(i==14)
                             btn14.setText(nline);
                           else if(i==15)
                             btn15.setText(nline);
                          else if(i==16)
                             btn16.setText(nline);
                        }} }
           catch (FileNotFoundException ex) {
                    System.out.println("Not Found");}
           });
        btn20.setOnAction(e->{primaryStage1.close();                          //Close Booking list stage
        
            try {  
               Scanner s3 = new Scanner(new File("flieadd.txt"));
                  while(s3.hasNext()){
                            String nnsearch =s3.next();                       //Store data from flieadd file in label
                             llsearch.setText(nnsearch);
                             tbook1.setText(busno.getText());
                             if ((llsearch.getText().equals((busno.getText())))){      //Compare storage data with input data
                              //Display bus details in uneditable TextFields
                                 for(int i=0;i<6;i++){
                                 String nline =s3.next();
                           if (i==0)
                              tbook2.setText(nline); 
                          else if(i==1)
                             tbook4.setText(nline);
                          else if(i==2)
                             tbook6.setText(nline);
                           else if(i==3)
                             tbook3.setText(nline);
                          else if(i==4)
                             tbook5.setText(nline);
                          else  
                             tbook7.setText(nline);
                          
           }} }  Scanner s6=new Scanner(new File("Busseats.txt"));
                    
                         for(int i=0;i<6;i++){
                                 String nn =s6.nextLine();                       //Store data from Busseats file in label
                                 //Store no. of available seats in variables to be easy to be shown or modify
                                 if (i==0){
                              busnoseats.setText(nn);
                                bus7550 = (int)Double.parseDouble(busnoseats.getText());}     
                             else if(i==1){
                             busnoseats.setText(nn);
                             bus7560 = (int)Double.parseDouble(busnoseats.getText());}
                             else if(i==2){
                              busnoseats.setText(nn);
                             bus7565 = (int)Double.parseDouble(busnoseats.getText());}
                             else if(i==3){
                              busnoseats.setText(nn);
                             bus7562 = (int)Double.parseDouble(busnoseats.getText());}
                             else if(i==4){
                              busnoseats.setText(nn);
                             bus7570 = (int)Double.parseDouble(busnoseats.getText());}
                             else {
                             busnoseats.setText(nn);
                             bus7575 = (int)Double.parseDouble(busnoseats.getText());}
                    }
                  
                  double tmp,m;
            double mm= Double.parseDouble(busno.getText());                       //Store input bus number in variable
            int mm1= (int)mm;
            if (mm1==7550){
           tmp= bus7550;
            m=p50;
            tbook8.setText(String.format("%3.0f",tmp));                           //Display number of available seats
            tbook9.setText(String.format("%3.0f",m));}                           //Display the price of ticket
          else if (mm1==7560){
             tmp= bus7560;
             m=p60;
            tbook8.setText(String.format("%3.0f",tmp));                           //Display number of available seats
            tbook9.setText(String.format("%3.0f",m));}                            //Display the price of ticket
           else if (mm1==7565){
             tmp= bus7565;
             m=p65;
            tbook8.setText(String.format("%3.0f",tmp));                          //Display number of available seats
            tbook9.setText(String.format("%3.0f",m));}                             //Display the price of ticket
            else if (mm1==7562){
             tmp= bus7562;
             m=p62;
            tbook8.setText(String.format("%3.0f",tmp));                            //Display number of available seats
            tbook9.setText(String.format("%3.0f",m));}                              //Display the price of ticket
             else if (mm1==7570){
             tmp= bus7570;
             m=p70;
            tbook8.setText(String.format("%3.0f",tmp));                           //Display number of available seats
            tbook9.setText(String.format("%3.0f",m));}                              //Display the price of ticket
          else {
            tmp= bus7575;
            m=p75;
            tbook8.setText(String.format("%3.0f",tmp));                          //Display number of available seats
            tbook9.setText(String.format("%3.0f",m));}                            //Display the price of ticket
            
            }           
           catch (FileNotFoundException ex) {
                    System.out.println("Not Found");}
            
           primaryStage6.show();                                                  //Show Adding stage no.2
            System.out.println(busnoseats.getText());
            });
        btn21.setOnAction(e->{    //Code for add new reversation to booking list//
         double tmp1 = Double.parseDouble(tbook8.getText());
        double tmp2 =Double.parseDouble(tbookinf5.getText());
         if((tmp1-tmp2)<0){ primaryStagesworng1.show();                  //Show the sixth message stage about a wrong in adding process
        }
        else{ 
            Scanner s4;
            try {         //Reading data from files
                s4 = new Scanner(new File("flieadd.txt"));
                Scanner s7=new Scanner(new File("no.booking.txt")); 
                double m= Double.parseDouble(tbook8.getText());                     //Store number of available seats in variable
                 if(m==0){                                                       
                  primaryStage7.show();                               //When the number of seats =0, Show the second massage stage about a  wrong in Booking process 
                 }
                 else{ primaryStage1.close();                                            //Close Booking list stage
                                  //Store the new reservation data in files  
                 String name = t.getText()+tt.getText()+".txt";
                     PrintWriter p1=new PrintWriter(new FileOutputStream(new File(name),true));
                     PrintWriter p2=new PrintWriter(new FileOutputStream(new File("Passengers' Information.txt"),true));
                     PrintWriter p3=new PrintWriter(new FileOutputStream(new File("Busseats.txt"),false));
                     PrintWriter p4=new PrintWriter(new FileOutputStream(new File("no.booking.txt"),true));
                     
                while(s4.hasNext()){
                            String nnsearch =s4.next();               
                             llsearch.setText(nnsearch);                            //Store data from flieadd file in label
                             
                             if ((llsearch.getText().equals((busno.getText())))){         //Compare the input data with storage data
                                String nline =s4.nextLine();
                                while(s7.hasNext()){
                                lnobooking.setText(s7.nextLine());                    //Store data from no.booking file in label
                                }j=Double.parseDouble(lnobooking.getText());               
                                j=j+105;                                             //with new reservation add 105 on the last number of booking
                                              //Store the data of new reservation in the file of user's booking list  
                                p1.println(String.format("%3.0f",j)+"    "+"Busno."+"   "+busno.getText()+""+nline);
                                                 //Store personal information in Passengers' Information file
                 p2.println(String.format("%3.0f",j)+"\t"+tbookinf1.getText()+"\t"+tbookinf3.getText()+"\t"+tbookinf4.getText()+"\t"+tbookinf2.getText()+"\t"+tbookinf5.getText());
                                //Modify the number of available seats  and display them after modification 
                                double mm= Double.parseDouble(busno.getText());     
                                  double no= Double.parseDouble(tbookinf5.getText()); 
                                  int mm1= (int)mm;
                                  int no1= (int)no;
                                 if (mm1==7550){
                                       bus7550-=no;
                                        tbook8.setText(String.format("%2.0f",bus7550));}
                                 else if (mm1==7560){
                                       bus7560-=no;
                                 tbook8.setText(String.format("%2.0f",bus7560));}
                                else if (mm1==7565){
                                       bus7565-=no;
                                tbook8.setText(String.format("%2.0f",bus7565));}
                                else if (mm1==7562){
                                       bus7562-=no;
                                tbook8.setText(String.format("%2.0f",bus7562));}
                                else if (mm1==7570){
                                       bus7570-=no;
                                tbook8.setText(String.format("%2.0f",bus7570));}
             
                                else {
                                       bus7575-=no;
                                tbook8.setText(String.format("%2.0f",bus7575));}
                                          //Store the new data of number available seats after adding process
                               p3.println(String.format("%3.0f",bus7550)+"\n"+String.format("%3.0f",bus7560)+"\n"+String.format("%3.0f",bus7565)+"\n"+String.format("%3.0f",bus7562)+"\n"+String.format("%3.0f",bus7570)+"\n"+String.format("%3.0f",bus7575));
                             p4.println(String.format("%3.0f",j));
                             }} p1.close(); p2.close(); p3.close();p4.close();
                 }}             
           catch (FileNotFoundException ex) {
                    System.out.println("Not Found");}} });
        
       btn23.setOnAction(e->{                              //Code Booking list after adding process//
           try{
           inf.setText("");
           String name = t.getText()+tt.getText()+".txt";
           //Reading from the user's booking list information file
           Scanner s1=new Scanner(new File(name));
                    while(s1.hasNext()){ 
                     
                    String nn =s1.nextLine();
                        Hallo.setText("Hallo"+"  "+t.getText()+"!");
                        inf.setText(inf.getText()+"\n"+nn);                          //Display booking information in label
                    primaryStage1.show();                                         //Show Booking list Stage with reservations list
                    }}catch (FileNotFoundException ex) {
                    System.out.println("Not Found");}
       });        btn22.setOnAction(e->{ primaryStage6.close();                    //Close Adding stage no.2
                       primaryStage4.close();                                     //Close Adding stage
                    primaryStage1.show();                                           //Show Booking list stage
       });      
                 //Set an image on the login stage
       Pane rt = new Pane();                                //Create pane 
        Image im;                                              //Create an object of Image
        im = new Image("download.jpg");                       //Add image to the Image object 
       ImageView v;                                        //Create an object of ImageView
        v = new ImageView(im);                                    //Add object Image to the ImageView
        v.fitHeightProperty().bind(rt.heightProperty().divide(1));                 //Set the dimensions of the image according to the dimensions of the pane
        v.fitWidthProperty().bind(rt.widthProperty().divide(1));
        v.setX(0);  v.setY(0);                            //Set the position of the image on the pane
              //Create pane to arrange nodes on login stage
        HBox h3 =new HBox(5);                             //Create pane
        h3.getChildren().addAll(btn,btn1);                 //Add nodes to pane
        GridPane root =new GridPane();                    //Create pane
        root.addColumn(5, l1,l2); root.addColumn(10, t,tt,h3);      //Add nodes on the pane
        root.setHgap(5); root.setVgap(5);                       //Set the vertical & the horizontal distance between nodes
        root.setPadding(new Insets(20,40,10,40));               //Set the distance between the pane and the border of the stage
        rt.getChildren().addAll(v,root);                        //Add nodes on the pane
        
        Scene scene = new Scene(rt, 450, 250);                      //Create scene and add pane to it
        
        primaryStage.setTitle("Login Stage");                       //Set a title of create account stage
        primaryStage.setScene(scene);                                //Add scene to stage
        primaryStage.show();  
        
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}

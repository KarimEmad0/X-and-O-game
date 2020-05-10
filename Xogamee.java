/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xogamee;
 
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.lang.String;
 
/**
 *
 * @author hp
 */
public class Xogamee {
  static boolean turn = true;
  static int finish=0;
 static Integer counter = 0;
 static Integer counter2=0;
 
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
    	Font font = new Font ("Play",Font.ITALIC,25);
    	
    	Color colorBtn = new Color(160,82,45);
        // create new frame
//---------------------------------------------------------------------        
        final JFrame myframe = new JFrame ("Tic Tac Toe") ; 
        myframe.setBounds(450, 200, 450,450);	       
		myframe.getContentPane().setBackground(Color.ORANGE);
		myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myframe.setResizable(false);            
 //-------------------------------------------------------------------------------------------  
 
//--------------------------------------------------------------------------------------
               //Button play  
//--------------------------------------------------------------------------------------------------               
        final JButton play = new JButton ("Play");
		play.setBounds(120, 100, 200, 50);
		play.setFont(font);
		play.setBackground(colorBtn); //background of button
		myframe.add(play);            //add button to frame
//----------------------------------------------------------------------
		//BUTTON HELO
		 final JButton help = new JButton ("Help");
		 help.setBounds(120, 180, 200, 50);
		 help.setFont(font);
		 help.setBackground(colorBtn);
		 myframe.add(help);
//----------------------------------------------------------------------
			//BUTTON EXIT
		    JButton Exit = new JButton ("Exit");
		    Exit.setBounds(120, 260, 200, 50);
			Exit.setFont(font);
			Exit.setBackground(colorBtn);
	         myframe.add(Exit);

//------------------------------------------------------------------------------------------------------
	   //DESIGN FiNISHED
//---------------------------------------------------------------------------------------
	        //ACTION LESIENER 
	        //EXIT 
	    Exit.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
                // TODO Auto-generated method stub
    Component frame = new JFrame ("Exit");
if(JOptionPane.showConfirmDialog(frame ,"if you want to exit from the game enter yes", "xogame", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
 
	System.exit(0);
	}
            }	
	});
  //------------------------------------------------------------
        //ACTION LESIENER 
        //HELP	  
    help.addActionListener(new ActionListener() {
 
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
				final JFrame myframe4 = new JFrame ("xogame");
				myframe4.setBounds(350, 200, 600, 580);
				myframe4.getContentPane().setBackground(Color.gray);
				myframe4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				JLabel x = new JLabel (new ImageIcon("F:\\Java projects\\X & O\\help.jpg"));
				x.setSize(600,505);
				myframe4.setResizable(false);
				myframe4.add(x);
				Color x3 = new Color(255 ,255,255);
				myframe4.getContentPane().setBackground( x3 );
				JButton b3 = new JButton ("Back");
				b3.setSize(100,50);
				b3.setLocation(230, 500);
				Font font2 = new Font ("Back",Font.BOLD,20);
				b3.setFont(font2);
				Color x2 = new Color( 162 ,181,205 );
				b3.setBackground( x2 );
				myframe4.add(b3);
				b3.addActionListener(new ActionListener() {
 
					public void actionPerformed(ActionEvent arg0) {
						// TODO Auto-generated method stub4
						myframe.setVisible(true);
						myframe4.setVisible(false);
						}
 
				});
 
 		        myframe4.setLayout(null);
				myframe4.setVisible(true);
				myframe.setVisible(false);
 
				}
			});                       
 
    //------------------------------------------------------------
    //ACTION LESIENER 
    //PLAY	  	                 
//-------------------------------------------------------------------------------------------               
       play.addActionListener(new ActionListener() {         
       @Override
       public void actionPerformed(ActionEvent e) {
           	 //create new frame 
        JFrame gameFrame = new JFrame("Tic Tac Toe");		
        gameFrame.setBounds(450, 200, 450,450);
        gameFrame.getContentPane().setBackground(Color.ORANGE);
		gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gameFrame.setResizable(false);            
//----------------------------------------------
       // FIRST PLAYER 
		JLabel player1 = new JLabel("player 1");   // label 1 
		player1.setBounds(10, 20, 301, 5);
		player1.setSize(301, 51);
        player1.setLocation(10, 20);
	   player1.setBackground(Color.green);
       gameFrame.add(player1);
       JTextArea Text1 = new JTextArea("");       //text 1 
      Text1.setBounds(60, 30, 130, 30);
       Text1.setBackground(Color.DARK_GRAY);
       Text1.setFont(font);
       Text1.setEnabled(false);
       gameFrame.add(Text1);
   //------------------------------
       //SECONDPLAYER
       JLabel player2 = new JLabel("player 2");     //label2 
       player2.setBounds(10, 65, 301, 51);
       player2.setBackground(Color.WHITE);
       gameFrame.add(player2);
       JTextArea Text2 = new JTextArea("");    //text 2
      Text2.setBounds(60, 80, 130, 30);
       Text2.setBackground(Color.DARK_GRAY);
       
       Text2.setFont(font);
       Text2.setEnabled(false);
       gameFrame.add(Text2);
   //-----------------------------------------------------
                //Create Buttons  
   //-----------------------------------------------------------              
 
   		final JButton [][] b = new JButton[3][3];
        int x = 75, y = 125; //dimension of buttons
        for(int row=0;row<3;row++)
        {
        for (int colum = 0; colum < 3; colum++) 
        {
          b[row][colum] = new JButton("");
    	  b[row][colum].setBounds(x, y, 100, 60);
          b[row][colum].setBackground(Color.WHITE);
		  gameFrame.add(b[row][colum]);
		  x += 100;
	      if((colum+1) % 3 == 0)
		    {
			y+= 60;
			x = 75;
		    }
 
	      int r=row,c=colum;
		b[row][colum].addActionListener(new ActionListener() 
		{
 
			public void actionPerformed(ActionEvent arg0) 
			{
 
				b[r][c].setEnabled(false);	
				if(turn == true)
				{
					b[r][c].setText("X");
                    b[r][c].setBackground(Color.cyan);
					turn = false;
					finish++;
				}
				 else
					{
						b[r][c].setText("O");
                        b[r][c].setBackground(Color.PINK);                    
						turn = true;
						finish++;
					}
				   if (b[0][0].getText()=="X" && b[0][1].getText()=="X" && b[0][2].getText()=="X" ||
                 b[1][0].getText()=="X" && b[1][1].getText()=="X"  && b[1][2].getText()=="X" ||
                 b[2][0].getText()=="X" && b[2][1].getText()=="X"  && b[2][2].getText()=="X" ||
 
                 b[0][0].getText()=="X" && b[1][0].getText()=="X"  && b[2][0].getText()=="X"  ||
                 b[0][1].getText()=="X" && b[1][1].getText()=="X"  && b[2][1].getText()=="X"  ||
                 b[0][2].getText()=="X" && b[1][2].getText()=="X"  && b[2][2].getText()=="X"  ||
 
                b[0][0].getText()=="X"&&b[1][1].getText()=="X"&&b[2][2].getText()=="X" ||
                b[0][2].getText()=="X" && b[1][1].getText()=="X" && b[2][0].getText()=="X")
 
          {
 
                JOptionPane.showMessageDialog(null,"player 1 win" );
                   for(int row = 0 ; row <3; row++)
       					{
       		     			for(int colum = 0 ; colum <3; colum++)
       			    		{
                                    b[row][colum].setText("");
                                    b[row][colum].setBackground(Color.white);
                                    b[row][colum].setEnabled(true);
 
                             }	 
 
					 }
                           finish=0;
                           counter ++;
                           Text1.setText(counter.toString());
                            turn = true;	// win back turn to true to can start with X Not O at condition above 			        
 
            } //end of first condition
 
 
         else if( b[0][0].getText()=="O" && b[0][1].getText()=="O" && b[0][2].getText()=="O" ||
                 b[1][0].getText()=="O" && b[1][1].getText()=="O"  && b[1][2].getText()=="O" ||
                 b[2][0].getText()=="O" && b[2][1].getText()=="O"  && b[2][2].getText()=="O" ||
 
 
                 b[0][0].getText()=="O" && b[1][0].getText()=="O"  && b[2][0].getText()=="O"  ||
                 b[0][1].getText()=="O" && b[1][1].getText()=="O"  && b[2][1].getText()=="O"  ||
                 b[0][2].getText()=="O" && b[1][2].getText()=="O"  && b[2][2].getText()=="O"  ||
 
                 b[0][0].getText()=="O"&&b[1][1].getText()=="O"&&b[2][2].getText()=="O"||
                 b[0][2].getText()=="O"&&b[1][1].getText()=="O"&&b[2][0].getText()=="O")
 
         {
 
 
 
             JOptionPane.showMessageDialog(null,"player 2 win" );
             for(int row = 0 ; row <3; row++)
					{
		     			for(int colum = 0 ; colum <3; colum++)
        			    		{
                                 b[row][colum].setText("");
                                 b[row][colum].setBackground(Color.white);
                                 b[row][colum].setEnabled(true);                            
	                              }	 
 
 						 }
             					finish=0;
                               counter2 ++;
                               Text2.setText(counter2.toString());
 
             }
         else if (finish==9)         
         {
        	 JOptionPane.showMessageDialog(null,"Draw" );
             for(int row = 0 ; row <3; row++)
					{
		     			for(int colum = 0 ; colum <3; colum++)
        			    		{
                                 b[row][colum].setText("");
                                 b[row][colum].setBackground(Color.white);
                                 b[row][colum].setEnabled(true);                            
	                              }	 
 
 					}
             finish=0;         
             turn = true;	
         }
 
                                }     //Action performed close  
                        });   //close constructor
                }
        }
          //close loop 
//---------------------------------------------------------------------------------------------
        //RESTART BUTTON
   //-----------------------------------------
 
            JButton restartBtn = new JButton("Restart");
			restartBtn.setBounds(0, 320, 140, 50);
			restartBtn.setFont(font);
			restartBtn.setBackground( colorBtn );
			gameFrame.add(restartBtn);
			restartBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
 
				  for(int row = 0 ; row <3; row++)
 					{
 		     			for(int colum = 0 ; colum <3; colum++)
 			    		{
                              b[row][colum].setText("");
                              b[row][colum].setBackground(Color.white);
                              b[row][colum].setEnabled(true);  
                       }           
				 }
				  finish=0;
				  counter=0;
				  counter2=0;
				  Text1.setText("");
				  Text2.setText("");
				  turn = true;
			}
						});
 
  //--------------------------------------------------------------------
			//MENU BUTTON
	//----------------------------------
                JButton menu = new JButton("Menu");
				menu.setBounds(145, 320,140, 50);
				menu.setFont(font);
				menu.setBackground(colorBtn);
				gameFrame.add(menu);
				menu.addActionListener(new ActionListener() {	
							public void actionPerformed(ActionEvent arg0) {
								 finish=0;
								  counter=0;
								  counter2=0;
								  turn = true;
 								gameFrame.setVisible(false);
                                 myframe.setVisible(true);
							}
						});
    //----------------------------------------------------- 
				//EXIT BUTTON
	//-------------------------------
	JButton exit = new JButton ("Exit");
	exit.setBounds(290, 320, 140, 50);	
	exit.setFont(font);
	exit.setBackground(colorBtn);
    gameFrame.add(exit);
 
    exit.addActionListener(new ActionListener() {	
			public void actionPerformed(ActionEvent arg0) {
 
        Component frame = new JFrame ("Exit");
		if(JOptionPane.showConfirmDialog(frame ,"if you want to exit from the game enter yes", "Tic Tac Toe", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
		  	System.exit(0);
		}
                        }	
		});
 
        gameFrame.setLayout(null);
		gameFrame.setVisible(true);
		myframe.setVisible(false);       
       }
 
 
 
}); // END OF PLAY FRAME 
        myframe.setLayout(null);
        myframe.setVisible(true);
            }
        }        
 
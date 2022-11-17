import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class myTicTacToe {
		JFrame window = new JFrame("Tic Tac Toe");

			Icon resetImg = new ImageIcon("reset.png");
			Icon empty = new ImageIcon("empty.png");
			Icon cross = new ImageIcon("cross.png");
			Icon circle = new ImageIcon("circle.png");
			Icon arrow = new ImageIcon("arrow.png");
			Icon arrowempty = new ImageIcon("arrowempty.png");


		JButton button1= new JButton(empty);
		JButton button2= new JButton(empty);
		JButton button3= new JButton(empty);
		JButton button4= new JButton(empty);
		JButton button5= new JButton(empty);
		JButton button6= new JButton(empty);
		JButton button7= new JButton(empty);
		JButton button8= new JButton(empty);
		JButton button9= new JButton(empty);
		JButton roundx= new JButton("X");
		JButton roundo= new JButton("O");
		JButton reset= new JButton(resetImg);

		int turn = 2;
		int buttonused[]={1,0,0,0,0,0,0,0,0,0};
		int wonned=0;
		int p1won[]={1,0,0,0,0,0,0,0,0,0};
		int p2won[]={1,0,0,0,0,0,0,0,0,0};



	myTicTacToe(){

			window.setSize(900,600);
			window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			window.setLayout(new GridLayout(3,4));

			roundx.setFont(new Font("Tahoma", 1, 48));
			roundo.setFont(new Font("Tahoma", 1, 48));
			roundx.setIcon(arrow);
			roundo.setIcon(arrowempty);

			window.add(button1);
			window.add(button2);
			window.add(button3);
			window.add(roundx);
			window.add(button4);
			window.add(button5);
			window.add(button6);
			window.add(roundo);
			window.add(button7);
			window.add(button8);
			window.add(button9);
			window.add(reset);


				//action listers
				button1.addActionListener( new Button1Action());
				button2.addActionListener( new Button2Action());
				button3.addActionListener( new Button3Action());
				button4.addActionListener( new Button4Action());
				button5.addActionListener( new Button5Action());
				button6.addActionListener( new Button6Action());
				button7.addActionListener( new Button7Action());
				button8.addActionListener( new Button8Action());
				button9.addActionListener( new Button9Action());
				reset.addActionListener( new resetAction());






			window.setVisible(true);
	}
	    int checkp1()
    {

        if(p1won[1]==1 && p1won[2]==1 && p1won[3]==1)
        {
            wonned=1;
            return 1;


        }

        if(p1won[4]==1 && p1won[5]==1 && p1won[6]==1)
        {
            wonned=1;
            return 1;
        }

        if(p1won[7]==1 && p1won[8]==1 && p1won[9]==1)
        {
            wonned=1;
            return 1;
        }

        if(p1won[1]==1 && p1won[4]==1 && p1won[7]==1)
        {
            wonned=1;
            return 1;
        }

        if(p1won[2]==1 && p1won[5]==1 && p1won[8]==1)
        {
            wonned=1;
            return 1;
        }

        if(p1won[3]==1 && p1won[6]==1 && p1won[9]==1)
        {
            wonned=1;
            return 1;
        }

        if(p1won[1]==1 && p1won[5]==1 && p1won[9]==1)
        {
            wonned=1;
            return 1;
        }

        if(p1won[7]==1 && p1won[5]==1 && p1won[3]==1)
        {
            wonned=1;
            return 1;
        }
        //checktie();
        return 0;
    }


    int checkp2()
    {

        if(p2won[1]==1 && p2won[2]==1 && p2won[3]==1)
        {
            wonned=1;
            return 1;
        }

        if(p2won[4]==1 && p2won[5]==1 && p2won[6]==1)
        {

            wonned=1;
            return 1;
        }

        if(p2won[7]==1 && p2won[8]==1 && p2won[9]==1)
        {
            wonned=1;
            return 1;
        }

        if(p2won[1]==1 && p2won[4]==1 && p2won[7]==1)
        {
            wonned=1;
            return 1;
        }

        if(p2won[2]==1 && p2won[5]==1 && p2won[8]==1)
        {
            wonned=1;
            return 1;
        }

        if(p2won[3]==1 && p2won[6]==1 && p2won[9]==1)
        {
            wonned=1;
            return 1;
        }

        if(p2won[1]==1 && p2won[5]==1 && p2won[9]==1)
        {
            wonned=1;
            return 1;
        }

        if(p2won[7]==1 && p2won[5]==1 && p2won[3]==1)
        {
            wonned=1;
            return 1;
        }

        checktie();
        return 0;
    }

	void checktie()
    {
       if (turn>10 && wonned==0)
       {
            JOptionPane.showMessageDialog(null,"!!! This is Tie  !!!");
			reset();
       }

    }


   void reset()
    {
        int i;
        roundx.setIcon(arrow);
        roundo.setIcon(arrowempty);
        button1.setIcon(empty);
        button2.setIcon(empty);
        button3.setIcon(empty);
        button4.setIcon(empty);
        button5.setIcon(empty);
        button6.setIcon(empty);
        button7.setIcon(empty);
        button8.setIcon(empty);
        button9.setIcon(empty);

        turn = 2;
        for(i=0;i<11;i++)
        {
            buttonused[i]=0;
            p1won[i]=0;
            p2won[i]=0;
         }


    }

//***************Button Action  LIstner*******************


		class Button1Action implements ActionListener{
			public void actionPerformed(ActionEvent e){

				if(buttonused[1]==0)
					{
						if(turn%2==0)
						{
						turn++;
						button1.setIcon(cross);
						roundo.setIcon(arrow);
						roundx.setIcon(arrowempty);
						buttonused[1]=1;
						p1won[1]=1;



						}
						else
						{
						turn++;
						button1.setIcon(circle);
						buttonused[1]=1;
						p2won[1]=1;


						roundx.setIcon(arrow);
						roundo.setIcon(arrowempty);


						}
					}
				else
					{
						JOptionPane.showMessageDialog(null,"!!! This Button Used Already");
					}



            int result1= checkp1();
            int result2= checkp2();

            if(result1==1)
            {
                JOptionPane.showMessageDialog(null, "** Player 1 (X) has won **");
				reset();
            }
            else if (result2==1)
            {
                JOptionPane.showMessageDialog(null, "** Player 2 (O) has won **");
				reset();
            }





			}



		}



		class Button2Action implements ActionListener{
			public void actionPerformed(ActionEvent e){


				if(buttonused[2]==0)
					{
						if(turn%2==0)
						{
						turn++;
						button2.setIcon(cross);
						roundo.setIcon(arrow);
						roundx.setIcon(arrowempty);
						buttonused[2]=1;
						p1won[2]=1;



						}
						else
						{
						turn++;
						button2.setIcon(circle);
						buttonused[2]=1;
						p2won[2]=1;


						roundx.setIcon(arrow);
						roundo.setIcon(arrowempty);


						}
					}
				else
					{
						JOptionPane.showMessageDialog(null,"!!! This Button Used Already");
					}



            int result1= checkp1();
            int result2= checkp2();

            if(result1==1)
            {
                JOptionPane.showMessageDialog(null, "** Player 1 (X) has won **");
				reset();
            }
            else if (result2==1)
            {
                JOptionPane.showMessageDialog(null, "** Player 2 (O) has won **");
				reset();
            }



			}
		}



		class Button3Action implements ActionListener{
			public void actionPerformed(ActionEvent e){


				if(buttonused[3]==0)
					{
						if(turn%2==0)
						{
						turn++;
						button3.setIcon(cross);
						roundo.setIcon(arrow);
						roundx.setIcon(arrowempty);
						buttonused[3]=1;
						p1won[3]=1;



						}
						else
						{
						turn++;
						button3.setIcon(circle);
						buttonused[3]=1;
						p2won[3]=1;


						roundx.setIcon(arrow);
						roundo.setIcon(arrowempty);


						}
					}
				else
					{
						JOptionPane.showMessageDialog(null,"!!! This Button Used Already");
					}



            int result1= checkp1();
            int result2= checkp2();

            if(result1==1)
            {
                JOptionPane.showMessageDialog(null, "** Player 1 (X) has won **");
				reset();
            }
            else if (result2==1)
            {
                JOptionPane.showMessageDialog(null, "** Player 2 (O) has won **");
				reset();
            }



			}
		}



		class Button4Action implements ActionListener{
			public void actionPerformed(ActionEvent e){


				if(buttonused[4]==0)
					{
						if(turn%2==0)
						{
						turn++;
						button4.setIcon(cross);
						roundo.setIcon(arrow);
						roundx.setIcon(arrowempty);
						buttonused[4]=1;
						p1won[4]=1;



						}
						else
						{
						turn++;
						button4.setIcon(circle);
						buttonused[4]=1;
						p2won[4]=1;


						roundx.setIcon(arrow);
						roundo.setIcon(arrowempty);


						}
					}
				else
					{
						JOptionPane.showMessageDialog(null,"!!! This Button Used Already");
					}



            int result1= checkp1();
            int result2= checkp2();

            if(result1==1)
            {
                JOptionPane.showMessageDialog(null, "** Player 1 (X) has won **");
				reset();
            }
            else if (result2==1)
            {
                JOptionPane.showMessageDialog(null, "** Player 2 (O) has won **");
				reset();
            }



			}
		}



		class Button5Action implements ActionListener{
			public void actionPerformed(ActionEvent e){


				if(buttonused[5]==0)
					{
						if(turn%2==0)
						{
						turn++;
						button5.setIcon(cross);
						roundo.setIcon(arrow);
						roundx.setIcon(arrowempty);
						buttonused[5]=1;
						p1won[5]=1;



						}
						else
						{
						turn++;
						button5.setIcon(circle);
						buttonused[5]=1;
						p2won[5]=1;


						roundx.setIcon(arrow);
						roundo.setIcon(arrowempty);


						}
					}
				else
					{
						JOptionPane.showMessageDialog(null,"!!! This Button Used Already");
					}



            int result1= checkp1();
            int result2= checkp2();

            if(result1==1)
            {
                JOptionPane.showMessageDialog(null, "** Player 1 (X) has won **");
				reset();
            }
            else if (result2==1)
            {
                JOptionPane.showMessageDialog(null, "** Player 2 (O) has won **");
				reset();
            }



			}
		}



		class Button6Action implements ActionListener{
			public void actionPerformed(ActionEvent e){


				if(buttonused[6]==0)
					{
						if(turn%2==0)
						{
						turn++;
						button6.setIcon(cross);
						roundo.setIcon(arrow);
						roundx.setIcon(arrowempty);
						buttonused[6]=1;
						p1won[6]=1;



						}
						else
						{
						turn++;
						button6.setIcon(circle);
						buttonused[6]=1;
						p2won[6]=1;


						roundx.setIcon(arrow);
						roundo.setIcon(arrowempty);


						}
					}
				else
					{
						JOptionPane.showMessageDialog(null,"!!! This Button Used Already");
					}



            int result1= checkp1();
            int result2= checkp2();

            if(result1==1)
            {
                JOptionPane.showMessageDialog(null, "** Player 1 (X) has won **");
				reset();
            }
            else if (result2==1)
            {
                JOptionPane.showMessageDialog(null, "** Player 2 (O) has won **");
				reset();
            }



			}
		}



		class Button7Action implements ActionListener{
			public void actionPerformed(ActionEvent e){


				if(buttonused[7]==0)
					{
						if(turn%2==0)
						{
						turn++;
						button7.setIcon(cross);
						roundo.setIcon(arrow);
						roundx.setIcon(arrowempty);
						buttonused[7]=1;
						p1won[7]=1;



						}
						else
						{
						turn++;
						button7.setIcon(circle);
						buttonused[7]=1;
						p2won[7]=1;


						roundx.setIcon(arrow);
						roundo.setIcon(arrowempty);


						}
					}
				else
					{
						JOptionPane.showMessageDialog(null,"!!! This Button Used Already");
					}



            int result1= checkp1();
            int result2= checkp2();

            if(result1==1)
            {
                JOptionPane.showMessageDialog(null, "** Player 1 (X) has won **");
				reset();
            }
            else if (result2==1)
            {
                JOptionPane.showMessageDialog(null, "** Player 2 (O) has won **");
				reset();
            }



			}
		}



		class Button8Action implements ActionListener{
			public void actionPerformed(ActionEvent e){


				if(buttonused[8]==0)
					{
						if(turn%2==0)
						{
						turn++;
						button8.setIcon(cross);
						roundo.setIcon(arrow);
						roundx.setIcon(arrowempty);
						buttonused[8]=1;
						p1won[8]=1;



						}
						else
						{
						turn++;
						button8.setIcon(circle);
						buttonused[8]=1;
						p2won[8]=1;


						roundx.setIcon(arrow);
						roundo.setIcon(arrowempty);


						}
					}
				else
					{
						JOptionPane.showMessageDialog(null,"!!! This Button Used Already");
					}



            int result1= checkp1();
            int result2= checkp2();

            if(result1==1)
            {
                JOptionPane.showMessageDialog(null, "** Player 1 (X) has won **");
				reset();
            }
            else if (result2==1)
            {
                JOptionPane.showMessageDialog(null, "** Player 2 (O) has won **");
				reset();
            }



			}
		}



		class Button9Action implements ActionListener{
			public void actionPerformed(ActionEvent e){


				if(buttonused[9]==0)
					{
						if(turn%2==0)
						{
						turn++;
						button9.setIcon(cross);
						roundo.setIcon(arrow);
						roundx.setIcon(arrowempty);
						buttonused[9]=1;
						p1won[9]=1;



						}
						else
						{
						turn++;
						button9.setIcon(circle);
						buttonused[9]=1;
						p2won[9]=1;


						roundx.setIcon(arrow);
						roundo.setIcon(arrowempty);


						}
					}
				else
					{
						JOptionPane.showMessageDialog(null,"!!! This Button Used Already");
					}



            int result1= checkp1();
            int result2= checkp2();

            if(result1==1)
            {
                JOptionPane.showMessageDialog(null, "** Player 1 (X) has won **");
				reset();
            }
            else if (result2==1)
            {
                JOptionPane.showMessageDialog(null, "** Player 2 (O) has won **");
				reset();
            }



			}
		}



		class resetAction implements ActionListener{
			public void actionPerformed(ActionEvent e){

				//code
				reset();
			}
		}






}

public class TicTacToe {
		public static void main(String[] args) {


		new myTicTacToe();

	}
}
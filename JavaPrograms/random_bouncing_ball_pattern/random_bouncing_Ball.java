/*=============================================================================================
*   Author :    
*
*           Himanshu Sharma
*           himanshusharma2972@gmail.com
*           Github - himanshu-sharma2018
*		********************************************
*                 Bouncing Ball Pattern 2
*         ********************************************
*
*
*
*   	About:
*		It is a simple pattern program which prints the pattern on screen 
*		In this program '@@' shape ball are there which moves on screen from left to right and up to down and vice versa
*		you can call it a type of screen saver program.	
*
*	Instruction:-
*		run the program with having terminal width & height as below mention
*		width=80
*		height=24
*		
*		or change the widht and height according to your terminal specification
*		otherwise it won't show the desired output 	
*
*=============================================================================================*/

import java.awt.*;  //used for taking color

class random_pattern
{
	int width=80;	//widht of terminal
	int height=24;	//height of terminal
	int rev=2;	//for reverse the ball direction
	int rev2=0;     //for reverse the ball direction again
	int limit=0;    //represent the  top and botton limit of ball
	int up=0;       //represent the upside of ball
	int down=0;	//represent the upside of ball
	int m=1;
	int colup=0;	//used to check collision conditon of ball with wall


	//used for color the ball
	public final String red="\u001B[31m";
	public final String reset="\u001B[0m";
	
        //control the behavior of ball
	void move_ball()
	{	
		//used for repeting the pattern
		while(m!=0)
		{ 	
			rev=2; //reinitializing of variable

		     /*** Creating the pattern  ***/	
			for(int i=1;i<=width*2;i++)
			{	
				try
				{
				  Thread.sleep(20);
				  System.out.print("\033[H\033[2J");  //for clearing screen
				  System.out.flush();
				}
				catch(Exception e)
				{
				}

		
				//managing when ball moves upward 					
				if(limit==0)
				{  up++; colup++; down=0;rev2=0;  }


				//managing when ball moves downward
				if(limit==1)
				{  up=0; down++; colup--;  }

				//moves the ball form left to right 
				if(i<=width-1)
				{	
					  //moves ball downward
					if(limit==0)
					{
						for(int x=1;x<=up;x++)
						 System.out.println("");
		
						limit=0;

						if(colup==height-2)
						limit=1;
					}
					  //moves ball upward
					if(limit==1)
					{	
					  rev2=rev2+1;
		
					  for(int x=1;x<=height-rev2;x++)
					  System.out.println("");
		
					  limit=1;
					  
					  if(rev2==height)
					  limit=0;
					}


					for(int x=1;x<=i;x++)
					  System.out.print(" ");
		
				}
				//moves the ball form right to left
				if(i>=width)	
				{	
					  //moves the ball downward
					if(limit==0)
					{
						for(int x=1;x<=up;x++)
						  System.out.println("");
				
						limit=0;
						if(colup==height-2)
						  limit=1;
					}

					 //moves the ball upward
					if(limit==1)
					{	rev2=rev2+1;
						for(int x=1;x<=height-rev2;x++)
						  System.out.println("");
				
						limit=1;
						if(rev2==height)
						  limit=0;
					}	


					rev=rev+1;
					for(int x=1;x<=width-rev;x++)
					  System.out.print(" ");

			
				}

				//printing ball
				System.out.print(red+"@@"+reset);

				
			}
		}	
	}

	//main method
	public static void main(String args[])
	{
		random_pattern obj=new random_pattern();  //creating object
			obj.move_ball();                 //calling method
		

	}
}

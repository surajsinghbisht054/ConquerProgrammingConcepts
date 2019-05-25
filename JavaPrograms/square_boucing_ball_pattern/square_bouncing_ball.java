/*=============================================================================================
*   Author :    
*
*           Himanshu Sharma
*           himanshusharma2972@gmail.com
*           Github - himanshu-sharma2018
*	********************************************
*                 Bouncing Ball Pattern
*       ********************************************
*
*
*
*   	About:
*		It is a simple pattern program which prints the square shape pattern on screen or 
*		In this program there are '*' shape ball which move in square pattern.  		
*
*
*	Instruction:-
*		run the program with having terminal width & height as below mention
*		width=80
*		height=24
*		
*		otherwise it won't show the desired output 	
*
*=============================================================================================*/

class square_pattern
{
	int width=80;   //width of terminal
	int height=24;  //height of terminal
	int i;		//used for loop 		
	//int f,s,t;
	int nl;         //used for taking new line
	int loop=1;     //used for continuous of printting
	int rev=0;      //used to reverse the ball
	int rwidth=0;    //represent right side width of ball
	int lwidth=0;   //represent left side width of ball

	/*   used for desining pattern    */
	public void design_pattern()
	{      
	   /*   this while loop will repeat the complete  pattern again & again 	*/
		while(loop!=0)
		{    
	              rev=0;rwidth=0;lwidth=0;    //reinitializing of variables 
            	      
		   /* this loop will print the complete pattern once*/	
                      for(i=1;i<=height-3;i++)
			{
				
			    /*   for clearing and holding the screen */	
				try{
					Thread.sleep(50);                   //for holding screen
					System.out.print("\033[H\033[2J");  //for clearing screen
					System.out.flush();

 				   }
				catch(Exception e)
				  {
				  }

				
			     /****** 	printing of first ball	         ********/

				     //this will move '*' downward 	
					if(i<=(height/2)-1)
					{	
					   for(nl=1;nl<i;nl++)
					   System.out.println(" ");
					}
				   //this will move '*' upward	
					if(i>(height/2)-1)
					{	
					   rev=rev+2;

					   for(nl=1;nl<i-rev;nl++)
					   System.out.println(" ");
					}
						
						
					System.out.println();
		
				   // calculating spaces to print before '*'	
					for(int space=1;space<=width/2;space++)
						System.out.print(" ");
		
				  //printing first star 							
					System.out.print("*");



		           /******		printing middle line             *******/

				//this maintain the distance between first '*' and middle line 					
					if(i<=(height/2)-1)
					{   
					   for(nl=i;nl<=(height/2)-2;nl++)
					   System.out.println(" ");
					}

					if(i>(height/2)-1)
					{	
					   for(nl=i;nl>(height/2)-1;nl--)
					   System.out.println(" ");
					}
			
				
				
					System.out.println();

				//this will move the first middle line '*' towards right	
					if(i<=11)	
					{	
					   lwidth=lwidth+3;
					   for(int space=1;space<=lwidth;space++)
					   System.out.print(" ");
					}
				//this will move the first middle line '*' towards left	
					if(i>11)	
					{
		                            lwidth=lwidth-3;

					    if(i==21){lwidth=lwidth-1;}				
					    
					    for(int space=1;space<=lwidth;space++)
					    System.out.print(" ");
					}	

				//printing first middle line '*'	
					System.out.print("*");

				//this will maintain the distance between first and second middle line '*'
					for(int space=1;space<=(width/2)-(lwidth+1);space++)
	 	 	 		   System.out.print(" ");

				//printing second middle line '*'
					System.out.print("*");

				//this will move the third middle line '*' towards left		
					if(i<=11)	
					{	rwidth=rwidth+3;
						for(int space=1;space<=(width/2)-rwidth;space++)
						System.out.print(" ");
					}
				//this will move the third middle line '*' towards right	
					if(i>11)	
					{	rwidth=rwidth-3;
						for(int space=1;space<=(width/2)-rwidth;space++)
						System.out.print(" ");
					}
				
				//printing third middle line star
					System.out.print("*");
					

		          /******		printing last ball    		******/


				   //this will move the '*' towards upward
					if(i<=(height/2)-1)
						{
	 					   for(nl=i;nl<(height/2)-1;nl++)
						   System.out.println(" ");
						}
				  //this will move the '*' towards downward
					if(i>(height/2)-1)
						{	
						   for(nl=i;nl>(height/2)-1;nl--)
						   System.out.println(" ");
						}

					System.out.println();
				//this will calculate no. of spaces before printing '*'
					for(int space=1;space<=width/2;space++)
					   System.out.print(" ");

				//printing last '*'	
					System.out.print("*");
					
			}		
		}
	}

	/*	main method	*/		
	public static void main(String args[])
	{
		square_pattern obj=new square_pattern();  //creating object
		obj.design_pattern();	    //calling method	
		System.out.println();
	}
}

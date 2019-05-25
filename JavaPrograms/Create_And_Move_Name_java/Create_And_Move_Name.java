/*=============================================================================================
*   Author :    
*
*           Himanshu Sharma
*           himanshusharma2972@gmail.com
*           Github - himanshu-sharma2018
*	********************************************
*                  Create Your Name
*   ********************************************
*
*   Instruction.
*		Enter Your name in small letter only for correct output.
*	
*	About:
*		In this Program you have to enter your name then your name will be printed in star form on screen
*		and the name will start moving form left to right and right to left.
*
*=============================================================================================*/

import java.util.Scanner; //for taking input

/*This class will create letters after the first letter is created*/
class Letter
{
	/*creating upper stucture of letter*/
	public void up(int i,int u_left,int u_right,int u_top,int u_bottom,int u_rline,int u_middle,int rextra,int lextra,int exception)
	{	
		int j; //temp varible for looping
		
		if(exception==0)
		{	
			if(u_left==1)
				System.out.print("*");
						
			if(lextra==1 && i==1)
				{
					System.out.print("*");
				}
			else if(lextra==1)
				{
					System.out.print(" ");
				}
											

			for(j=1;j<=3;j++)
			{	
				if(i==u_top || i==u_bottom)
					System.out.print("*");
				else if(u_rline==1)
				{
					if((i==2 && j==3)||(i==3 && j==2)||(i==4 && j==1))
					{
						System.out.print("*");
					}
					else{System.out.print(" ");}
				}
				else if(u_middle==1)
				{
					if((i==2 && j==2)||(i==3 && j==2)||(i==4 && j==2)|| (i==5 && j==2))
					{
						System.out.print("*");
					}
					else{System.out.print(" ");}

				}
				else
					System.out.print(" ");
			}

			if(u_right==1)
			{
				System.out.print("*");
			}
			if(rextra==1 && (i==1 || i==5))
			{
				System.out.print("*");
			}
			else if(rextra==1)
			{
				System.out.print(" ");
			}
		}			
	}

	/*creating down structure of letter*/
	public void down(int i,int d_left,int d_right,int d_bottom,int d_rline,int d_middle,int rextra,int lextra,int exception)
	{
		int j;
		if(exception==0)
		{	
			if(d_left==1)
				System.out.print("*");

			if(lextra==1 && i==4)
			{
				System.out.print("*");
			}
			else if(lextra==1)
			{
				System.out.print(" ");
			}
			for(j=1;j<=3;j++)
			{
				if(i==d_bottom)
					System.out.print("*");
				else if(d_rline==1)
				{
					if((i==1 && j==1)||(i==2 && j==2)||(i==3 && j==3))
					{
						System.out.print("*");
					}
					else{System.out.print(" ");}
				}
				else if(d_middle==1)
				{
					if((i==2 && j==2)||(i==3 && j==2)||(i==4 && j==2)|| (i==1 && j==2))
					{
						System.out.print("*");
					}
					else{System.out.print(" ");}

				}
				else
					System.out.print(" ");
			}
			
			if(d_right==1)
			{
				System.out.print("*");
			}
			if(rextra==1 && i==4 && (d_bottom==4|| d_rline==1))
			{
				System.out.print("*");
			}
			else if(rextra==1)
			{
				System.out.print(" ");
			}
		}				
	}

	/*for printing n*/
	public void n(int i,int j)
	{

		if(i==1){System.out.print("*       *");}
		if(i==2){System.out.print("**      *");}
		if(i==3){System.out.print("* *     *");}
		if(i==4){System.out.print("*  *    *");}
		if(i==5){System.out.print("*   *   *");}
		if(j==1){System.out.print("*    *  *");}
		if(j==2){System.out.print("*     * *");}
		if(j==3){System.out.print("*      **");}
		if(j==4){System.out.print("*       *");}

	}

	/*for printing g*/
	public void g(int i,int j)
	{

		if(i==1){System.out.print("*********");}
		if(i==2){System.out.print("*        ");}
		if(i==3){System.out.print("*        ");}
		if(i==4){System.out.print("*        ");}
		if(i==5){System.out.print("*   *****");}
		if(j==1){System.out.print("*   *   *");}
		if(j==2){System.out.print("*   *   *");}
		if(j==3){System.out.print("*   *   *");}
		if(j==4){System.out.print("*****   *");}

	}

	/*for printing q*/
	public void q(int i,int j)
	{

		if(i==1){System.out.print("*********");}
		if(i==2){System.out.print("**      *");}
		if(i==3){System.out.print("* *     *");}
		if(i==4){System.out.print("*  *    *");}
		if(i==5){System.out.print("*   *   *");}
		if(j==1){System.out.print("*    *  *");}
		if(j==2){System.out.print("*     * *");}
		if(j==3){System.out.print("*      **");}
		if(j==4){System.out.print("*********");}

	}

	/*for printing v*/
	public void v(int i,int j)
	{

		if(i==1){System.out.print("*       *");}
		if(i==2){System.out.print("*       *");}
		if(i==3){System.out.print("*       *");}
		if(i==4){System.out.print("*       *");}
		if(i==5){System.out.print("*       *");}
		if(j==1){System.out.print(" *     * ");}
		if(j==2){System.out.print("  *   *  ");}
		if(j==3){System.out.print("   * *   ");}
		if(j==4){System.out.print("    *    ");}

	}

	/*for printing x*/
	public void x(int i,int j)
	{

		if(i==1){System.out.print("*       *");}
		if(i==2){System.out.print(" *     * ");}
		if(i==3){System.out.print("  *   *  ");}
		if(i==4){System.out.print("   * *   ");}
		if(i==5){System.out.print("    *    ");}
		if(j==1){System.out.print("   * *   ");}
		if(j==2){System.out.print("  *   *  ");}
		if(j==3){System.out.print(" *     * ");}
		if(j==4){System.out.print("*       *");}

	}

	/*for printing z*/
	public void z(int i,int j)
	{

		if(i==1){System.out.print("*********");}
		if(i==2){System.out.print("       * ");}
		if(i==3){System.out.print("      *  ");}
		if(i==4){System.out.print("     *   ");}
		if(i==5){System.out.print("    *    ");}
		if(j==1){System.out.print("   *     ");}
		if(j==2){System.out.print("  *      ");}
		if(j==3){System.out.print(" *       ");}
		if(j==4){System.out.print("*********");}

	}

}

/*Main class*/
class main
{
	public static void main(String args[])
	{	
		Letter obj=new Letter();              //letter class object
		Scanner sc=new Scanner(System.in);    //for taking input
		String name=new String();             //represent user input

		/*********		declaration of variables ***************/

		int u_left=0,u_right=0,u_top=0,u_bottom=0,u_rline=0,u_middle=0;   	 //upper_structure 
		int d_left=0,d_right=0,d_bottom=0,d_rline=0,d_leftline=0,d_middle=0; //lower structure
		int i,j,n,t,lextra=0,rextra=0;		
		int rev=0;
		int exception=0;
		
		///taking input from user
		System.out.println("Enter you first name in small letters:");
		name=sc.nextLine();

			
				
			for(int time=1;time<=75;time++)		//for moving letter on screen
			{	
				if(time>=40){rev=rev+2;}   //used to reverse the moving order
				
				try
				{
					Thread.sleep(70);					//for holding program
					System.out.print("\033[H\033[2J");  //for clearing screen
					System.out.flush();
				}
				catch(Exception e)
				{

				}

				/******		upper structure   ********/
					for(i=1;i<=5;i++)
					{	
						//it moves the letter form left to right
						if(time<=39)
						{
							for(int t2=1;t2<=time;t2++)
							{
								System.out.print(" ");
							}
						}
						//it moves the letter form right to left
						if(time>=40)
						{
							for(int t2=1;t2<=time-rev;t2++)
							{
								System.out.print(" ");
							}
						}

							switch(name.charAt(0))
							{
								case 'a':
									u_right=1;u_left=1;u_top=1;u_bottom=5;u_rline=0;u_middle=0;lextra=0;rextra=0;exception=0;
								break;
								case 'b':
									u_right=1;u_left=1;u_top=1;u_bottom=5;u_rline=0;u_middle=0;lextra=0;rextra=0;exception=0;
								break;
								case 'c':
									u_right=0;u_left=1;u_top=1;u_bottom=0;u_rline=0;u_middle=0;lextra=0;rextra=0;exception=0;
								break;
								case 'd':
									u_right=1;u_left=1;u_top=1;u_bottom=0;u_rline=0;u_middle=0;lextra=0;rextra=0;exception=0;
								break;
								case 'e':
									u_right=0;u_left=1;u_top=1;u_bottom=5;u_rline=0;u_middle=0;lextra=0;rextra=0;exception=0;
								break;
								case 'f':
									u_right=0;u_left=1;u_top=1;u_bottom=5;u_rline=0;u_middle=0;lextra=0;rextra=0;exception=0;
								break;
								case 'g':
									lextra=0;rextra=0;exception=1;obj.g(i,0);
								break;
								case 'h':
									u_right=1;u_left=1;u_top=0;u_bottom=5;u_rline=0;u_middle=0;lextra=0;rextra=0;exception=0;
								break;
								case 'i':
									u_right=0;u_left=0;u_top=1;u_bottom=0;u_rline=0;u_middle=1;lextra=0;rextra=0;exception=0;
								break;
								case 'j':
									u_right=1;u_left=0;u_top=1;u_bottom=0;u_rline=0;u_middle=0;lextra=1;rextra=0;exception=0;
								break;
								case 'k':
									u_right=0;u_left=1;u_top=0;u_bottom=0;u_rline=1;u_middle=0;lextra=0;rextra=0;exception=0;
								break;
								case 'l':
									u_right=0;u_left=1;u_top=0;u_bottom=0;u_rline=0;u_middle=0;lextra=0;rextra=0;exception=0;
								break;
								case 'm':
									u_right=1;u_left=1;u_top=1;u_bottom=0;u_rline=0;u_middle=1;lextra=0;rextra=0;exception=0;
								break;
								case 'n':
									lextra=0;rextra=0;exception=1;obj.n(i,0);
								break;
								case 'o':
									u_right=1;u_left=1;u_top=1;u_bottom=0;u_rline=0;u_middle=0;lextra=0;rextra=0;exception=0;
								break;
								case 'p':
									u_right=1;u_left=1;u_top=1;u_bottom=5;u_rline=0;u_middle=0;lextra=0;rextra=0;exception=0;
								break;
								case 'q':
									lextra=0;rextra=0;exception=1;obj.q(i,0);
								break;
								case 'r':
									u_right=1;u_left=1;u_top=1;u_bottom=5;u_rline=0;u_middle=0;lextra=0;rextra=0;exception=0;
								break;
								case 's':
									u_right=0;u_left=1;u_top=1;u_bottom=5;u_rline=0;u_middle=0;rextra=1;lextra=0;exception=0;
								break;
								case 't':
									u_right=0;u_left=0;u_top=1;u_bottom=0;u_rline=0;u_middle=1;lextra=0;rextra=0;exception=0;
								break;
								case 'u':
									u_right=1;u_left=1;u_top=0;u_bottom=0;u_rline=0;u_middle=0;lextra=0;rextra=0;exception=0;
								break;
								case 'v':
									lextra=0;rextra=0;exception=1;obj.v(i,0);
								break;
								case 'w':
									u_right=1;u_left=1;u_top=0;u_bottom=0;u_rline=0;u_middle=0;lextra=0;rextra=0;exception=0;
								break;
								case 'x':
									lextra=0;rextra=0;exception=1;obj.x(i,0);
								break;
								case 'y':
									u_right=1;u_left=1;u_top=0;u_bottom=5;u_rline=0;u_middle=0;lextra=0;rextra=0;exception=0;
								break;
								case 'z':
									lextra=0;rextra=0;exception=1;obj.z(i,0);
								break;
								
								default: System.out.println("Wrong input");break;


							}

						

						if(exception==0)	
						{ 	
							if(u_left==1)
							System.out.print("*");
							
							if(lextra==1 && i==1)
							{
								System.out.print("*");
							}
							else if(lextra==1)
							{
								System.out.print(" ");
							}
												

							for(j=1;j<=3;j++)
							{	
								if(i==u_top || i==u_bottom)
									System.out.print("*");
								else if(u_rline==1)
								{
									if((i==2 && j==3)||(i==3 && j==2)||(i==4 && j==1))
										{
											System.out.print("*");
										}
										else{System.out.print(" ");}
								}
								else if(u_middle==1)
								{
									if((i==2 && j==2)||(i==3 && j==2)||(i==4 && j==2)|| (i==5 && j==2))
										{
											System.out.print("*");
										}
										else{System.out.print(" ");}

								}
								else
									System.out.print(" ");
							}

							if(u_right==1)
							{
								System.out.print("*");
							}
							if(rextra==1 && (i==1 || i==5))
							{
								System.out.print("*");
							}
							else if(rextra==1)
							{
								System.out.print(" ");
							}
						}	
						/************  used for creating letters more than 2 *****************/
						for(t=2;t<=name.length();t++)
						{	System.out.print("  ");lextra=0;rextra=0;
							switch(name.charAt(t-1))
							{
								case 'a':
									u_right=1;u_left=1;u_top=1;u_bottom=5;u_rline=0;u_middle=0;lextra=0;rextra=0;exception=0;
								break;
								case 'b':
									u_right=1;u_left=1;u_top=1;u_bottom=5;u_rline=0;u_middle=0;lextra=0;rextra=0;exception=0;
								break;
								case 'c':
									u_right=0;u_left=1;u_top=1;u_bottom=0;u_rline=0;u_middle=0;lextra=0;rextra=0;exception=0;
								break;
								case 'd':
									u_right=1;u_left=1;u_top=1;u_bottom=0;u_rline=0;u_middle=0;lextra=0;rextra=0;exception=0;
								break;
								case 'e':
									u_right=0;u_left=1;u_top=1;u_bottom=5;u_rline=0;u_middle=0;lextra=0;rextra=0;exception=0;
								break;
								case 'f':
									u_right=0;u_left=1;u_top=1;u_bottom=5;u_rline=0;u_middle=0;lextra=0;rextra=0;exception=0;
								break;
								case 'g':
									lextra=0;rextra=0;exception=1;obj.g(i,0);
								break;
								case 'h':
									u_right=1;u_left=1;u_top=0;u_bottom=5;u_rline=0;u_middle=0;lextra=0;rextra=0;exception=0;
								break;
								case 'i':
									u_right=0;u_left=0;u_top=1;u_bottom=0;u_rline=0;u_middle=1;lextra=0;rextra=0;exception=0;
								break;
								case 'j':
									u_right=1;u_left=0;u_top=1;u_bottom=0;u_rline=0;u_middle=0;lextra=1;rextra=0;exception=0;
								break;
								case 'k':
									u_right=0;u_left=1;u_top=0;u_bottom=0;u_rline=1;u_middle=0;lextra=0;rextra=0;exception=0;
								break;
								case 'l':
									u_right=0;u_left=1;u_top=0;u_bottom=0;u_rline=0;u_middle=0;lextra=0;rextra=0;exception=0;
								break;
								case 'm':
									u_right=1;u_left=1;u_top=1;u_bottom=0;u_rline=0;u_middle=1;lextra=0;rextra=0;exception=0;
								break;
								case 'n':
									lextra=0;rextra=0;exception=1;obj.n(i,0);
								break;
								case 'o':
									u_right=1;u_left=1;u_top=1;u_bottom=0;u_rline=0;u_middle=0;lextra=0;rextra=0;exception=0;
								break;
								case 'p':
									u_right=1;u_left=1;u_top=1;u_bottom=5;u_rline=0;u_middle=0;lextra=0;rextra=0;exception=0;
								break;
								case 'q':
									lextra=0;rextra=0;exception=1;obj.q(i,0);
								break;
								case 'r':
									u_right=1;u_left=1;u_top=1;u_bottom=5;u_rline=0;u_middle=0;lextra=0;rextra=0;exception=0;
								break;
								case 's':
									u_right=0;u_left=1;u_top=1;u_bottom=5;u_rline=0;u_middle=0;rextra=1;lextra=0;exception=0;
								break;
								case 't':
									u_right=0;u_left=0;u_top=1;u_bottom=0;u_rline=0;u_middle=1;lextra=0;rextra=0;exception=0;
								break;
								case 'u':
									u_right=1;u_left=1;u_top=0;u_bottom=0;u_rline=0;u_middle=0;lextra=0;rextra=0;exception=0;
								break;
								case 'v':
									lextra=0;rextra=0;exception=1;obj.v(i,0);
								break;
								case 'w':
									u_right=1;u_left=1;u_top=0;u_bottom=0;u_rline=0;u_middle=0;lextra=0;rextra=0;exception=0;
								break;
								case 'x':
									lextra=0;rextra=0;exception=1;obj.x(i,0);
								break;
								case 'y':
									u_right=1;u_left=1;u_top=0;u_bottom=5;u_rline=0;u_middle=0;lextra=0;rextra=0;exception=0;
								break;
								case 'z':
									lextra=0;rextra=0;exception=1;obj.z(i,0);
								break;
								
								default: System.out.println("Wrong input");break;

							}
							/*  used to create letter if letter are more than 1*/
							obj.up(i,u_left,u_right,u_top,u_bottom,u_rline,u_middle,rextra,lextra,exception);
						}
							System.out.println();

					}

				/****** creating down structure of letter **************/
				
				lextra=0;rextra=0;exception=0;
				
				for(i=1;i<=4;i++)
				{	
					//for moving letter form left to right
					if(time<=39)
					{
						for(int t2=1;t2<=time;t2++)
						{
							System.out.print(" ");
						}
					}
					//for moving letter from right to left
					if(time>=40)
					{				
						for(int t2=1;t2<=time-rev;t2++)
						{
							System.out.print(" ");
						}
					}

						switch(name.charAt(0))
						{
							case 'a':
								d_right=1;d_left=1;d_bottom=0;d_rline=0;d_middle=0;lextra=0;rextra=0;exception=0;
							break;
							case 'b':
								d_right=1;d_left=1;d_bottom=4;d_rline=0;d_middle=0;lextra=0;rextra=0;exception=0;
							break;
							case 'c':
								d_right=0;d_left=1;d_bottom=4;d_rline=0;d_middle=0;lextra=0;rextra=0;exception=0;
							break;
							case 'd':
								d_right=1;d_left=1;d_bottom=4;d_rline=0;d_middle=0;lextra=0;rextra=0;exception=0;
							break;
							case 'e':
								d_right=0;d_left=1;d_bottom=4;d_rline=0;d_middle=0;lextra=0;rextra=0;exception=0;
							break;
							case 'f':
								d_right=0;d_left=1;d_bottom=0;d_rline=0;d_middle=0;lextra=0;rextra=0;exception=0;
							break;
							case 'g':
								exception=1;rextra=0;lextra=0;obj.g(0,i);
							break;
							case 'h':
								d_right=1;d_left=1;d_bottom=0;d_rline=0;d_middle=0;lextra=0;rextra=0;exception=0;
							break;
							case 'i':
								d_right=0;d_left=0;d_bottom=4;d_rline=0;d_middle=1;lextra=0;rextra=0;exception=0;
							break;
							case 'j':
								d_right=1;d_left=1;d_bottom=4;d_rline=0;d_middle=0;lextra=0;rextra=0;exception=0;
							break;
							case 'k':
								d_right=0;d_left=1;d_bottom=0;d_rline=1;d_middle=0;lextra=0;rextra=0;exception=0;
							break;
							case 'l':
								d_right=0;d_left=1;d_bottom=4;d_rline=0;d_middle=0;lextra=0;rextra=0;exception=0;
							break;
							case 'm':
								d_right=1;d_left=1;d_bottom=0;d_rline=0;d_middle=0;lextra=0;rextra=0;exception=0;
							break;
							case 'n':
								exception=1;rextra=0;lextra=0;obj.n(0,i);
							break;
							case 'o':
								d_right=1;d_left=1;d_bottom=4;d_rline=0;d_middle=0;lextra=0;rextra=0;exception=0;
							break;
							case 'p':
								d_right=0;d_left=1;d_bottom=0;d_rline=0;d_middle=0;rextra=1;lextra=0;exception=0;
							break;
							case 'q':
								exception=1;rextra=0;lextra=0;obj.q(0,i);
							break;
							case 'r':
								d_right=0;d_left=1;d_bottom=0;d_rline=1;d_middle=0;rextra=1;lextra=0;exception=0;
							break;
							case 's':
								d_right=1;d_left=0;d_bottom=4;d_rline=0;d_middle=0;lextra=1;rextra=0;exception=0;
							break;
							case 't':
								d_right=0;d_left=0;d_bottom=0;d_rline=0;d_middle=1;lextra=0;rextra=0;exception=0;
							break;
							case 'u':
								d_right=1;d_left=1;d_bottom=4;d_rline=0;d_middle=0;lextra=0;rextra=0;exception=0;
							break;
							case 'v':
								exception=1;rextra=0;lextra=0;obj.v(0,i);
							break;
							case 'w':
								d_right=1;d_left=1;d_bottom=4;d_rline=0;d_middle=1;lextra=0;rextra=0;exception=0;
							break;
							case 'x':
								exception=1;rextra=0;lextra=0;obj.x(0,i);
							break;
							case 'y':
								d_right=1;d_left=0;d_bottom=0;d_rline=0;d_middle=0;lextra=0;rextra=0;exception=0;
							break;
							case 'z':
								exception=1;rextra=0;lextra=0;obj.z(0,i);
							break;
							
							default: System.out.println("Wrong input");break;


						}
					
										
					if(exception==0)
					{
						if(d_left==1)
						System.out.print("*");

						if(lextra==1 && i==4)
						{
							System.out.print("*");
						}
						else if(lextra==1)
						{
							System.out.print(" ");
						}

						for(j=1;j<=3;j++)
						{
							if(i==d_bottom)
								System.out.print("*");
							else if(d_rline==1)
							{
								if((i==1 && j==1)||(i==2 && j==2)||(i==3 && j==3))
									{
										System.out.print("*");
									}
									else{System.out.print(" ");}
							}
							else if(d_middle==1)
							{
								if((i==2 && j==2)||(i==3 && j==2)||(i==4 && j==2)||(i==1 && j==2))
									{
										System.out.print("*");
									}
									else{System.out.print(" ");}

							}
							else
								System.out.print(" ");
						}

						if(d_right==1)
						{
							System.out.print("*");
						}
						if(rextra==1 && i==4 && (d_bottom==4|| d_rline==1))
							{
								System.out.print("*");
							}
						else if(rextra==1)
						{
							System.out.print(" ");
						}
					}
						
						///used for creating more than one letter
						for(t=2;t<=name.length();t++)
						{	System.out.print("  ");lextra=0;rextra=0;
							switch(name.charAt(t-1))
							{
							case 'a':
								d_right=1;d_left=1;d_bottom=0;d_rline=0;d_middle=0;lextra=0;rextra=0;exception=0;
							break;
							case 'b':
								d_right=1;d_left=1;d_bottom=4;d_rline=0;d_middle=0;lextra=0;rextra=0;exception=0;
							break;
							case 'c':
								d_right=0;d_left=1;d_bottom=4;d_rline=0;d_middle=0;lextra=0;rextra=0;exception=0;
							break;
							case 'd':
								d_right=1;d_left=1;d_bottom=4;d_rline=0;d_middle=0;lextra=0;rextra=0;exception=0;
							break;
							case 'e':
								d_right=0;d_left=1;d_bottom=4;d_rline=0;d_middle=0;lextra=0;rextra=0;exception=0;
							break;
							case 'f':
								d_right=0;d_left=1;d_bottom=0;d_rline=0;d_middle=0;lextra=0;rextra=0;exception=0;
							break;
							case 'g':
								exception=1;rextra=0;lextra=0;obj.g(0,i);
							break;
							case 'h':
								d_right=1;d_left=1;d_bottom=0;d_rline=0;d_middle=0;lextra=0;rextra=0;exception=0;
							break;
							case 'i':
								d_right=0;d_left=0;d_bottom=4;d_rline=0;d_middle=1;lextra=0;rextra=0;exception=0;
							break;
							case 'j':
								d_right=1;d_left=1;d_bottom=4;d_rline=0;d_middle=0;lextra=0;rextra=0;exception=0;
							break;
							case 'k':
								d_right=0;d_left=1;d_bottom=0;d_rline=1;d_middle=0;lextra=0;rextra=0;exception=0;
							break;
							case 'l':
								d_right=0;d_left=1;d_bottom=4;d_rline=0;d_middle=0;lextra=0;rextra=0;exception=0;
							break;
							case 'm':
								d_right=1;d_left=1;d_bottom=0;d_rline=0;d_middle=0;lextra=0;rextra=0;exception=0;
							break;
							case 'n':
								exception=1;rextra=0;lextra=0;obj.n(0,i);
							break;
							case 'o':
								d_right=1;d_left=1;d_bottom=4;d_rline=0;d_middle=0;lextra=0;rextra=0;exception=0;
							break;
							case 'p':
								d_right=0;d_left=1;d_bottom=0;d_rline=0;d_middle=0;rextra=1;lextra=0;exception=0;
							break;
							case 'q':
								exception=1;rextra=0;lextra=0;obj.q(0,i);
							break;
							case 'r':
								d_right=0;d_left=1;d_bottom=0;d_rline=1;d_middle=0;rextra=1;lextra=0;exception=0;
							break;
							case 's':
								d_right=1;d_left=0;d_bottom=4;d_rline=0;d_middle=0;lextra=1;rextra=0;exception=0;
							break;
							case 't':
								d_right=0;d_left=0;d_bottom=0;d_rline=0;d_middle=1;lextra=0;rextra=0;exception=0;
							break;
							case 'u':
								d_right=1;d_left=1;d_bottom=4;d_rline=0;d_middle=0;lextra=0;rextra=0;exception=0;
							break;
							case 'v':
								exception=1;rextra=0;lextra=0;obj.v(0,i);
							break;
							case 'w':
								d_right=1;d_left=1;d_bottom=4;d_rline=0;d_middle=1;lextra=0;rextra=0;exception=0;
							break;
							case 'x':
								exception=1;rextra=0;lextra=0;obj.x(0,i);
							break;
							case 'y':
								d_right=1;d_left=0;d_bottom=0;d_rline=0;d_middle=0;lextra=0;rextra=0;exception=0;
							break;
							case 'z':
								exception=1;rextra=0;lextra=0;obj.z(0,i);
							break;
							
							default: System.out.println("Wrong input");break;

							}

							//calling method for creating down structure
							obj.down(i,d_left,d_right,d_bottom,d_rline,d_middle,rextra,lextra,exception);
						}
						System.out.println();

					
				}

			}	
				
	}
}
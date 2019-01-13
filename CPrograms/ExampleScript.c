/*
Author		: Suraj Singh Bisht
Email 		: surajsinghbisht054@gmail.com
Description	: Trying To Write, Tic Tac Toe Game In Minimum Lines

Compile Command : gcc ExampleScript.c -o a.out && ./a.out 

*/

// Include modules
#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>

#define PLAYERFIRST 'X'
#define PLAYERSECOND 'O'

// array to keep remember
char s[9] = {'.','.','.','.','.','.','.','.','.'};
int turn=0;

// 0 1 2
// 3 4 5
// 6 7 8


// game status
int status(char p){
	// complete rail of conditions
	if ((s[0]==s[1] && s[1]==s[2] && s[0]==p)||(s[3]==s[4] && s[4]==s[5] &&\
		s[5]==p)||(s[6]==s[7] && s[7]==s[8] && s[8]==p)||(s[0]==s[3] && \
		s[3]==s[6] && s[6]==p)||(s[1]==s[4] && s[4]==s[7] && s[7]==p)||(s[2]==s[5]\
		&& s[5]==s[8] && s[8]==p)||(s[0]==s[4] && s[4]==s[8] && s[8]==p)||(s[6]==s[4]\
		&& s[4]==s[2] && s[2]==p)){
		return 1;
	}else{
	return 0;
	}


}

// display board function
void displayboard(void){
	// clear display
	system("clear");
	// print board
	printf("\n\n %c | %c | %c ---->   0 | 1 | 2 \n-------------\n %c | %c | %c ---->   3 | 4 | 5 \n-------------\n %c | %c | %c ---->   6 | 7 | 8  \n\n\n", s[0],s[1],s[2],s[3],s[4],s[5],s[6],s[7],s[8]);
}

// check array input
int checkinput(int i){
	if (i<9){
		if(s[i]=='.'){
			return 1;}
		return 0;
	};return 0;
}


// Players Turn
int player(char p){
	int ret=0;
	// show display
	displayboard();
	// Input value space
	int i;
	// print about player
	printf("[+] Player [%c] This is Your Turn\n[+] Now Insert Your New Mark Index Number : ", p);
	do{
		// scan variable
		scanf("%d", &i);
	}while( !isdigit(i) && !checkinput(i) );
	// Insert mark
	s[i]=p;
	turn += 1;
	displayboard();
	if(turn==9){
		printf("[-] Game Tie.\n");
		status(p);
		exit(0);
	}
	if(status(p)){
		printf("!!Winner!!, Player [%c] is winner.\n", p); 
		exit(0);
	};
        // print va variable
        printf("[+] Player [%c], Your Index Accepted : %d , Turn No. %d",p, i, turn);
	// return value
	return ret;
};

// Trigger
int main(){
	// Display Status
	displayboard();
	// while loop
	while(1){
		// first player turn
		if(player(PLAYERFIRST)){
			break;
		};
		// second player turn
		if(player(PLAYERSECOND)){
			break;	
		};
	};
};

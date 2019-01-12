/****************************************************************
* Tic_Tic_Toe_Game.cpp
* Author: Arvind Sharma
* Contact: SlowestWind@gmail.com
* Discription : This is the simple Tic Tac Toe game in c++
*                for learning purpose.
* Note : system information while devoloping
*        processor : Intel® Pentium(R) CPU N3710 @ 1.60GHz × 4
*        OS type : 64 bit.
*        OS : ubantu 16.04
*
*****************************************************************/

// Include header file
#include <iostream>
#include <stdlib.h>
#include <math.h>
#include <stdio.h>
#include <unistd.h>

using namespace std;

// Global variable uses this program.
char seedTable[10]={0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
int itr1=0; //for for loop
int position;
char mark;
int i;

// Game Plate for the game.
void GamePlate(){
        printf("\n\
    __%d__|__%d__|__%d__\n\
    __%d__|__%d__|__%d__\n\
    __%d__|__%d__|__%d__\n\
         |      |      \n", seedTable[1], seedTable[2], seedTable[3],
         seedTable[4], seedTable[5], seedTable[6], seedTable[7],
          seedTable[8], seedTable[9]);

}

// This function update the Player position and mark
int updateSheet(int pos, char marks, int player){
    system("clear");

     This is for testing purpose
    cout<<"pos "<<pos<<" marks "<<marks<<endl;
    seedTable[pos]=marks;
    cout<<"seedTable in function: "<<seedTable[pos];

    if( pos == 1 && seedTable[1]==1){
        seedTable[1]=marks;
        return player;
    }else if(pos == 2 && seedTable[2]== 2){
        seedTable[2]=marks;
        return player;
    }else if(pos == 3 && seedTable[3]==3){
        seedTable[3]=marks;
        return player;
    }else if(pos == 4 && seedTable[4]==4){
        seedTable[4]=marks;
        return player;
    }else if(pos == 5 && seedTable[5]==5){
        seedTable[5]=marks;
        return player;
    }else if(pos == 6 && seedTable[6]==6){
        seedTable[6]=marks;
        return player;
    }else if(pos == 7 && seedTable[7]==7){
        seedTable[7]=marks;
        return player;
    }else if(pos == 8 && seedTable[8]==8){
        seedTable[8]=marks;
        return player;
    }else if(pos == 9 && seedTable[9]==9){
        seedTable[9]=marks;
        return player;
    }else{

        cout<<"Invalid Selection!!"<<endl;
        player--;
        cout<<"Player in fucntion "<<player;
        return player;
        }
    GamePlate();   // calling the gamePlate function to show the outut on the screen.
}


// This function purform Wi9nner finder operation.
int GameWin(){

    // Check alternative option of winer combination for the position.
    if(seedTable[1] == seedTable[2] && seedTable[2] == seedTable[3]){
        return 1;
    }else if(seedTable[4] == seedTable[5] && seedTable[5] == seedTable[6]){
        return 1;
    }else if(seedTable[7] == seedTable[8] && seedTable[8] == seedTable[9]){
        return 1;
    }else if(seedTable[1] == seedTable[4] && seedTable[4] == seedTable[7]){
        return 1;
    }else if(seedTable[2] == seedTable[5] && seedTable[5] == seedTable[8]){
        return 1;
    }else if(seedTable[3] == seedTable[6] && seedTable[6] == seedTable[9]){
        return 1;
    }else if(seedTable[7] == seedTable[5] && seedTable[5] == seedTable[3]){
        return 1;
    }else if(seedTable[1] == seedTable[5] && seedTable[5] == seedTable[9]){
        return 1;
    }else if(seedTable[1]!=1 && seedTable[2]!=2 && seedTable[1]!=3
            && seedTable[2]!=4 && seedTable[5]!=5 && seedTable[6]!=6
            && seedTable[7]!=7 && seedTable[8]!=8 && seedTable[9]!=9){
                return 0;
    }else{
        return -1;
    }
}


int main()
{
    //declare variable for the player
    int player=1;

    // This is Welcome and Introduction poster.
    cout<<"\n\
    ********************************\n\
    *                              *\n\
    *        Tik Toc Toe Game      *\n\
    *                              *\n\
    ********************************\n\
    * Player1->(0) || Player2->(X) *\n\
    *******************************\n"<<endl;
    GamePlate();
    //usleep(1000000);
    //system("clear");
    do{
        player=(player%2==0)?2:1; // Player selection

        mark=(player==1)?'0':'X'; // selected Player mark .

        //cout<<player<<endl;  // for the checking position.
        //cout<<mark<<endl;

        cout<<"---[Player "<<player<<" ]"<<endl;
        cout<<"Enter Your Position->";
        cin>>position;

        // Update the Sheet
        cout<<"Player in Loop 0---> "<<player<<endl;
        player = updateSheet(position, mark, player);
        player++; // next player  chance...
        cout<<"Player in Loop "<<player<<endl;
        cout<<"Player value: after position"<<player<<endl;

        i=GameWin(); // check the winner flag

    }while(i==-1);

    // declaring the winner.
    if(i==1){
        cout<<"player in result: "<<player<<endl;
        player=(player%2==0)?1:2;
        cout<<"Player "<<player<<" Win :)"<<endl;
    }else{
        cout<<"Draw"<<endl;
    }

    return 0;
}


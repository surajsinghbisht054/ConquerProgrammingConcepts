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

/*----------------------------------------
include header file
----------------------------------------*/
#include <iostream>
#include <stdlib.h>
#include <unistd.h>
#include <stdio.h>

using namespace std;

/*----------------------------------------
global variables
----------------------------------------*/
int table[10]={'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
int itr; // used to move loop
int position; // used to store user selected position on table
int flag; //to obatain function return value
char mark;

/*----------------------------------------
game status display
----------------------------------------*/
void displayTable(){
    printf("\n\
    __%c__|__%c__|__%c__\n\
    __%c__|__%c__|__%c__\n\
    __%c__|__%c__|__%c__\n\
         |     |      \n", table[1], table[2], table[3], table[4], table[5], table[6], table[7], table[8], table[9]);

}

    /*----------------------------------------
    update mark on the screen using player
    selected position...
----------------------------------------*/
int updateTable(int pos, char mark, int player){

    system("clear");

    /*----------------------------------------
    Here we check the pos and then mark the position
    ----------------------------------------*/
    if(pos == 1 && table[1] == '1'){
        table[pos]=mark;
        displayTable();
        return player;
    }else if(pos == 2 && table[2] == '2'){
        table[pos]=mark;
        displayTable();
        return player;
    }else if(pos == 3 && table[3] == '3'){
        table[pos]=mark;
        displayTable();
        return player;
    }else if(pos == 4 && table[4] == '4'){
        table[pos]=mark;
        displayTable();
        return player;
    }else if(pos == 5 && table[5] == '5'){
        table[pos]=mark;
        displayTable();
        return player;
    }else if(pos == 6 && table[6] == '6'){
        table[pos]=mark;
        displayTable();
        return player;
    }else if(pos == 7 && table[7] == '7'){
        table[pos]=mark;
        displayTable();
        return player;
    }else if(pos == 8 && table[8] == '8'){
        table[pos]=mark;
        displayTable();
        return player;
    }else if(pos == 9 && table[9] == '9'){
        table[pos]=mark;
        displayTable();
        return player;
    }else{
      	cout<<"Please Enter Valid Position"<<endl;
       player--;
       displayTable();
       return player;
     }

}

    /*----------------------------------------
    game winner function
    ----------------------------------------*/
int gameWinner(){
    if(table[1]==table[2] && table[2]==table[3]){
        return 1;
    }else if(table[4]==table[5] && table[5]==table[6]){
        return 1;
    }else if(table[7]==table[8] && table[8]==table[9]){
        return 1;
    }else if(table[1]==table[4] && table[4]==table[7]){
        return 1;
    }else if(table[2]==table[5] && table[5]==table[8]){
        return 1;
    }else if(table[3]==table[6] && table[6]==table[9]){
        return 1;
    }else if(table[7]==table[5] && table[5]==table[3]){
        return 1;
    }else if(table[9]==table[5] && table[5]==table[1]){
        return 1;
    }else if(table[1]!='1' && table[2]!='2' && table[3]!='3' && table[4]!='4' && table[5]!='5' && table[6]!='6'
    && table[7]!='7' && table[8]!='8' && table[9]!='9'){
            return 0; // if the element are not fulfulled then it will return 0 and loop will continue
    }else{
            return -1; // it will make exit from the loop
        }


}



int main(){
    /*----------------------------------------
     game into.. panel
    ----------------------------------------*/
    int player=1;

    cout<<"\n\
    ********************************\n\
    *                              *\n\
    *        Tik Toc Toe Game      *\n\
    *                              *\n\
    ********************************\n\
    * Player1->(0) || Player2->(X) *\n\
    *******************************\n"<<endl;
    displayTable();
    usleep(1000000);

    do{
        player=(player%2==0)?2:1; //set player 1 as default

        mark=(player==1)?'0':'X'; // set player 1 mark as default

    /*----------------------------------------
     Obatain user position
    ----------------------------------------*/
         cout<<"Player "<<player<<" Position :"<<endl;
         cin>>position;
         player=updateTable(position, mark, player);

         flag=gameWinner();

        player++;
    }while(flag==-1);

    if(flag==1){
        cout<<"Congratulation :)"<<endl;
        player=(player%2==0)?1:2;
        cout<<"++++[Player "<<player<<" is winner]++++"<<endl;
    }else{
        cout<<"Match Draw :("<<endl;
    }

    return 0;
}

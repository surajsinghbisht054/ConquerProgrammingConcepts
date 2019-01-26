/*
 * Author :
 *  		Arvind Sharma
 *
 *
 * Help source:
 * 		Suraj Singh Bisht
 * 		surajsinghbisht054@gmail.com
 *
 * Description:
 * 		This is Only A Tutorial Project Script Noting That Much Important.
 * 		Crated for Newbie Practise.
 * 		Internal Functionality JavaScript.
 *
 *
 * */


// Array To Store Tic Tac Toe Data
var tab = new Array(9);

// Keep Record Players Turn
var count=1;

// keep record winner status
var win = -1;

//
// this function used to declare winner
//

function winner(Player){
	// first row winning combo...
	if(tab[0]==tab[1] && tab[1]==tab[2] && tab[1]!='-'){
		alert("Player "+Player+" win");
		win=1;
	}

	// second row winning combo
	if(tab[3]==tab[4] && tab[4]==tab[5] && tab[3]!='-'){
		alert("Player "+Player+" win");
		win=1;
	}

	//third row winning combo
	if(tab[6]==tab[7] && tab[7]==tab[8] && tab[6]!='-'){
		alert("Player "+Player+" win");
		win=1;
	}

	// first column winning combo
	if(tab[0]==tab[3] && tab[3]==tab[6] && tab[0]!='-'){
		alert("Player "+Player+" win");
		win=1;
	}

	// second column winning combo
	if(tab[1]==tab[4] && tab[4]==tab[7] && tab[1]!='-'){
		alert("Player "+Player+" win");
		win=1;
	}

	// third colummn winning combo
	if(tab[2]==tab[5] && tab[5]==tab[8] && tab[2]!='-'){
		alert("Player "+Player+" win");
		win=1;
	}

	// checking diagonal winner
	if(tab[0]==tab[4] && tab[4]==tab[8] && tab[0]!='-'){
		alert("Player "+Player+" win");
		win=1;
	}
	if(tab[2]==tab[4] && tab[4]==tab[6] && tab[2]!='-'){
		alert("Player "+Player+" win");
		win=1;
	}

		// check status of array is full or not?
		var i=0;
		for(i=0; i<tab.length; i++){
			if(tab[i]=='-')
			break;  // break if the array is not full
		}

	// Draw match declare
	if(i==9 && win==0){
		alert("Match Draw");
	}
}


//
// Game initializer function
//
function initialize(){
	for(var i=0; i<tab.length; i++){
		tab[i] = '-';
	}
  win=0;
	$("button").text('-');
}

//
// It work as a main function for this JavaScript
//
$(document).ready(function(){

	// calling initalize function
	initialize();

	//
	// onClick on Game button this function called...
	//
	//
	$(document).on('click','.push',function(event){

		// Access Current Click object
		var obj = event.currentTarget;
		// Acess Current clicked position
		var clicked = event.currentTarget.value;
		console.log(clicked);

		// Player First Turn
		if(count%2==0){
			// Team Member is newbie, that's why neededs console output
			console.log("even");
			obj.innerText = "X";

			// updating to table
			tab[clicked-1]='X';
			var player='X';

		// Second Player Turn
		}else{

			console.log("odd");
			obj.innerText = "0";

			//updating the table
			tab[clicked-1]='0';
			var player = '0';
		}

		//calling winner funtion to check winner
		winner(player);

		// player turn complete
		count++
	});

});

$('#reset').click(function(){
	initialize();
});


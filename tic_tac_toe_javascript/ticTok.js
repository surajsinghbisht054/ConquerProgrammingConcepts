/*
 * Author : 
 *  		Arvind Sharma
 *
 *
 * Editing:
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

//
// using jquery <--- Because author added file.
// function to add Listener
//
$(document).on('click','#push',function(event){

	// Access Current Click object
	var obj = event.currentTarget;

	// Player First Turn
	if(count%2==0){
		// Team Member is newbie, that's why neededs console output
		console.log("even");
		obj.innerText = "X";
	               	
		
	// Second Player Turn
	}else{
		
		console.log("odd");
		obj.innerText = "0";
	}
	count++
});

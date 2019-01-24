var tab = new Array(9);
var count=1;

document.getElementById('push').addEventListener('click',function(){
	//tab[count]=1;
	//count++;
	//console.log(tab[count]);
	//document.getElementById('push').innerHTML="X";
	if(count%2==0){
		console.log("even");
		document.getElementById('push').innerHTML='X';
		document.getElementById('push').style.background="red";
	}else{
		document.getElementById('push').innerHTML='0';
		document.getElementById('push').style.background="yellow";
		console.log("odd");
	}
	count++
});

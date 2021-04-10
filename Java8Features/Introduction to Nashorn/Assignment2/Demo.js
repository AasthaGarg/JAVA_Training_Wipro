var isPrime=function(num){
if(num==2){
return true;}
for(var i=2;i<num;i++){
if(num%i==0){
return false;}
}
return true;
}
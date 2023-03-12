function doSomething(ii)
{
if(ii>50) return true;
else return false;
}
var x=[10,20,30,40,50,60,70,80,90,100];
var y=x.filter(doSomething);
console.log(y)
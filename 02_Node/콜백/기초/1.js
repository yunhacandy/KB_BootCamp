function repeat(n,f){
    for(var i=0;i<n;i++){
        f(i);
    }
}

var logAll = function(i){
    console.log(i);
};
repeat(5,logAll);
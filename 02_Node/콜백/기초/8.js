function repeat(n,f){
    for(var i=0;i<n;i++){
        f(i);
    }
}

var logStar = function(i){
    console.log('*'.repeat(i+1));
};
repeat(4,logStar);
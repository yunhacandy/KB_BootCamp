function repeat(n,f){
    for(var i=0;i<n;i++){
        f(i);
    }
}

var logOdd = function(i){
    if (i % 2 === 1) {
        console.log(i);
    }
};
repeat(10,logOdd);
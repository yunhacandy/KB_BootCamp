function repeat(n,f){
    for(var i=0;i<n;i++){
        f(i);
    }
}

var logEven = function(i){
    if (i % 2 === 0) {
        console.log(i);
    }
};
repeat(10,logEven);
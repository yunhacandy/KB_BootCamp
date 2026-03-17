function repeat(n,f){
    for(var i=0;i<n;i++){
        f(i);
    }
}

var logIndex = function(i){
    console.log("index: " + i);
};
repeat(3,logIndex);
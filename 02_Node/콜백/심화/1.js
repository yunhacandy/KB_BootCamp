function filterLog(arr, callback){
    for(let i = 0; i < arr.length; i++){
        if(callback(arr[i])){
            console.log(arr[i]);
        }
    }
}

filterLog([1,2,3,4,5], function(x){
    return x % 2 === 0;
});
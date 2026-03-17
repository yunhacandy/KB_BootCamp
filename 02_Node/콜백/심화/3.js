function myForEach(arr, callback){
    for(let i = 0; i<arr.length; i++){
        callback(arr[i], i);
    }
}

myForEach(["a","b","c"], function(item,index){  //순서 주의
    console.log(index,item);
})
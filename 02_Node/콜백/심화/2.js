function myMap(arr, callback){
    const map = [];
    for(let i = 0; i < arr.length; i++){
        map.push(callback(arr[i]));
    }
    return map;
}

const result = myMap([1,2,3], function(x){
    return x * 2;
});

console.log(result); // [2,4,6]
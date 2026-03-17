function checkNumber(num, onSuccess, onFail){
    //10보다 크면 성공 콜백 실행
    if(num>10){
        return onSuccess();
    }
    else{
        return onFail();
    }
}

checkNumber(
    15,
    function(){
        console.log("성공");
    },
    function(){
        console.log("실패");
    }
);
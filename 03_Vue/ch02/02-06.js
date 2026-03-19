function foodReport(name, age, ...favoriteFoods) {  //가변 파라미터
    //... 삭제 시 첫번째 음식만 출력, ... 붙이면 배열로 출력
    console.log(name + ", " + age);
    console.log(favoriteFoods);
}

foodReport("이몽룡", 20, "짜장면", "냉면", "불고기");
foodReport("홍길동", 16, "초밥");
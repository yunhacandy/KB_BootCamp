<script>
    export default {
        data() {
            return {
                username: " "
            }
        },methods:{
            fetchUser(){
                //사용자 이름 설정 this.fetchUser() 호출 위치 fetchUser
                this.username = "박윤하";
                console.log("데이터 로딩 완료");
            }
        },
        //created(): 데이터 초기화 시점
        //API 호출
        created() {
            console.log("컴포넌트 생성됨");
            this.fetchUser();
        },
        //mounted(): DOM 요소 접근 시점
        //chart, DOM 제어
        mounted() {
            console.log("DOM 렌더링 완료");
        }
    }    
</script>
<template>
    <div>
        <h2>사용자 정보</h2>
        <p>{{ username }}</p>
    </div>
</template>
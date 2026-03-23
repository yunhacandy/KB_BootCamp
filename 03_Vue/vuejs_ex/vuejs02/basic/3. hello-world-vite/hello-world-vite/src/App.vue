<template>
    <div id = "date">
        <p>현재 날짜: {{ date }}</p>
    </div>
    <div id = "date2">
        <p>현재 날짜: {{ date2 }}</p>
    </div>
</template>

<script>
export default {
    setup() {   //사용할 수 있는 변수나 함수를 정의하는 곳
        const date = Date().toString();
        return{
            date,
        }
    },
    data() {
        return {
            date2 : Date().toString(),
        };
    },
};
</script>

<template>
    <div>
        <h2>박스 너비 측정</h2>
        <div ref="box" style="width: 200px; height: 100px; background: skyblue;"></div>

        <p>created 결과: {{ createdWidth }}</p>
        <p>mounted 결과: {{ mountedWidth }}</p>
    </div>
</template>

<script>
export default {
    data() {
        return {
            createdWidth: 0,
            mountedWidth: 0
        };
    },
    created() {
    // TODO: box width 측정 시도
        console.log("created: ", this.$refs.box);
        this.createdWidth = this.$refs.box ? this.$refs.box.offsetWidth : 0;
    },
    //created 단계에서는 아직 DOM 요소가 생성되지 않았기 때문에 this.$refs.box는 undefined입니다. 따라서 createdWidth는 0으로 설정됩니다.
	    //mounted 단계에서는 DOM 요소가 생성되고 참조가 설정되므로 this.$refs.box.offsetWidth를 통해 실제 너비를 측정할 수 있습니다.
	    //mounted 된 이후에 조작 가능
	mounted() {
	    const box = this.$refs.box;
	    console.log("mounted: ", box);
	    this.mountedWidth = box ? box.offsetWidth : 0;
	}
};
</script>

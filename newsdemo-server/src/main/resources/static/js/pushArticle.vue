<template>
<form>
	<input type='text' v-model='title'/>
	<input type='text' v-model='content'/>
	<button @click='function()'>Submit</button>
</form>
</template>
<script>
	var pushArticlesApi = new Vue.resource('/article/push')({
	el: '#pushArticles',
	data:{
title:'',
content:''
	},
	methods:{
		created: function(){
		pushArticlesApi.save({title:this.title,content:this.content});
		return this.added=this.success
		    }
	    }
}); 
</script>    
	var pushArticlesApi = new Vue.resource('/article/push')({
	el: '#pushArticles',
	data:{
title:'',
content:'',
added:'',
success:'submitted!'
	},
	methods:{
		created: function(){
		pushArticlesApi.save({title:this.title,content:this.content});
		return this.added=this.success
		    }
	    }
});   
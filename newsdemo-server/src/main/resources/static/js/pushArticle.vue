var pushArticlesApi = Vue.resource('/article/push');

var pushArticles = new Vue({
	el : '#pushArticles',
	template :
		  '<div>'
		+ ' <h1>Загруженные статьи</h1>'
		+ ' <div v-for="a in articles">'
		+ '  <div>{{ a.title }}</div>'
        + '  <div>{{ a.content }}</div>'
        + '  <div>{{ a.posting_date }}</div>'
        + '  <div>{{ a.user }}</div>'
		+ ' </div>'
		+ '</div>'
		,
	data : {
		articles : []
	},
	created: function() {
		pushArticlesApi.get({}).then(result =>
			result.json().then(data => {
				for(var m in data) {
					console.log(data[m]);
					this.articles.push(data[m]);
				}
			})
		);
	}
});

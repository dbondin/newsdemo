var lastArticlesApi = Vue.resource('/article');

var lastArticles = new Vue({
	el : '#lastArticles',
	template :
		  '<div>'
		+ ' <h1>Последние статьи</h1>'
		+ ' <div v-for="a in articles">'
		+ '  <div>{{ a.title }}</div>'
		+ '  <div>{{ a.content }}</div>'
		+ ' </div>'
		+ '</div>'
		,
	data : {
		articles : []
	},
	created: function() {
		lastArticlesApi.get({}).then(result =>
			result.json().then(data => {
				for(var m in data) {
					console.log(data[m]);
					this.articles.push(data[m]);
				}
			})
		);
	}
});
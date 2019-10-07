var lastArticlesApi = Vue.resource('/article');

var lastArticles = new Vue({
	el : '#lastArticles',
	template :
		  '<div>'
		+ ' <h1>Последние статьи</h1>'
		+ ' <div v-for="a in articles">'
		+ '  <div>{{ a.date }}</div>'
		+ '  <div>{{ a.author.name }}</div>'
		+ '  <div>{{ a.title }}</div>'
		+ '   <div>{{ a.content.slice(0,50) }}</div>'
		+ '  <div><input type="button" name="submit" value="Читать далее" v-on:click="showdata(a)"></input></div>'
		+ '  </div>'
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
	},
	methods:{
		showdata: function(article){
			console.log(article.content);
			alert(article.content);
		}
	}
});

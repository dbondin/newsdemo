var pushArticlesApi = new Vue.resource('/article');

var pushArticles = new Vue({
	el : '#pushArticles',
	template :
		  '<div>'
		//+ ' <div v-if="currentUserInfo.loggedIn">'
		+ '  <h1>Новая статья</h1>'
		+ '  <div><input v-model="title" type="text" name="title" placeholder="Заголовок"></input></div>'
		+ '  <div><textarea v-model="content" name="content" placeholder="Новость"></textarea></div>'
		+ '  <div><input type="button" name="submit" value="Опубликовать" v-on:click="save"></input></div>'
		//+ ' </div>'
		+ '</div>'
		,
	data : {
		'title': '',
		'content': ''
	},
	methods : {
		save: function() {
			console.log("pushArticles.save() called");
			pushArticlesApi.save({
					'title': this.title,
					'content': this.content
				});
		}
	}
});
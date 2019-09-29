var pushArticlesApi = new Vue.resource('/article');
var currentUserInfoApi = Vue.resource('/user/current');

var pushArticles = new Vue({
	el : '#pushArticles',
	template :
		  '<div>'
		//+ ' <div v-if="currentUserInfo.loggedIn">'
		+ '  <div v-if="currentUser.id !=-1">'
		+ '  <h1>Новая статья</h1>'
		+ '  <div><input v-model="title" type="text" name="title" placeholder="Заголовок"></input></div>'
		+ '  <div><textarea v-model="content" name="content" placeholder="Новость"></textarea></div>'
		+ '  <div><input type="button" name="submit" value="Опубликовать" v-on:click="save"></input></div>'
		+ '	</div>'
		+ '	<div v-else>'
		+ '  <div> </div>'
		+ ' </div>'
		+ '</div>'
		,
	data : {
		currentUser : { "id" : -1 },
		'title': '',
		'content': ''
	},
	created: function() {
		currentUserInfoApi.get({}).then(result =>
			{
				if(result.ok) {
					result.json().then(data => {
						this.currentUser = data;
					});
				}
				else {
					this.currentUser = { "id" : -1 }
				}
			}
		);
	},
	methods : {
		save: function() {
			currentUserInfoApi.get({}).then(result =>
				{
					if(result.ok) {
						result.json().then(data => {
							this.currentUser = data;						
								console.log("pushArticles.save() called");
								pushArticlesApi.save({
										'title': this.title,
										'content': this.content
					
									});
								
						});
					}
					else {
						this.currentUser = { "id" : -1 }
					}
				}
			);
			
		
		},
	}
});
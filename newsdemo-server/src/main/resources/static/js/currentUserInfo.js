var currentUserInfoApi = Vue.resource('/user/current');

var currentUserInfo = new Vue({
	el : '#currentUserInfo',
	template :
		  '<div>'
		+ ' <div v-if="currentUser.id != -1">'
		+ '  <div>Вы залогинены как {{ currentUser.name }}</div>'
		+ '  <a href="/logout">Выйти</a>'
		+ ' </div>'
		+ ' <div v-else>'
		+ '  <div>Вы не залогинены</div>'
		+ '  <a href="/login">Войти</a>'
		+ ' </div>'
		+ '</div>'
		,
	data : {
		currentUser : { "id" : -1 }
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
	}
});

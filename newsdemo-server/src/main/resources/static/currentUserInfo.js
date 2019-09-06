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
		+ '  <form action="/login" method="post">'
		+ '   <div><label>Логин <input type="text" name="username"></input></label></div>'
		+ '   <div><label>Пароль <input type="password" name="password"></input></label></div>'
		+ '   <div><input type="submit" value="Войти"></input></div>'
		+ '  </form>'
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

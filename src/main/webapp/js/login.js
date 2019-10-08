$(
function(){
	if ($('input[name="name"]').val() == "" ||
		$('input[name="password"]').val() == "" ||
		$('#identify_code').val()=="") {
		$('#login').attr('disabled', true)

		$('#login').css({'background-color':'gray'});
	}else{
		$('#login').attr('disabled', false)

		$('#login').css({'background-color':'#32A5F1'});
	};

	if ($('input[name="name1"]').val() == "" ||
		$('input[name="password1"]').val() == "" ||
		$('input[name="mail"]').val() == ""||
		$('input[name="phone_code"]').val() == ""||
		$('input[name="agreement"]').prop('checked') == false
		) {
		$('#desiger_1').attr('disabled', true)

		$('#desiger_1').css({'background-color':'gray'});
	}else{
		$('#desiger_1').attr('disabled', false)

		$('#desiger_1').css({'background-color':'#32A5F1'});
	};
	if ($('input[name="mail"]').val() == "") {
		$('#phone_code1').attr('disabled', true)

		$('#phone_code1').css({'background-color':'gray'})
	}else{
		$('#phone_code1').attr('disabled', false)

		$('#phone_code1').css({'background-color':'#32A5F1'});
	};

	$("#desiger").click(function(){
		
			
			$("#middle").hide()
			
			$("#middle_desiger").show()
			
		
		
	}),
	$("#login_1").click(function(){
		
			
			$("#middle").show()
			
			$("#middle_desiger").hide()
	})
,$('input[name="agreement"]').click(
	function () {
		if ($('input[name="name1"]').val() != "" &&
			$('input[name="password1"]').val() != "" &&
			$('input[name="mail"]').val() != ""&&
			$('input[name="phone_code"]').val() != ""&&
			$('input[name="agreement"]').prop('checked') == true
		) {
			$('#desiger_1').attr('disabled', false)

			$('#desiger_1').css({'background-color':'#32A5F1'});
		}else{
			$('#desiger_1').attr('disabled', true)

			$('#desiger_1').css({'background-color':'gray'});
		};
	}
	)
		,$('#login').click(function () {
		$.ajax(
			"login.do",
			{
				dataType: "json",
				type: "post",
				async: true,

				data:{
					username:$('input[name="name"]').val(),
					password:$('input[name="password"]').val()
				},
				success:function (data) {
					var flag=data['data']['flag']
					if(flag=='true'){
						var permission=data['data']['permission']
						if(permission=='Admin:log'){
							$(location).attr('href','login')
						}
						if(permission=='user:log'){
							$(location).attr('href','userpage')
						}
						if(permission=='VIP:log'){
							$(location).attr('href','login')
						}
					}else if(flag=='false'){

						$(location).attr('href','login')
					}else if(flag=='already'){
						alert('当前账号已登录')
						$(location).attr('href','login')
					}

				},
				error:function () {

				}

			}
		)
	}),

		$('#desiger_1').click(function () {

			$.ajax("reg.do",
				{
					dataType: "json",
					type: "post",
					async: true,

					data:{username:$('input[name="name1"]').val(),
						password:$('input[name="password1"]').val(),
					    mail:$('input[name="mail"]').val(),
						type_code:$('#phone_code').val()},

					success:function (data) {
						var flag=data['data']['flag']
						if(flag=='true'){
							$(location).attr('href','login')
						}
						if(flag=='repeat'){
							alert('用户名重复，注册失败')
						}

						else if(flag=='false'){
							alert('系统内部错误，注册失败')
						}
						else if(flag='unverified'){
							alert('邮箱验证码错误')
						}
					}
				})
				}
			),
		$('#phone_code1').click(function () {
			$.ajax("code.do",
				{
					dataType: "json",
					type: "post",
					async: true,
					data: {mail: $('input[name="mail"]').val()},
					success:function (data) {
						if(data['data']['flag']=='repeat'){
							alert('邮箱已被注册')
						}

					}

				}



				)
		})


}
).keyup(function () {

	if ($('input[name="name"]').val() != "" &&
		$('input[name="password"]').val() != "" &&
		$('#identify_code').val()!="") {
		$('#login').attr('disabled', false)

		$('#login').css({'background-color':'#32A5F1'});
	}else{
		$('#login').attr('disabled', true)

		$('#login').css({'background-color':'gray'});
	}
	if ($('input[name="name1"]').val() != "" &&
		$('input[name="password1"]').val() != "" &&
		$('input[name="mail"]').val() != ""&&
		$('input[name="phone_code"]').val() != ""&&
		$('input[name="agreement"]').prop('checked') == true
	) {
		$('#desiger_1').attr('disabled', false)

		$('#desiger_1').css({'background-color':'#32A5F1'});
	}else{
		$('#desiger_1').attr('disabled', true)

		$('#desiger_1').css({'background-color':'gray'});
	};
	if (
		$('input[name="mail"]').val() != ""
	) {
		$('#phone_code1').attr('disabled', false)


		$('#phone_code1').css({'background-color':'#32A5F1'});
	}else{

		$('#phone_code1').attr('disabled', true)

		$('#phone_code1').css({'background-color':'gray'});

	}
})


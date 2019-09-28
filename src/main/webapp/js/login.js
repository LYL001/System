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
					alert('1111111')
					var flag=data['data']['flag']
					if(flag=='true'){
						alert('成功')
					}else if(flag=='false'){
						alert('用户名或密码错误')
						$(location).attr('href','login')
					}

				},
				error:function () {
					alert(2)
				}

			}
		)
	}),

		$('#desiger_1').click(function () {
			alert(11111)
			$.ajax("reg.do",
				{
					dataType: "json",
					type: "post",
					async: true,

					data:{username:$('input[name="name1"]').val(),
						password:$('input[name="password1"]').val(),
					mail:$('input[name="mail"]').val()}
				})
				}

			)


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
})


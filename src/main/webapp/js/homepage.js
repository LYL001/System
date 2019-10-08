$(
    function () {
        $.ajax("homeinfo",
            {
                dataType: "json",
                type: "post",
                async: true,
                success:function (data) {
                    $('#name').html( data['data']['user']['username'])

                    if(data['data']['user']['authority']==2){
                        $('#membership').html("<a href=''>开通会员</a> ")
                }
                else if(data['data']['user']['authority']==3){
                        $('#membership').html('欢迎你，大会员')
                }
                }

            }
            )

    }
)
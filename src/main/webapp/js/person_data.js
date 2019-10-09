$(window).on('load', function() {


    //生日的下拉选择实现
    $(function() {
        // 初始化（带默认值）
        $.ms_DatePicker({
            YearSelector: ".sel_year",
            MonthSelector: ".sel_month",
            DaySelector: ".sel_day"
        });
    });

    (function($) {
        $.extend({
            ms_DatePicker: function(options) {
                var defaults = {
                    YearSelector: "#sel_year",
                    MonthSelector: "#sel_month",
                    DaySelector: "#sel_day",
                    FirstText: "--",
                    FirstValue: 0
                };
                var opts = $.extend({}, defaults, options);
                var $YearSelector = $(opts.YearSelector);
                var $MonthSelector = $(opts.MonthSelector);
                var $DaySelector = $(opts.DaySelector);
                var FirstText = opts.FirstText;
                var FirstValue = opts.FirstValue;

                // 初始化
                var str = "<option value=\"" + FirstValue + "\">" + FirstText + "</option>";
                $YearSelector.html(str);
                $MonthSelector.html(str);
                $DaySelector.html(str);

                // 年份列表
                var yearNow = new Date().getFullYear();
                var yearSel = $YearSelector.attr("rel");
                for (var i = yearNow; i >= 1900; i--) {
                    var sed = yearSel == i ? "selected" : "";
                    var yearStr = "<option value=\"" + i + "\"" + sed + ">" + i + "</option>";
                    $YearSelector.append(yearStr);
                }

                // 月份列表
                var monthSel = $MonthSelector.attr("rel");
                for (var i = 1; i <= 12; i++) {
                    var sed = monthSel == i ? "selected" : "";
                    var monthStr = "<option value=\"" + i + "\"" + sed + ">" + i + "</option>";
                    $MonthSelector.append(monthStr);
                }

                // 日列表(仅当选择了年月)
                function BuildDay() {
                    if ($YearSelector.val() == 0 || $MonthSelector.val() == 0) {
                        // 未选择年份或者月份
                        $DaySelector.html(str);
                    } else {
                        $DaySelector.html(str);
                        var year = parseInt($YearSelector.val());
                        var month = parseInt($MonthSelector.val());
                        var dayCount = 0;
                        switch (month) {
                            case 1:
                            case 3:
                            case 5:
                            case 7:
                            case 8:
                            case 10:
                            case 12:
                                dayCount = 31;
                                break;
                            case 4:
                            case 6:
                            case 9:
                            case 11:
                                dayCount = 30;
                                break;
                            case 2:
                                dayCount = 28;
                                if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
                                    dayCount = 29;
                                }
                                break;
                            default:
                                break;
                        }

                        var daySel = $DaySelector.attr("rel");
                        for (var i = 1; i <= dayCount; i++) {
                            var sed = daySel == i ? "selected" : "";
                            var dayStr = "<option value=\"" + i + "\"" + sed + ">" + i + "</option>";
                            $DaySelector.append(dayStr);
                        }
                    }
                }
                $MonthSelector.change(function() {
                    BuildDay();
                });
                $YearSelector.change(function() {
                    BuildDay();
                });
                if ($DaySelector.attr("rel") != "") {
                    BuildDay();
                }
            }

        });
    })(jQuery);
});
$(function () {
    $.ajax("../information",{

        dataType: "json",
        type: "post",
        async: true,
        success:function (data) {
            $('#name').html(data['data']['user']['username'])
            $('#mail').html(data['data']['user']['mail'])
            var gender=data['data']['info']['gender']
            if(gender==1){
                $("#male").attr("checked",true)
                $("#female").attr("checked",false)
            }else{
                $("#female").attr("checked",true)
                $("#male").attr("checked",false)
            }
            var birthday=data['data']['info']['birthday']
            var list1=birthday.split('年')
            var year=list1[0]
            var list2=list1[1].split('月')
            var month=list2[0]
            var date=list2[1].split('日')[0]
            $('#year').val(year)
            $('#month').val(month)
            $('#date').val(date)
            $('#education').val(data['data']['edu']['qualification'])
            var location=data['data']['info']['situation']
            var province
            var city
            if(location.indexOf('省')>=0) {
                 province = location.split('省')[0] + '省'
                 city=location.split('省')[1]
            }
            else if(location.indexOf('区')>=0) {
                 province = location.split('区')[0] + '区'
                 city=location.split('区')[1]
            }
            else{
                province=location.split('市')[0]+'市'
                city=location.split('市')[1]+'市'
            }
            $('#province').val(province)
            $('#city').val(city)
            $('input[name="height"]').val(data['data']['info']['height'])
            $('input[name="weight"]').val(data['data']['info']['weight'])
            $('input[name="salary"]').val(data['data']['info']['salary'])
        }
    }),



























$('#save').click(function () {
    $.ajax("../updateinfo",{

        dataType: "json",
        type: "post",
        async: true,
        contentType:"application/json",
        data:JSON.stringify({
            username:$("#name").html(),
            gender:$(".sex").val(),
            year: $('#year').val(),
            month:$('#month').val(),
            date:$('#date').val(),
            education:$('#education').val(),
            province:$('#province').val(),
            city:$('#city').val(),
            height:$('input[name="height"]').val(),
            weight:$('input[name="weight"]').val(),
            salary:$('input[name="salary"]').val()
        }
        )
    })

})


})

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
    var pro = ["北京市", "天津市", "河北省", "山西省", "内蒙古自治区", "辽宁省", "吉林省", "黑龙江省", "上海市", "江苏省", "浙江省", "安徽省", "福建省", "江西省", "山东省", "河南省", "湖北省", "湖南省", "广东省", "广西壮族自治区", "海南省", "重庆市", "四川省", "贵州省", "云南省", "西藏自治区", "陕西省", "甘肃省", "青海省", "宁夏回族自治区", "新疆维吾尔自治区", "台湾省", "香港特别行政区", "澳门特别行政区"];
    var city = new Array(pro.length);
    city[0] = ["北京市"];
    city[1] = ["天津市"];
    city[2] = ["石家庄市", "唐山市", "秦皇岛市", "邯郸市", "邢台市", "保定市", "张家口市", "承德市", "沧州市", "廊坊市", "衡水市"];
    city[3] = ["太原市", "大同市", "阳泉市", "长治市", "晋城市", "朔州市", "晋中市", "运城市", "忻州市", "临汾市", "吕梁市"];
    city[4] = ["呼和浩特市", "包头市", "乌海市", "赤峰市", "通辽市", "鄂尔多斯市", "呼伦贝尔市", "巴彦淖尔市", "乌兰察布市", "兴安盟", "锡林郭勒盟", "阿拉善盟"];
    city[5] = ["沈阳市", "大连市", "鞍山市", "抚顺市", "本溪市", "丹东市", "锦州市", "营口市", "阜新市", "辽阳市", "盘锦市", "铁岭市", "朝阳市", "葫芦岛市"];
    city[6] = ["长春市", "吉林市", "四平市", "辽源市", "通化市", "白山市", "松原市", "白城市", "延边朝鲜族自治州"];
    city[7] = ["哈尔滨市", "齐齐哈尔市", "鸡西市", "鹤岗市", "双鸭山市", "大庆市", "伊春市", "佳木斯市", "七台河市", "牡丹江市", "黑河市", "绥化市", "大兴安岭地区"];
    city[8] = ["上海市"];
    city[9] = ["南京市", "无锡市", "徐州市", "常州市", "苏州市", "南通市", "连云港市", "淮安市", "盐城市", "扬州市", "镇江市", "泰州市", "宿迁市"];
    city[10] = ["杭州市", "宁波市", "温州市", "嘉兴市", "湖州市", "绍兴市", "金华市", "衢州市", "舟山市", "台州市", "丽水市"];
    city[11] = ["合肥市", "芜湖市", "蚌埠市", "淮南市", "马鞍山市", "淮北市", "铜陵市", "安庆市", "黄山市", "滁州市", "阜阳市", "宿州市", "六安市", "亳州市", "池州市", "宣城市"];
    city[12] = ["福州市", "厦门市", "莆田市", "三明市", "泉州市", "漳州市", "南平市", "龙岩市", "宁德市"];
    city[13] = ["南昌市", "景德镇市", "萍乡市", "九江市", "新余市", "鹰潭市", "赣州市", "吉安市", "宜春市", "抚州市", "上饶市"];
    city[14] = ["济南市", "青岛市", "淄博市", "枣庄市", "东营市", "烟台市", "潍坊市", "济宁市", "泰安市", "威海市", "日照市", "莱芜市", "临沂市", "德州市", "聊城市", "滨州市", "菏泽市"];
    city[15] = ["郑州市", "开封市", "洛阳市", "平顶山市", "安阳市", "鹤壁市", "新乡市", "焦作市", "濮阳市", "许昌市", "漯河市", "三门峡市", "南阳市", "商丘市", "信阳市", "周口市", "驻马店市", "济源市"];
    city[16] = ["武汉市", "黄石市", "十堰市", "宜昌市", "襄阳市", "鄂州市", "荆门市", "孝感市", "荆州市", "黄冈市", "咸宁市", "随州市", "恩施土家族苗族自治州", "仙桃市", "潜江市", "天门市", "神农架林区"];
    city[17] = ["长沙市", "株洲市", "湘潭市", "衡阳市", "邵阳市", "岳阳市", "常德市", "张家界市", "益阳市", "郴州市", "永州市", "怀化市", "娄底市", "湘西土家族苗族自治州"];
    city[18] = ["广州市", "韶关市", "深圳市", "珠海市", "汕头市", "佛山市", "江门市", "湛江市", "茂名市", "肇庆市", "惠州市", "梅州市", "汕尾市", "河源市", "阳江市", "清远市", "东莞市", "中山市", "潮州市", "揭阳市", "云浮市"];
    city[19] = ["南宁市", "柳州市", "桂林市", "梧州市", "北海市", "防城港市", "钦州市", "贵港市", "玉林市", "百色市", "贺州市", "河池市", "来宾市", "崇左市"];
    city[20] = ["海口市", "三亚市", "三沙市", "儋州市", "五指山市", "琼海市", "文昌市", "万宁市", "东方市", "定安县", "屯昌县", "澄迈县", "临高县", "白沙黎族自治县", "昌江黎族自治县", "乐东黎族自治县", "陵水黎族自治县", "保亭黎族苗族自治县", "琼中黎族苗族自治县"];
    city[21] = ["重庆市"];
    city[22] = ["成都市", "自贡市", "攀枝花市", "泸州市", "德阳市", "绵阳市", "广元市", "遂宁市", "内江市", "乐山市", "南充市", "眉山市", "宜宾市", "广安市", "达州市", "雅安市", "巴中市", "资阳市", "阿坝藏族羌族自治州", "甘孜藏族自治州", "凉山彝族自治州"];
    city[23] = ["贵阳市", "六盘水市", "遵义市", "安顺市", "毕节市", "铜仁市", "黔西南布依族苗族自治州", "黔东南苗族侗族自治州", "黔南布依族苗族自治州"];
    city[24] = ["昆明市", "曲靖市", "玉溪市", "保山市", "昭通市", "丽江市", "普洱市", "临沧市", "楚雄彝族自治州", "红河哈尼族彝族自治州", "文山壮族苗族自治州", "西双版纳傣族自治州", "大理白族自治州", "德宏傣族景颇族自治州", "怒江傈僳族自治州", "迪庆藏族自治州"];
    city[25] = ["拉萨市", "日喀则市", "昌都市", "林芝市", "山南市", "那曲市", "阿里地区"];
    city[26] = ["西安市", "铜川市", "宝鸡市", "咸阳市", "渭南市", "延安市", "汉中市", "榆林市", "安康市", "商洛市"];
    city[27] = ["兰州市", "嘉峪关市", "金昌市", "白银市", "天水市", "武威市", "张掖市", "平凉市", "酒泉市", "庆阳市", "定西市", "陇南市", "临夏回族自治州", "甘南藏族自治州"];
    city[28] = ["西宁市", "海东市", "海北藏族自治州", "黄南藏族自治州", "海南藏族自治州", "果洛藏族自治州", "玉树藏族自治州", "海西蒙古族藏族自治州"];
    city[29] = ["银川市", "石嘴山市", "吴忠市", "固原市", "中卫市"];
    city[30] = ["乌鲁木齐市", "克拉玛依市", "吐鲁番市", "哈密市", "昌吉回族自治州", "博尔塔拉蒙古自治州", "巴音郭楞蒙古自治州", "阿克苏地区", "克孜勒苏柯尔克孜自治州", "喀什地区", "和田地区", "伊犁哈萨克自治州", "塔城地区", "阿勒泰地区", "石河子市", "阿拉尔市", "图木舒克市", "五家渠市", "北屯市", "铁门关市", "双河市", "可克达拉市", "昆玉市"];
    city[31] = ["台湾省"];
    city[32] = ["香港特别行政区"];
    city[33] = ["澳门特别行政区"];
    var month1=[1,2]
    var day = new Array(month1.length);
    day[0]=[31,28,31,30,31,30,31,31,30,31,30,31]
    day[1]=[31,29,31,30,31,30,31,31,30,31,30,31]
    $.ajax("../information",{

        dataType: "json",
        type: "post",
        async: true,
        success:function (data) {
            $('#name').html(data['data']['user']['username'])
            $('#mail').html(data['data']['user']['mail'])
            var gender = data['data']['info']['gender']
            if (gender == "1") {
                $("#male").attr("checked", true)
                $("#female").attr("checked", false)
            } else {
                $("#female").attr("checked", true)
                $("#male").attr("checked", false)
            }
            var birthday = data['data']['info']['birthday']
            var list = birthday.split('-')
            var year = list[0]
            var month = list[1]
            var date = list[2]
            $('#year').val(year)
            $('#month').val(month)
            var year_i=parseInt(year)
            if((year_i%4==0)&&(year_i%100!=0)){
                for(var d=0;d<12;d++){
                    for(var h=1;h<=day[1][d];h++)
                        if(parseInt(date)==h){
                            $("#date").append($("<option selected>").val(h).html(h))
                        }else {
                            $("#date").append($("<option>").val(h ).html(h ))
                        }
                }
            }else{
                for(var d=0;d<12;d++){
                    for(var h=1;h<=day[0][d];h++)
                        if(parseInt(date)==h){
                            $("#date").append($("<option selected>").val(h).html(h))
                        }else {
                            $("#date").append($("<option>").val(h ).html(h ))
                        }
                }

            }

            $('#education').val(data['data']['edu']['qualification'])
            var province
            var province_i
            var city_s
            var city_i
            var i=0
            var j=0
            var situation = data['data']['info']['situation']
            if (situation.indexOf('省') >= 0) {
                province = situation.split('省')[0] + '省'
                for (i ; i < pro.length; i++) {
                    if (province == pro[i]) {
                        province_i = i + 1
                        city_s = situation.split('省')[1]
                        for (j; j < city[i].length; j++) {
                            if (city[i][j] == city_s) {
                                city_i = j
                                break
                            }
                        }
                        break
                    }
                }

            } else if (situation.indexOf('区') >= 0) {
                province = situation.split('区')[0] + '区'
                for ( i ; i < pro.length; i++) {
                    if (province == pro[i]) {
                        province_i = i + 1
                        city_s = situation.split('区')[1]
                        for (j; j < city[i].length; j++) {
                            if (city[i][j] == city_s) {
                                city_i = j
                                break
                            }
                        }
                        break
                    }

                }
            } else {
                province = situation.split('市')[0] + '市'
                for (i; i < pro.length; i++) {
                    if (province == pro[i]) {
                        province_i = i + 1
                        city_s = situation.split('市')[1] + '市'
                        for (j; j < city[i].length; j++) {
                            if (city[i][j] == city_s) {
                                city_i = j
                                break
                            }
                        }
                        break
                    }
                }
            }

                $('#province').val(province_i)
            for(var k=0;k<city[i].length;k++){
                if(city[i][k]==city_s){
                    $("#city").append($("<option selected>").val(city[i][k]).html(city[i][k]));
                }else {
                    $("#city").append($("<option>").val(city[i][k]).html(city[i][k]));
                }

            }

                $('input[name="height"]').val(data['data']['info']['height'])
                $('input[name="weight"]').val(data['data']['info']['weight'])
                $('input[name="salary"]').val(data['data']['info']['salary'])
            }

    });

        $('#save').click(function () {
            var pro = ["北京市", "天津市", "河北省", "山西省", "内蒙古自治区", "辽宁省", "吉林省", "黑龙江省", "上海市", "江苏省", "浙江省", "安徽省", "福建省", "江西省", "山东省", "河南省", "湖北省", "湖南省", "广东省", "广西壮族自治区", "海南省", "重庆市", "四川省", "贵州省", "云南省", "西藏自治区", "陕西省", "甘肃省", "青海省", "宁夏回族自治区", "新疆维吾尔自治区", "台湾省", "香港特别行政区", "澳门特别行政区"];
            var str=$('#province').val()
            var i=parseInt($('#province').val());
            var province=pro[i-1];
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
            province:province,
            city:$('#city').val(),
            height:$('input[name="height"]').val(),
            weight:$('input[name="weight"]').val(),
            salary:$('input[name="salary"]').val()
        }
        ),
        successs:function f() {
            $(location).attr('href','edit')

        }
    })

})


})

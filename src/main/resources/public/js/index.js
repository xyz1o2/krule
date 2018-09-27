window.onload = function () {

    var init = function() {
        $.getJSON('/permission/auth/findAll', {}, function (data) {
            var html = "";
            for (var item in data.qx_list) {
                html += '<tr>';
                html += '<td>' + data.qx_list[item].user + '</td>';
                html += '<td><input id="input_' +data.qx_list[item].user+'" type="text" readonly="readonly" name="content" value="'+data.qx_list[item].qx+'" class="layui-input noframe"></td>';
                html += '<td style="width:200px">';
                html += '<button cid="' + data.qx_list[item].user+ '" op="edit" class="layui-btn layui-btn-normal">编辑</button>';
                html += '<button cid="' + data.qx_list[item].user+ '" op="save"  class="layui-btn layui-btn-normal">保存</button>';
                html += '</td>';
                html += '</tr>';
            }
            window.document.getElementById("user_name").innerText = data.user_name;
            if (window.document.getElementById("qx_panel")) {
                window.document.getElementById("qx_panel").innerHTML = "";
                window.document.getElementById("qx_panel").innerHTML = html;
            }
        });
    }

    init();

    $("#qx_panel").on("click", ".layui-btn", function (e) {
        var user = $(this).attr("cid");
        var op = $(this).attr("op");
        if (op == 'edit') {
            $('#input_' + user).removeAttr("readonly");
            $('#input_' + user).attr("class", "layui-input");
        }
        if (op == 'save') {
            $('#input_' + user).attr("readonly", "readonly");
            $('#input_' + user).attr("class", "layui-input noframe");
            //此处更新

            var data = {
                username : user,
                projectName : $('#input_' + user).val()
            }
            
            $.get('/permission/auth/update', data, function (result) {
                if (result == 'OK') {

                } else {
                    alert(result);
                }
            })
        }
    });
    
    $('#adduser').on("click", function () {
        var data = {
            username : $('#add_user_name').val(),
            projectName : $('#add_product_line').val()
        };

        $.get('/permission/auth/add', data, function (result) {
            if (result == 'OK') {
                location.reload();
            } else {
                alert(result);
            }
        })
    });

};



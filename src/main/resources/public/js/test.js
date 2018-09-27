window.onload = function () {

    var init = function() {
        $.get('/run/test/page/getAuthProjectList', function (result) {
            if (result.length > 0) {
                var html = '';
                window.document.getElementById("product_line").innerHTML = html;
                for (var item in result) {
                    html += '<option value="' + result[item] + '">' + result[item] + '</option>';
                }
                window.document.getElementById("product_line").innerHTML = html;

            }
        });
    };

    var renderTaskList = function() {
        $.getJSON('/run/test/page/getAuthTestTask', function (result) {
            if (result.length > 0) {
                var html = '';
                window.document.getElementById("task_list").innerHTML = html;
                for (var item in result) {
                    html += '<tr>';
                    html += '<td>' + result[item].id + '</td>';
                    html += '<td>' + result[item].productLine + '</td>';
                    html += '<td>' + result[item].packageId + '</td>';
                    html += '<td>' + result[item].flowId + '</td>';
                    html += '<td>' + result[item].type + '</td>';
                    html += '<td>' + result[item].status + '</td>';
                    html += '<td>' + result[item].createTime + '</td>';
                    html += '<td><a target="_blank" href="/run/test/page/getTestTaskResult?taskId=' + result[item].id + '">获取数据</a></td>';
                    html += '</tr>';
                }
                window.document.getElementById("task_list").innerHTML = html;
            }
        });
    };

    init();
    renderTaskList();

    $('#add_task').bind("click", function () {
        alert("暂未开启，敬请期待");
        var type =  $('#serial_id').val() != '' ? 0 : 1;
        var d1 = new Date($('#start_time').val() + ":000");
        var d2 = new Date($('#end_time').val() + ":000");
        var data = {
            product_line : $('#product_line').val(),
            strategy_type : "flow",
            package_id : $('#package_id').val(),
            flow_id : $('#flow_id').val(),
            serial_id : $('#serial_id').val(),
            type  : type,
            start_time : Date.parse(d1) / 1000,
            end_time : Date.parse(d2) / 1000
        };
        $.get('/run/test/page/addStrategyTask', data, function (result) {
            if (result.data == "OK") {
                renderTaskList();
                $("#tar1").click();
            } else {
                alert(result.data);
            }

        });
    });
};



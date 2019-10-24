

$(".submit").click(function () {
    var loginname = $("input[name='loginname']").val().trim();
    var password = $("input[name='password']").valid().trim();
    $.ajax({
        type: "POST",
        url: "/login",
        data: {
            "loginname" : loginname,
            "password" : password
        },
        success:function (data) {
            alert(data)
        }

    })
})
$(document).ready(function() {
    $('form').submit(function(event) {
        const formData = {
            'tAccNo'              : $('input[name=tAccNo]').val(),
            'tAmount'             : $('input[name=tAmount]').val(),
        };
        $.ajax({
            type        : 'POST',
            url         : 'http://localhost:8080/BuffaloTeam/add',
            data        : formData,
        })
            .done(function(data) {
                $('input[name=tAccNo]').val('');
                $('input[name=tAmount]').val('');
                window.location.href = 'http://localhost:8080/BuffaloTeam/showData/showData.html';
                console.log(data);
            });
        event.preventDefault();
    });

});
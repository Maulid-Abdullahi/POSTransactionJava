$(document).ready(function() {
    $.ajax({
        url: 'http://localhost:8080/BuffaloTeam/add',
        data: {
            format: 'json'
        },
        type: 'GET',
        success: function(data) {
            data.forEach(record =>{
                const id = record.id;
                const amount = record.amount;
                const accNo = record.accNo;
               const table = document.getElementById('dashboard');
               const row = `<tr>
                                <td data-column="Id">${id}</td>
                                <td data-column="Account Number">${accNo}</td>
                                <td data-column="Amount">${amount}</td>
                                </tr>`;
               table.insertAdjacentHTML('beforeend', row);
            });
        },
        error: function(error) {
            console.log(error)
        },
        dataType: 'json',
    });
});
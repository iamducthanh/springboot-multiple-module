fetch('/api/v1/staff/list')
    .then(response => response.json())
    .then(data => {
        console.log(new Date())

        console.log('call by fetch')
        console.log(data)
    });

$.ajax({
    url: '/api/v1/staff/list',
    // data: data,
    error: function () {
        console.log("error")
    },
    success: function (dataOut) {
        console.log(new Date())

        console.log('call by ajax')
        console.log(dataOut)
    },
    type: 'GET'
});
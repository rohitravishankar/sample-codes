//console.log('hello world');
var https = require('https');
var optionsget = {
    host: 'cricscore-api.appspot.com',
    path: '/csa',
    method: 'GET' // do GET
};
var Twit = require('twit')

var T = new Twit({
    consumer_key: 'consumer key',
    consumer_secret: 'secret key',
    access_token: 'access token',
    access_token_secret: 'access token secret',
    timeout_ms: 60 * 1000, // optional HTTP request timeout to apply to all requests.
})

var myjson;
var reqGet = https.request(optionsget, function(res) {
    res.on('data', function(d) {
        myjson = d;
        var obj = JSON.parse(myjson);
        for (var i = 0; i < obj.length; i++) {
            var val = "";
            //console.log(obj[i]);
            Object.keys(obj[i]).forEach(function(key) {
                val = val + obj[i][key] + " ";
            });
            var id = val.split(" ", 1);
            var par = '/csa?id=' + id;
            var options1get = {
                host: 'cricscore-api.appspot.com',
                path: par,
                method: 'GET' // do GET
            };
            var req1Get = https.request(options1get, function(res1) {
                res1.on('data', function(d) {
                    var mysubjon = d;
                    var obj1 = JSON.parse(mysubjon);
                    for (var ii = 0; ii < obj1.length; ii++) {
                        var val1 = "";
                        Object.keys(obj1[ii]).forEach(function(key1) {
                            val1 = val1 + obj1[ii][key1] + " ";
                        });
                        var val2 = obj1[ii]["si"];
                        var matches = val2.match(/\d+/g);
                        if (matches == null) {
                            val2 = val2 + "  Match may have been abandoned between teams";
                        }
                        console.log(val2);
                        T.post('statuses/update', {
                            status: val2
                        }, function(err, data2, response) {})
                    }
                });
            });
            req1Get.end();
        }
    });
});
reqGet.end();

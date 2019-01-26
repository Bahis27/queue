let page_info_param = {
    'TalonCode': "",
    'TalonNumber': 0,
    'OtdelenieNo': 0
};

function Init() {
    //parse URL(GET prams)
    let CurrentUrl = window.location.search.substr(1),
        urlParams = {};

    CurrentUrl.split('&').forEach(function (item) {
        item = item.split('=');
        urlParams[item[0]] = item[1];
    });

    for (let key in page_info_param) {
        if (key in urlParams) {
            page_info_param[key] = urlParams[key];
        }
    }

    //Make first response
    Make_Response();
}

function Make_Response() {
    ajaxRequest("GET", 'timelap', handle_response, page_info_param);
}

function handle_response(data) {
    if ("TalonCode" in data &&
        "TalonNumber" in data) {
        document.getElementById('talon_no').innerText = data['TalonCode'] + data['TalonNumber'];
    }

    if ("InFront" in data) {
        document.getElementById('all_usr_count').innerText = data['InFront'];

        if ("AverageTime" in data) {
            console.log(data['InFront'] * data['AverageTime']);
            document.getElementById('waiting_time').innerText = data['InFront'] * data['AverageTime'];
        }
    }

}

function ajaxRequest(method, url, callback_function, httpParams) {
    let callback_func = callback_function || function (data) {
        console.log('AjaxRequest doesnt have handle function');
    };

    let request = new XMLHttpRequest();
    if (method === "POST") {
        request.open(method, url, false);
        request.send(httpParams);
    }
    else if (method === "GET") {
        request.open(method, url + makeGETParams(httpParams), false);
        request.send();
    }

    if (request.status !== 200) {
        alert('Failed to connection status:' + request.status + ' Response text: ' + request.responseText);
    }
    else {
        callback_func(JSON.parse(request.responseText));
    }
}

function makeGETParams(params) {
    let url = '?';
    for (let key in params) {
        url += key + "=" + params[key] + "&"
    }
    return url;
}
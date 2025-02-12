var exec = require('cordova/exec');

exports.coolMethod = function (arg0, success, error) {
    exec(success, error, 'custom_printer', 'coolMethod', [arg0]);
};

exports.printBill = function (arg0, success, error) {
    exec(success, error, 'custom_printer', 'printBill', [arg0]);
};
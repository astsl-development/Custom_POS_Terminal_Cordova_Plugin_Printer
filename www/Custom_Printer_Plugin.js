var exec = require('cordova/exec');

exports.coolMethod = function (arg0, success, error) {
    exec(success, error, 'Custom_Printer_Plugin', 'coolMethod', [arg0]);
};

exports.printBill = function (arg0, success, error) {
    exec(success, error, 'Custom_Printer_Plugin', 'printBill', [arg0]);
};
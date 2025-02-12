package alliance-custom-printer-plugin;

import android.os.Handler;

import org.apache.cordova.CordovaPlugin;

import java.rmi.RemoteException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import net.nyx.printerservice.print.PrintTextFormat;
import net.nyx.printerservice.print.IPrinterService;

/**
 * This class echoes a string called from JavaScript.
 */
public class Custom_Printer_Plugin extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
            String message = args.getString(0);
        if (action.equals("coolMethod")) {
            message = args.getString(0);
            this.coolMethod(message, callbackContext);
            return true;
        }else if(action.equals("printBill")){
            message = args.getString(0);
            this.setPrinter(message,callbackContext);
            return true;
        }
        return false;
    }

    private void coolMethod(String message, CallbackContext callbackContext) {
        if (message != null && message.length() > 0) {
            callbackContext.success(message);
        } else {
            callbackContext.error("Expected one non-empty string argument.");
        }
    }

    private void coolMethod(String message, CallbackContext callbackContext) {
        if (message != null && message.length() > 0) {
            
            callbackContext.success(message);
        } else {
            callbackContext.error("Expected one non-empty string argument.");
        }
    }

    private void coolMethod(String message, CallbackContext callbackContext) {
        if (message != null && message.length() > 0) {            
            callbackContext.success(message);
        } else {
            callbackContext.error("Expected one non-empty string argument.");
        }
    }

    private void printBill(String message, CallbackContext callbackContext) {
        if (message != null && message.length() > 0) {
            printText(message);
            callbackContext.success(message);
        } else {
            callbackContext.error("Expected one non-empty string argument.");
        }
    }
    
    private IPrinterService printerService;
    printerService = IPrinterService.Stub.asInterface(service);
    private ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();

    private void printText(String text) {
        singleThreadExecutor.submit(new Runnable() {
            @Override
            public void run() {
                try {
                    PrintTextFormat textFormat = new PrintTextFormat();
                    // textFormat.setTextSize(32);
                    // textFormat.setUnderline(true);
                    int ret = printerService.printText(text, textFormat);                    
                    if (ret == 0) {
                        printerService.printEndAutoOut();
                    }
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}

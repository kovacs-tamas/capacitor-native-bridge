package de.eportrait.capacitor;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin(name = "CapacitorNativeBridge")
public class CapacitorNativeBridgePlugin extends Plugin {
    
    @PluginMethod
    public void getConfig(PluginCall call) {
        Intent intent = bridge.getIntent();
        JSONObject result = new JSONObject();

        try {
            if (intent.hasExtra("css")) {
                String css = intent.getExtras().getString("css");
                result.put("css", css);
            }

            if (intent.hasExtra("config-json")) {
                String config = intent.getExtras().getString("config-json");
                result.put("config", config);
            }

        } catch (JSONException e) {
            // some exception handler code.
        }


        call.resolve(result);
    }

    @PluginMethod
    public void deliverResults(PluginCall call) {
        Intent intent = bridge.getIntent();

        if (intent.hasExtra("config-json")) {
            MainActivity.callListener(arg);
        }

        JSObject ret = new JSObject();
        call.resolve(ret);
    }
}

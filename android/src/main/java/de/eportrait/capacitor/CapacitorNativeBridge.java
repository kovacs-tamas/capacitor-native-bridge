package de.eportrait.capacitor;

import android.util.Log;

public class CapacitorNativeBridge {

    public String echo(String value) {
        Log.i("Echo", value);
        return value;
    }
}

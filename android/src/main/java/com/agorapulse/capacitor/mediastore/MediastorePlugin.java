package com.agorapulse.capacitor.mediastore;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

@CapacitorPlugin(name = "Mediastore")
public class MediastorePlugin extends Plugin {

    private Mediastore implementation = new Mediastore();

    @PluginMethod
    public void savePicture(PluginCall call) {
        String album = call.getString("album");
        String filename = call.getString("filename");
        String path = call.getString("path");
        if (path == null) {
            call.reject("path is required");
        } else if (path.startsWith("file:///")) {
            path = path.substring(8);
        }

        String uri;
        try {
            uri = implementation.savePicture(this.getActivity().getApplicationContext(), album, filename, path);
        } catch (Exception e) {
            call.reject(e.getMessage());
            return;
        }
        JSObject ret = new JSObject();
        ret.put("uri", uri);
        call.resolve(ret);
    }
}

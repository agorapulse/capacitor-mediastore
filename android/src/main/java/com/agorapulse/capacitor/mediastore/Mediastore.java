package com.agorapulse.capacitor.mediastore;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Mediastore {

    public String savePicture(Context context, String album, String filename, String path) throws Exception {
        // Add a specific media item.
        ContentResolver resolver = context.getContentResolver();

        //Get collection
        Uri pictureCollection;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            pictureCollection = MediaStore.Images.Media.getContentUri(MediaStore.VOLUME_EXTERNAL_PRIMARY);
        } else {
            pictureCollection = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        }

        //Publish picture
        ContentValues newPictureDetails = new ContentValues();
        newPictureDetails.put(MediaStore.Images.Media.DISPLAY_NAME, filename);
        if (album != null && Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            newPictureDetails.put(MediaStore.Images.Media.RELATIVE_PATH, "Pictures/" + album);
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            newPictureDetails.put(MediaStore.Images.Media.IS_PENDING, 1);
        }

        Uri pictureContentUri = resolver.insert(pictureCollection, newPictureDetails);

        FileInputStream input;
        try {
            ParcelFileDescriptor sourceFD = resolver.openFileDescriptor(Uri.fromFile(new File(path)), "r", null);
            input = new FileInputStream(sourceFD.getFileDescriptor());
        } catch (Exception e) {
            resolver.delete(pictureContentUri, null, null);
            throw new Exception("Unable to read file from path " + path + " - " + e.getMessage());
        }

        try {
            ParcelFileDescriptor targetFD = resolver.openFileDescriptor(pictureContentUri, "w", null);
            FileOutputStream output = new FileOutputStream(targetFD.getFileDescriptor());

            byte[] buffer = new byte[1024];
            int len;
            while ((len = input.read(buffer)) > 0) {
                output.write(buffer, 0, len);
            }
            output.flush();
            input.close();
            output.close();
        } catch (Exception e) {
            resolver.delete(pictureContentUri, null, null);
            throw  new Exception("Unable to write file - " + e.getMessage());
        }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            newPictureDetails.clear();
            newPictureDetails.put(MediaStore.Images.Media.IS_PENDING, 0);
            resolver.update(pictureContentUri, newPictureDetails, null, null);
        }
        return pictureContentUri.toString();
    }
}

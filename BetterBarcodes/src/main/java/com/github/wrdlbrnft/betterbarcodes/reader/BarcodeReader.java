package com.github.wrdlbrnft.betterbarcodes.reader;

import com.github.wrdlbrnft.betterbarcodes.BarcodeFormat;
import com.github.wrdlbrnft.betterbarcodes.reader.permissions.PermissionHandler;
import com.github.wrdlbrnft.proguardannotations.KeepClass;
import com.github.wrdlbrnft.proguardannotations.KeepClassMembers;

/**
 * Created with Android Studio<br>
 * User: kapeller<br>
 * Date: 25/01/16
 */
@KeepClass
@KeepClassMembers
public interface BarcodeReader {

    @KeepClassMembers
    interface Callback {
        void onResult(String text);
    }

    void startPreview();
    void startScanning();
    void stopScanning();
    void stopPreview();
    void setCallback(Callback callback);
    void setCameraPermissionHandler(PermissionHandler handler);

    void setFormat(@BarcodeFormat int... format);

    @BarcodeFormat
    int getFormat();
}

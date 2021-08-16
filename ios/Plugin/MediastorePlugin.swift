import Foundation
import Capacitor

/**
 * Please read the Capacitor iOS Plugin Development Guide
 * here: https://capacitorjs.com/docs/plugins/ios
 */
@objc(MediastorePlugin)
public class MediastorePlugin: CAPPlugin {
    private let implementation = Mediastore()

    @objc func savePicture(_ call: CAPPluginCall) {
        call.rejecct("iOS is not supported");
    }
}

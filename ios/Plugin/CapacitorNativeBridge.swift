import Foundation

@objc public class CapacitorNativeBridge: NSObject {
    @objc public func echo(_ value: String) -> String {
        print(value)
        return value
    }
}

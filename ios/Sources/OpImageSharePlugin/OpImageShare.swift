import Foundation

@objc public class OpImageShare: NSObject {
    @objc public func echo(_ value: String) -> String {
        print(value)
        return value
    }
}

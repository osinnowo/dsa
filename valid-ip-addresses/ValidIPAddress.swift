class ValidIPAddresses {
  func validIPAddresses(_ string: String) -> [String] {
    var result: [String] = []
    
    for i in stride(from: 0, to: string.count - 3, by: 1) {
      for j in stride(from: i + 1, to: string.count - 2, by: 1) {
        for k in stride(from: j + 1, to: string.count - 1, by: 1) {
          let p1StartIdx = string.index(string.startIndex, offsetBy: 0)
          let p1EndIdx = string.index(string.startIndex, offsetBy: i + 1)
          var p1 = string[p1StartIdx ..< p1EndIdx]

          let p2StartIdx = string.index(string.startIndex, offsetBy: i + 1)
          let p2EndIdx = string.index(string.startIndex, offsetBy: j + 1)
          var p2 = string[p2StartIdx ..< p2EndIdx]

          let p3StartIdx = string.index(string.startIndex, offsetBy: j + 1)
          let p3EndIdx = string.index(string.startIndex, offsetBy: k + 1)
          var p3 = string[p3StartIdx ..< p3EndIdx]

          let p4EndIdx = string.index(string.startIndex, offsetBy: k + 1)
          var p4 = string[p3EndIdx...]
          
          if(validIPPart(p1.toString()) && validIPPart(p2.toString()) && validIPPart(p3.toString()) && validIPPart(p4.toString())) {
            let address = "\(p1).\(p2).\(p3).\(p4)"
            result.append(address)
          } 
        } 
      }
    }
    return result
  }
  func validIPPart(_ part: String) -> Bool {
    return Int(part)! < 256 && (part.count > 1 && part.first! != "0" || part.count == 1)
  }
}

extension Substring {
  func toString() -> String {
    return String(self)
  }
}

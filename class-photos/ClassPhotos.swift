class ClassPhotos {
  func classPhotos(_ redShirtHeights: inout [Int], _ blueShirtHeights: inout [Int]) -> Bool {
    redShirtHeights.sort { $0 > $1 }
    blueShirtHeights.sort { $0 > $1 }
    var shirtColorInFirstRow = "BLUE"

    if redShirtHeights[0] < blueShirtHeights[0] {
      shirtColorInFirstRow = "RED"
    }

    for idx in 0 ..< redShirtHeights.count {
      let redShirtHeight = redShirtHeights[idx]
      let blueShirtHeight = blueShirtHeights[idx]
      if shirtColorInFirstRow == "RED" {
        if redShirtHeight >= blueShirtHeight {
          return false
        }
      } else {
        if blueShirtHeight >= redShirtHeight {
          return false
        }
      }
    }
    
    return true
  }
}

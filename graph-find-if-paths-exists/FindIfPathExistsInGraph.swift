class FindIfPathExistsInGraph {
    func validPath(_ n: Int, _ edges: [[Int]], _ source: Int, _ destination: Int) -> Bool {
        var adjacencyList: [Int: [Int]] = [:]
        buildGraph(edges, &adjacencyList)

        var visited: Set<Int> = []
        var queue: [Int] = [source]
        visited.insert(source)

        while !queue.isEmpty {
            let current = queue.removeFirst()

            if current == destination {
                return true
            }

            guard let neighbors = adjacencyList[current] else { continue }

            for neighbor in neighbors {
                if !visited.contains(neighbor) {
                    queue.append(neighbor)
                    visited.insert(neighbor)
                }
            }
        }

        return false
    }

    func buildGraph(_ edges: [[Int]], _ adjacencyList: inout [Int: [Int]]) {
        for edge in edges {
            let u = edge[0]
            let v = edge[1]
            adjacencyList[u, default: []].append(v)
            adjacencyList[v, default: []].append(u)
        }
    }
}
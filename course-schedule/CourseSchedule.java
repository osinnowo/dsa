import java.util.*;

class CourseSchedule {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        // Create an adjacency list to represent the graph
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }

        // Populate the adjacency list with prerequisite dependencies
        for (int[] prerequisite : prerequisites) {
            int course = prerequisite[0];
            int prerequisiteCourse = prerequisite[1];
            graph.get(prerequisiteCourse).add(course);
        }

        // Create an array to track the number of prerequisites for each course
        int[] prerequisitesCount = new int[numCourses];
        for (int[] prerequisite : prerequisites) {
            prerequisitesCount[prerequisite[0]]++;
        }

        // Perform topological sorting using Kahn's algorithm
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (prerequisitesCount[i] == 0) {
                queue.offer(i);
            }
        }

        int coursesTaken = 0;
        while (!queue.isEmpty()) {
            int course = queue.poll();
            coursesTaken++;

            for (int dependentCourse : graph.get(course)) {
                prerequisitesCount[dependentCourse]--;
                if (prerequisitesCount[dependentCourse] == 0) {
                    queue.offer(dependentCourse);
                }
            }
        }

        // Check if all courses were taken (no cycles)
        return coursesTaken == numCourses;
    }
}

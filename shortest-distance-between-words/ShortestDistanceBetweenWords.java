class ShortestDistanceBetweenWords {
    public int shortestDistance(String[] wordsDict, String word1, String word2) {
        int markerOne = -1;
        int markerTwo = -1;
        int smallestDistance = Integer.MAX_VALUE;

        for (int i = 0; i < wordsDict.length; i++) {
            if (wordsDict[i].equals(word1)) {
                markerOne = i;
                if (markerTwo != -1) {
                    smallestDistance = Math.min(smallestDistance, Math.abs(markerOne - markerTwo));
                }
            } else if (wordsDict[i].equals(word2)) {
                markerTwo = i;
                if (markerOne != -1) {
                    smallestDistance = Math.min(smallestDistance, Math.abs(markerOne - markerTwo));
                }
            }
        }

        return smallestDistance;
    }
}
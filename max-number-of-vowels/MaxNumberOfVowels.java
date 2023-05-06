class Solution {
    
    public int maxVowels(String s, int k) {
        int maxCount = 0;
        int currentCount = 0;
        int start = 0;

        // Create a set of vowels for efficient lookup
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

        // Iterate over the first k characters and count the vowels
        for (int i = 0; i < k; i++) {
            if (vowels.contains(s.charAt(i))) {
                currentCount++;
            }
        }

        maxCount = currentCount;

        // Iterate over the remaining characters
        for (int i = k; i < s.length(); i++) {
            // Decrement count for the character going out of the window
            if (vowels.contains(s.charAt(start))) {
                currentCount--;
            }

            // Increment count for the new character coming into the window
            if (vowels.contains(s.charAt(i))) {
                currentCount++;
            }

            // Update the maximum count if necessary
            maxCount = Math.max(maxCount, currentCount);

            // Move the start of the window
            start++;
        }

        return maxCount;
    }
}
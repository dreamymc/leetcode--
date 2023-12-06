import java.util.Arrays;

public class MaximumScoreWordsFormedbyLetters {
    public int maxScoreWords(String[] words, char[] letters, int[] score) {
        int[] letterCount = new int[26];
        for (char letter : letters) 
            letterCount[letter - 'a']++;
        

        return backtrack(0, words, score, letterCount);
    }

    private int backtrack(int index, String[] words, int[] score, int[] letterCount) {
        if (index == words.length) 
            return 0;
        int maxScore = 0;
        int[] tempLetterCount = Arrays.copyOf(letterCount, 26);
        // Try to use the current word
        boolean canUseWord = true;
        int wordScore = 0;
        for (char letter : words[index].toCharArray()) {
            int letterIndex = letter - 'a';
            tempLetterCount[letterIndex]--;
            wordScore += score[letterIndex];
            if (tempLetterCount[letterIndex] < 0) 
                canUseWord = false; // Cannot use the word if there are not enough letters
        }

        if (canUseWord) 
            maxScore = Math.max(wordScore + backtrack(index + 1, words, score, tempLetterCount), maxScore);
        

        // Try to skip the current word
        maxScore = Math.max(maxScore, backtrack(index + 1, words, score, letterCount));

        return maxScore;
    }

    public static void main(String[] args) {
        MaximumScoreWordsFormedbyLetters solution = new MaximumScoreWordsFormedbyLetters();
        String[] words1 = { "dog", "cat", "dad", "good" };
        char[] letters1 = { 'a', 'a', 'c', 'd', 'd', 'd', 'g', 'o', 'o' };
        int[] score1 = { 1, 0, 9, 5, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        System.out.println(solution.maxScoreWords(words1, letters1, score1)); // Output: 23

        String[] words2 = { "xxxz", "ax", "bx", "cx" };
        char[] letters2 = { 'z', 'a', 'b', 'c', 'x', 'x', 'x' };
        int[] score2 = { 4, 4, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 10 };
        System.out.println(solution.maxScoreWords(words2, letters2, score2)); // Output: 27

        String[] words3 = { "leetcode" };
        char[] letters3 = { 'l', 'e', 't', 'c', 'o', 'd' };
        int[] score3 = { 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0 };
        System.out.println(solution.maxScoreWords(words3, letters3, score3)); // Output: 0
    }
}

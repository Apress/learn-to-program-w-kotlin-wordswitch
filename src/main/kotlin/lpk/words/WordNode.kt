package lpk.words

/**
 * Generates one-letter variants of a word.
 */
data class WordNode(val text: String) {
    fun variantsByOneLetter(checker: WordChecker): List<WordNode> {
        val result = mutableListOf<WordNode>()
        return result
    }
}
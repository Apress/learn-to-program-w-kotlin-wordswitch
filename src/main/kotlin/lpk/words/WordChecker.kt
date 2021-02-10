package lpk.words

/**
 * Checks that potential new words are in the dictionary
 * and have not previously been seen.
 */
class WordChecker(val dictionary: Dictionary) {

    val wordsSoFar = mutableSetOf<String>()

    fun isPreviouslyUnseenValidWord(string: String): Boolean {
        return false
    }
}

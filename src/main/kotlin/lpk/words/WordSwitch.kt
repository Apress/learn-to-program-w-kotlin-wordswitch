package lpk.words

import java.nio.file.Paths

/**
 * Implements the Word Switch algorithm.
 */
class WordSwitch(dictionary: Dictionary, start: String, val target: String) {

    val startNode: WordNode
    val checker: WordChecker

    init {
        startNode = WordNode(start)
        checker = WordChecker(dictionary)
    }

    fun lookForTarget(): WordNode? {
        //Declare a variable to hold the new words that get created
        //in each generation. Initialise it with the words generated
        //by the start word.

        //Have a loop to create new generations so long as these
        //contain new words and the target is not found.

        return null
    }
}

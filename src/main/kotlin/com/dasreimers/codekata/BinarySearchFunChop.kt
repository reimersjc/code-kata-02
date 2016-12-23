package com.dasreimers.codekata

/**
 * This is a cheat... A simple call to the provided IntArray.binarySearch function.
 */
class BinarySearchFunChop : Chop {

    override fun chop(key: Int, array: IntArray): Int {
        val index = array.binarySearch(key)
        if (index <= -1) {
            // IntArray.binarySearch returns the inverted insertion point when not found
            // We simply want to return -1 when the element is not found
            return -1
        } else {
            return index
        }
    }
}
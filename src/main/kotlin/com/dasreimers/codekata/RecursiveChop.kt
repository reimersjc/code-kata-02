package com.dasreimers.codekata

/**
 * Traditional recursive binary search.
 */
class RecursiveChop : Chop {

    override fun chop(key: Int, array: IntArray): Int {
        return chop(key, array, 0, array.size - 1)
    }

    private fun chop(key: Int, array: IntArray, low: Int, high: Int): Int {
        if (low > high) {
            return -1
        }
        val mid = (low + high) / 2
        if (array[mid] == key) {
            return mid
        } else if (array[mid] < key) {
            return chop(key, array, mid + 1, high)
        } else {
            return chop(key, array, low, mid - 1)
        }
    }
}
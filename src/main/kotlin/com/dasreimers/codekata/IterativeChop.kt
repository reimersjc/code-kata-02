package com.dasreimers.codekata

/**
 * Traditional iterative binary search.
 */
class IterativeChop : Chop {

    override fun chop(key: Int, array: IntArray): Int {
        var low = 0
        var high = array.size - 1
        while (low <= high) {
            val mid = (low + high) / 2
            if (key < array[mid]) {
                high = mid -1
            } else if (key > array[mid]) {
                low = mid + 1
            } else {
                return mid
            }
        }
        return -1
    }
}
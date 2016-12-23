package com.dasreimers.codekata

/**
 * Binary search that recursively slices the array until the
 * key is found or there are no more elements left.
 */
class RecursiveSpliceChop : Chop {

    override fun chop(key: Int, array: IntArray): Int {
        if (array.isEmpty()) {
            return -1
        }

        val mid = (array.size - 1) / 2

        if (key < array[mid]) {
            return chop(key, array.sliceArray(0..mid-1))
        } else if (key > array[mid]) {
            val index = chop(key, array.sliceArray(mid+1..array.lastIndex))
            if (index == -1) {
                // not found, so return -1
                return index
            } else {
                // apply index offset
                return index + (mid + 1)
            }
        } else {
            return mid
        }
    }
}
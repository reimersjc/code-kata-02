package com.dasreimers.codekata

/**
 * An iterative binary search by slicing the array
 */
class IterativeSpliceChop : Chop {

    override fun chop(key: Int, array: IntArray): Int {
        if (array.isEmpty()) {
            return -1
        }

        var mutableArray = array.clone()
        var offset = 0

        while (mutableArray.isNotEmpty()) {
            val mid = (mutableArray.size - 1) / 2
            if (key < mutableArray[mid]) {
                mutableArray = mutableArray.sliceArray(0..mid-1)
            } else if (key > mutableArray[mid]) {
                mutableArray = mutableArray.sliceArray(mid+1..mutableArray.lastIndex)
                offset += (mid + 1)
            } else {
                return mid + offset
            }
        }

        return -1
    }
}
package com.dasreimers.codekata

/**
 * Binary chop
 */
interface Chop {

    /**
     * A binary chop method that takes an integer search target and a sorted array
     * of integers. It returns the integer index of the target in the array, or -1
     * if the target is not in the array.
     *
     * @param key the target to search for
     * @param array the sorted array to search
     * @return the integer index of the the target in the array, or -1 if the target is not in the array
     */
    fun chop(key: Int, array: IntArray): Int

}
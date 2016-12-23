package com.dasreimers.codekata

import org.jetbrains.spek.api.SubjectSpek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import kotlin.test.assertEquals

/**
 * Created by jason on 12/22/16.
 */
class BinarySearchFunChopSpec : SubjectSpek<BinarySearchFunChop>({

    subject { BinarySearchFunChop() }

    describe("a recursive binary search using the IntArray.binarySearch function") {

        it("should return -1 when array is empty") {
            assertEquals(-1, subject.chop(3, intArrayOf()))
        }

        it("should return -1 when key is not in array of one element") {
            assertEquals(-1, subject.chop(3, intArrayOf(1)))
        }

        it("should return 0 when key is at first index") {
            assertEquals(0, subject.chop(1, intArrayOf(1)))
        }

        it("should return 1 when key is at second index") {
            assertEquals(1, subject.chop(3, intArrayOf(1, 3, 5)))
        }

        it("should return 2 when key is at third index") {
            assertEquals(2, subject.chop(5, intArrayOf(1, 3, 5)))
        }

        it("should return -1 when key is not in array of multiple elements") {
            assertEquals(-1, subject.chop(6, intArrayOf(1, 3, 5, 7)))
        }

        it("should return 2 when key is at third index of an array of 4 elements") {
            assertEquals(2, subject.chop(5, intArrayOf(1, 3, 5, 7)))
        }

        it("should return -1 when key is not in array of 4 elements") {
            assertEquals(-1, subject.chop(8, intArrayOf(1, 3, 5, 7)))
        }
    }
})
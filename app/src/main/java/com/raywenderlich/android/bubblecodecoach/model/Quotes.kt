/*
 * Copyright (c) 2020 Razeware LLC
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * Notwithstanding the foregoing, you may not use, copy, modify, merge, publish,
 * distribute, sublicense, create a derivative work, and/or sell copies of the
 * Software in any work that is designed, intended, or marketed for pedagogical or
 * instructional purposes related to programming, coding, application development,
 * or information technology.  Permission for such use, copying, modification,
 * merger, publication, distribution, sublicensing, creation of derivative works,
 * or sale is expressly withheld.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.raywenderlich.android.bubblecodecoach.model

object Quotes {
  private val quotes = listOf<Quote>(
      Quote(
          "“As long as you are learning, you are not failing.”",
          "  - Bob Ross"),
      Quote(
          "“I'm not a great programmer; I'm just a good " +
              "programmer with great habits.”",
          "  - Kent Beck"),
      Quote(
          "“Is it possible that software is not like anything else, that it is meant" +
              " to be discarded: that the whole point is to always see it as a soap bubble?”",
          " -  Alan J Perlis"),
      Quote(
          "“The only way to go fast, is to go well.”",
          " -  Robert C Martin"),
      Quote(
          "“I'm a programmer. I like programming. And the best way I've found to " +
              "have a positive impact on code is to write it.”",
          " -  Robert C Martin"),
      Quote(
          "“If you can write \"hello world\" you can change the world.”",
          " -  Raghu Venkatesh"),
      Quote(
          "“Everyday life is like programming, I guess. " +
              "If you love something you can put beauty into it.”",
          " -  Donald Knuth"),
      Quote(
          "“Programming isn't about what you know; it's about what you can figure out.”",
          " -  Robert C Martin"),
      Quote(
          "“Not all roots are buried down in the ground, some " +
              "are at the top of a tree.”", " -  Robert C Martin"),
      Quote(
          "“The perfect kind of architecture decision is the one which never has to be made.”",
          " -  Robert C Martin")
  )

  val randomQuote
    get() = quotes.random()
}
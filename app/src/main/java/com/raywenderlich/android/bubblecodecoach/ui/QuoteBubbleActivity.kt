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

package com.raywenderlich.android.bubblecodecoach.ui

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.raywenderlich.android.bubblecodecoach.R
import com.raywenderlich.android.bubblecodecoach.databinding.ActivityQuoteBubbleBinding
import kotlinx.android.synthetic.main.activity_quote_bubble.*

class QuoteBubbleActivity : AppCompatActivity() {

  private lateinit var viewModel: QuoteBubbleViewModel
  private lateinit var binding: ActivityQuoteBubbleBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    binding = DataBindingUtil.setContentView(this,
        R.layout.activity_quote_bubble)
    binding.setLifecycleOwner(this)
    viewModel = ViewModelProviders.of(this).get(
        QuoteBubbleViewModel::class.java)

    quoteTextView.text = viewModel.repository.currentQuote.quoteText
    authorTextView.text = viewModel.repository.currentQuote.author

    viewModel.quoteLiveData
        .observe(this, Observer { quote ->
          quote?.let {
            quoteTextView.text = quote.quoteText
            authorTextView.text = quote.author
          }
        })

    newQuoteButton.setOnClickListener {
      viewModel.updateQuote()
    }
  }

  override fun onResume() {
    super.onResume()
    Log.d("Resume", "Resume")
    quoteTextView.text = viewModel.repository.currentQuote.quoteText
    authorTextView.text = viewModel.repository.currentQuote.author
  }
}

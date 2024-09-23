package com.example.bookify

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.bookify.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bookTitle = intent.getStringExtra("book_title").orEmpty()
        val bookDescription = intent.getStringExtra("book_description").orEmpty()
        val bookPDF = intent.getStringExtra("book_pdf").orEmpty()
        val bookImage = intent.getIntExtra("book_image", 0)

        binding.apply {
            mBooktitle.text = bookTitle
            mBookDesc.text = bookDescription
            mBookimage.setImageResource(bookImage)

            mReadBookbtn.setOnClickListener {
                val intent = Intent(this@DetailActivity, PDFactivity::class.java).apply {
                    putExtra("book_pdf", bookPDF)
                }
                startActivity(intent)
            }
        }
    }
}

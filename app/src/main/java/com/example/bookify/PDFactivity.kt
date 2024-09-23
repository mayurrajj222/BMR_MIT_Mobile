package com.example.bookify

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.bookify.databinding.ActivityPdfactivityBinding
import com.rajat.pdfviewer.PdfViewerActivity
import com.rajat.pdfviewer.util.saveTo

class PDFactivity : AppCompatActivity() {
    val activity = this
    lateinit var binding: ActivityPdfactivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPdfactivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()
        val bookPDF = intent.getStringExtra("book_pdf").toString()
        binding.apply {
            launchPdfFromAssets(bookPDF)
        }
    }
        private fun launchPdfFromAssets(uri: String) {
            startActivity(
                PdfViewerActivity.launchPdfFromPath(
                    context = activity,
                    path = "assets",
                    pdfTitle = "Bookify",
                    saveTo = saveTo.ASK_EVERYTIME,
                    fromAssets = true)
            )

    }


    }


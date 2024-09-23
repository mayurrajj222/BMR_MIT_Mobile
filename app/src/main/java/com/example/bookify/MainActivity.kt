package com.example.bookify

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.bookify.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    val activity = this
    val list :ArrayList<BooksModel> = ArrayList()
    val adapter = BooksAdapter(list,activity)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)
        binding.apply {
            mRecyclerViewHome.adapter = adapter
            list.add(BooksModel(R.drawable.book2,"Gojo_Saturo","Gojo Satoru is a prominent character from the anime and manga series Jujutsu Kaisen. He is a powerful jujutsu sorcerer known for his striking white hair and blindfold or sunglasses that conceal his exceptional eye techniques. As one of the strongest sorcerers, Gojo possesses immense combat skills and confidence, often using humor and a laid-back demeanor to mask his serious nature. He serves as a mentor to the series' protagonist, teaching him about the world of jujutsu and the challenges they face against cursed spirits.","gojo_doc.pdf"))
            list.add(BooksModel(R.drawable.book_2,"Book","Book_Description","gojo_doc.pdf"))
            list.add(BooksModel(R.drawable.book_3,"Book_Title","Book_Description","quotes.pdf"))
            list.add(BooksModel(R.drawable.book_4,"Book_Title","Book_Description","sample_book.pdf"))
            list.add(BooksModel(R.drawable.book_5,"Book_Title","Book_Description","sample_book.pdf"))

        }


        }
    }

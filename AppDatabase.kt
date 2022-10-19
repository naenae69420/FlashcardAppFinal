package com.example.flashcardnewapp

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.flashcardnewapp.Flashcard
import com.example.flashcardnewapp.FlashcardDao

@Database(entities = [Flashcard::class], version = 1)

abstract class AppDatabase : RoomDatabase() {
    abstract fun flashcardDao(): FlashcardDao
}

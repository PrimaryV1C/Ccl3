package com.cc221020.ccl3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.material3.Surface
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.compose.runtime.getValue

class MainActivity : ComponentActivity() {
    /*private val db by lazy {
        Room.databaseBuilder(this, ItemDatabase::class.java, "ShelfItems.db")
            .addMigrations(ItemDatabase.MIGRATION_1_2)
            .build()
    }*/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
                // A surface container using the 'background' color from the them
                Surface(
                ) {
                    /*val mainViewModel: MainViewModel by viewModels {
                        object : ViewModelProvider.Factory {
                            override fun <T : ViewModel> create(modelClass: Class<T>): T {
                                return MainViewModel(db.dao) as T
                            }
                        }
                    }*/

                    //MainView(mainViewModel)
                }
        }
    }
}

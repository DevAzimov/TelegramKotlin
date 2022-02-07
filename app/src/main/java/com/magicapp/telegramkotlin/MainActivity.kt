package com.magicapp.telegramkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.magicapp.telegramkotlin.adapter.ChatAdapter
import com.magicapp.telegramkotlin.model.Chat

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    fun initViews(){
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.setLayoutManager(GridLayoutManager(this, 1))

        refreshAdapter(getAllChats())
    }

    fun refreshAdapter(chats: ArrayList<Chat>) {
        val adapter = ChatAdapter(this, chats)
        recyclerView!!.adapter = adapter
    }

    fun getAllChats(): ArrayList<Chat>{
        val chats: ArrayList<Chat> = ArrayList()
        chats.add(Chat(R.drawable.muslim, "Muslim", "Yes you are the best Muslim"))
        chats.add(Chat(R.drawable.muslim, "Muslim", "Yes you are the best Muslim"))
        chats.add(Chat(R.drawable.muslim, "Muslim", "Yes you are the best Muslim"))
        chats.add(Chat(R.drawable.muslim, "Muslim", "Yes you are the best Muslim"))
        chats.add(Chat(R.drawable.muslim, "Muslim", "Yes you are the best Muslim"))
        chats.add(Chat(R.drawable.muslim, "Muslim", "Yes you are the best Muslim"))
        chats.add(Chat(R.drawable.muslim, "Muslim", "Yes you are the best Muslim"))
        chats.add(Chat(R.drawable.muslim, "Muslim", "Yes you are the best Muslim"))
        chats.add(Chat(R.drawable.muslim, "Muslim", "Yes you are the best Muslim"))
        chats.add(Chat(R.drawable.muslim, "Muslim", "Yes you are the best Muslim"))
        chats.add(Chat(R.drawable.muslim, "Muslim", "Yes you are the best Muslim"))
        chats.add(Chat(R.drawable.muslim, "Muslim", "Yes you are the best Muslim"))
        return chats
    }

}
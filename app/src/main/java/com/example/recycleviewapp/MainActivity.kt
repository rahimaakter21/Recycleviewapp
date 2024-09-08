package com.example.recycleviewapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recycleviewapp.Module.Player
import com.example.recycleviewapp.adapter.PlayerAdapter
import com.example.recycleviewapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private  lateinit var  binding:ActivityMainBinding
    private val player =ArrayList<Player>()
    override fun onCreate(savedInstanceState: Bundle?) {
        binding=ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.recyclerView.layoutManager = LinearLayoutManager(this)

        player.add(Player("orange","fruit",R.drawable.orange))
        player.add(Player("orange","fruit",R.drawable.orange))
        player.add(Player("orange","fruit",R.drawable.orange))
        player.add(Player("orange","fruit",R.drawable.orange))
        player.add(Player("orange","fruit",R.drawable.orange))
        player.add(Player("orange","fruit",R.drawable.orange))
        player.add(Player("orange","fruit",R.drawable.orange))
        player.add(Player("orange","fruit",R.drawable.orange))
        player.add(Player("orange","fruit",R.drawable.orange))
        player.add(Player("orange","fruit",R.drawable.orange))
        player.add(Player("orange","fruit",R.drawable.orange))
        player.add(Player("orange","fruit",R.drawable.orange))
        player.add(Player("strawberry","fruit",R.drawable.strawbarry))
        player.add(Player("strawberry","fruit",R.drawable.strawbarry))
        player.add(Player("strawberry","fruit",R.drawable.strawbarry))
        player.add(Player("strawberry","fruit",R.drawable.strawbarry))
        player.add(Player("strawberry","fruit",R.drawable.strawbarry))
        player.add(Player("strawberry","fruit",R.drawable.strawbarry))
        val playerAdapter  = PlayerAdapter(player)
        binding.recyclerView.adapter= playerAdapter
    }
}
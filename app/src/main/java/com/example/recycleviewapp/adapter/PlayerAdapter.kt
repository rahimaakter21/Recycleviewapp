package com.example.recycleviewapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleviewapp.Module.Player

import com.example.recycleviewapp.databinding.ItemListBinding

class PlayerAdapter(private  val playerList:ArrayList<Player>) : RecyclerView.Adapter<PlayerAdapter.PlayerViewHolder>() {

    class PlayerViewHolder (val binding: ItemListBinding): RecyclerView.ViewHolder(binding.root){


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlayerViewHolder {
      val view =ItemListBinding.inflate((LayoutInflater.from(parent.context)), parent,false)

        return  PlayerViewHolder(view)
    }

    override fun getItemCount(): Int {
      return  playerList.size
    }

    override fun onBindViewHolder(holder: PlayerViewHolder, position: Int) {
       val player=playerList[position]
        holder.binding.apply {
            profileName.text=player.playerBName
            profileDescription.text=player.playerDescription
            profileImage.setImageResource(player.playerImage)
    }
}
}
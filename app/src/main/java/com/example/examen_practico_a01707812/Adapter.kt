package com.example.examen_practico_a01707812
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.examen_practico_a01707812.databinding.ListElementBinding


class Adapter(private val itemList: List<ListItemData>) : RecyclerView.Adapter<Adapter.MyViewHolder>() {


    data class ListItemData(val text: String, val imageResource: Int)

    inner class MyViewHolder(private val binding: ListElementBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(item: ListItemData) {
            binding.itemText.text = item.text
            binding.itemImage.setImageResource(item.imageResource)
            // Aquí puedes configurar más elementos del diseño, como imágenes, botones, etc.
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding = ListElementBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(itemList[position])
    }


    override fun getItemCount(): Int {
        return itemList.size
    }
}

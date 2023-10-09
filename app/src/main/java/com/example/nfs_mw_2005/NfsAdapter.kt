package com.example.nfs_mw_2005

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.nfs_mw_2005.databinding.ItemNfsBinding

class NfsAdapter(
    private var list: ArrayList<NfsModel>,
    var onClick : (nfsModel : NfsModel )-> Unit
):Adapter<NfsAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
      return ViewHolder(ItemNfsBinding.inflate(LayoutInflater.from(parent.context),parent, false))
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       holder.bind()
    }



    inner class ViewHolder(private var binding: ItemNfsBinding): RecyclerView.ViewHolder(binding.root){
        @SuppressLint("SuspiciousIndentation")
        fun bind(){
        val item = list[adapterPosition]
            binding.run {
                tvCarName.text = item.carName
                tvName.text = item.name
                tvNumber.text = item.number
               // ivCar.loadImage(item.imageCar)
                ivCar.setImageResource(item.imageCar)
            }
            itemView.setOnClickListener{
                onClick.invoke(item)
            }
        }
    }


}
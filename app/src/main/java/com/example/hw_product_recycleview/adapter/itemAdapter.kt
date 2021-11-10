package com.example.hw_product_recycleview.adapter
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.view.isVisible
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.hw_product_recycleview.*
import com.example.hw_product_recycleview.data.DataSource


class itemAdapter(private val context: Context?): RecyclerView.Adapter<itemAdapter.ItemViewHolder>() {
   private val dataset = DataSource().loadMobile()


    class ItemViewHolder(view : View): RecyclerView.ViewHolder(view){
        val textName : TextView = view.findViewById(R.id.PName)
        val textPrice : TextView = view.findViewById(R.id.PP)
        val textVip : View = view.findViewById(R.id.image2)
        val imageView : ImageView = view.findViewById(R.id.imageView)
        val ButBuy : Button = view.findViewById(R.id.Button)

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.list_item2,parent,false)
        return ItemViewHolder(adapterLayout)


    }
    override fun getItemCount(): Int {
        return dataset.size
    }
///////////////////////////////////-------------------------------------------------------------------->
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]

        holder.imageView .setImageResource(item.imageResourcId)
        holder.textName.text = item.stringResourceName
        holder.textPrice.text = item.stringResourcePrice
        holder.textVip.isVisible = if (item.stringResourceVip){true}else{false}

        holder.ButBuy.setOnClickListener {
            if(item.stringResourceqn > 0) {
                var action = mobileListDirections.actionMobileListToBuyphone(namePhone = item.stringResourceName,imageId = item.imageResourcId)
                holder.itemView.findNavController().navigate(action)
            } else{
                Toast.makeText(context, "not Availabe", Toast.LENGTH_SHORT).show()
            }

        }


    }


  }


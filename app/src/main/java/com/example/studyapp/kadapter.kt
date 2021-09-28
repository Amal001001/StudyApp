package com.example.studyapp

import android.app.Activity
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.studyapp.databinding.ItemCustomRowBinding


class kadapter (private val activity: Activity, private val items: ArrayList<ArrayList<String>>):
    RecyclerView.Adapter<kadapter.ItemViewHolder>() {
    class ItemViewHolder(val binding: ItemCustomRowBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(
            ItemCustomRowBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.binding.apply {
            tvtitle.text = items[position][0]
            tvdescription.text = items[position][1]
            cvcard.setOnClickListener {
                CustomAlertDialog(
                    activity,
                    items[position][0],
                    items[position][2]
                )
            }
        }
    }

    override fun getItemCount() = items.size
}
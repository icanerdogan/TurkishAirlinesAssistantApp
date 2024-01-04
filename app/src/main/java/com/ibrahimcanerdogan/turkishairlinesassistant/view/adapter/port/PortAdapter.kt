package com.ibrahimcanerdogan.turkishairlinesassistant.view.adapter.port

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.ibrahimcanerdogan.turkishairlinesassistant.databinding.ItemAirlinesPortBinding
import com.ibrahimcanerdogan.turkishairlinesassistant.model.port.response.PortResponseInfo

class PortAdapter : RecyclerView.Adapter<PortViewHolder>(){

    private val diffUtil = object : DiffUtil.ItemCallback<PortResponseInfo>() {
        override fun areItemsTheSame(oldItem: PortResponseInfo, newItem: PortResponseInfo): Boolean {
            return oldItem.portResponseInfoID == newItem.portResponseInfoID
        }

        override fun areContentsTheSame(oldItem: PortResponseInfo, newItem: PortResponseInfo): Boolean {
            return oldItem == newItem
        }
    }

    private val differ = AsyncListDiffer(this, diffUtil)

    fun setData(newList : List<PortResponseInfo>) {
        differ.submitList(newList)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PortViewHolder {
        val binding = ItemAirlinesPortBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PortViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return differ.currentList.size
    }

    override fun onBindViewHolder(holder: PortViewHolder, position: Int) {
        differ.currentList[position]?.let {
            holder.bind(it)
        }
    }

}
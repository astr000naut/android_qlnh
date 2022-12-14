package com.example.sample.ui.quanly.tablemanage.adapter

import androidx.recyclerview.widget.DiffUtil
import com.example.sample.model.Area

class TM_AreaDiffItemCallback: DiffUtil.ItemCallback<Area>() {
    override fun areItemsTheSame(oldItem: Area, newItem: Area): Boolean
    = (oldItem.khuvuc == newItem.khuvuc)

    override fun areContentsTheSame(oldItem: Area, newItem: Area): Boolean
    = (oldItem == newItem)
}
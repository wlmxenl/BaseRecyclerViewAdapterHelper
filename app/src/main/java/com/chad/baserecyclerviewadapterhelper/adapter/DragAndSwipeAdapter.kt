package com.chad.baserecyclerviewadapterhelper.adapter

import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import com.chad.baserecyclerviewadapterhelper.R
import com.chad.library.adapter.base.module.DraggableModule

class DragAndSwipeAdapter(data: MutableList<String>) : BaseQuickAdapter<String, BaseViewHolder>(R.layout.item_draggable_view, data), DraggableModule {

    override fun convert(holder: BaseViewHolder, item: String) {
        when (holder.layoutPosition % 3) {
            0 -> holder.setImageResource(R.id.iv_head, R.mipmap.head_img0)
            1 -> holder.setImageResource(R.id.iv_head, R.mipmap.head_img1)
            2 -> holder.setImageResource(R.id.iv_head, R.mipmap.head_img2)
            else -> {}
        }
        holder.setText(R.id.tv, item)
    }
}
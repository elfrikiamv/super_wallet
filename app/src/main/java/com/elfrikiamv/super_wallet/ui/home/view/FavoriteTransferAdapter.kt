package com.elfrikiamv.super_wallet.ui.home.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.elfrikiamv.super_wallet.R
import com.elfrikiamv.super_wallet.ui.home.FavoriteTransfer

class FavoriteTransferAdapter : RecyclerView.Adapter<FavoriteTransferViewHolder>() {

    private var favoriteTransferItems: List<FavoriteTransfer> = arrayListOf()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FavoriteTransferViewHolder =
        FavoriteTransferViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.favorite_transfer_row,
                parent,
                false
            )
        )

    override fun getItemCount(): Int = favoriteTransferItems.size
    override fun onBindViewHolder(holder: FavoriteTransferViewHolder, position: Int) =
        holder.bind(favoriteTransferItems[position])

    fun setData(favoriteTransferItems: List<FavoriteTransfer>) {
        this.favoriteTransferItems = favoriteTransferItems
        notifyDataSetChanged()
    }
}
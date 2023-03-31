package com.elfrikiamv.super_wallet.ui.home

interface HomeContract {

    interface View {

        fun showLoader()
        fun hideLoader()
        fun showFavoriteTransfers(favoriteTransfers: List<FavoriteTransfer>)
    }

    interface Presenter {
        fun retrieveFavoriteTransfers()
    }

    interface OnResponseCAllback {
        fun onResponse(favoriteList: List<FavoriteTransfer>)
    }
}
package com.elfrikiamv.super_wallet.ui.home.presenter

import com.elfrikiamv.super_wallet.ui.home.FavoriteTransfer
import com.elfrikiamv.super_wallet.ui.home.HomeContract
import com.elfrikiamv.super_wallet.ui.home.data.HomeInteractor

class HomePresenter(private val view: HomeContract.View) : HomeContract.Presenter {

    private val homeInteractor = HomeInteractor()

    override fun retrieveFavoriteTransfers() {

        view.showLoader()
        homeInteractor.retrieveFavoriteTransferFromCache(object : HomeContract.OnResponseCAllback {
            override fun onResponse(favoriteList: List<FavoriteTransfer>) {

                view.hideLoader()
                view.showFavoriteTransfers(favoriteList)
            }
        })
    }
}
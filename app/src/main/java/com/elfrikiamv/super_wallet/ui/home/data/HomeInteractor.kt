package com.elfrikiamv.super_wallet.ui.home.data

import android.os.Handler
import com.elfrikiamv.super_wallet.ui.home.FavoriteTransfer
import com.elfrikiamv.super_wallet.ui.home.HomeContract

class HomeInteractor {

    fun retrieveFavoriteTransferFromCache(responseCAllback: HomeContract.OnResponseCAllback) {

        val items = ArrayList<FavoriteTransfer>()
        items.add(
            FavoriteTransfer(
                0,
                "friki 1",
                456.000,
                "Hace 2h",
                "https://avatars.githubusercontent.com/u/83109427?v=4"
            )
        )
        items.add(
            FavoriteTransfer(
                1,
                "friki 2",
                210.900,
                "Ayer",
                "https://krausefx.com/assets/posts/profilePictures/FelixKrause2016.jpg"
            )
        )
        items.add(
            FavoriteTransfer(
                2,
                "friki 3",
                456.000,
                "Hace 2h",
                "https://www.oliverwyman.com/content/dam/oliver-wyman/v2/careers/profiles/scottbk-profile-460x460.jpg"
            )
        )
        items.add(
            FavoriteTransfer(
                3,
                "friki 4",
                456.000,
                "Hace 2h",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRTw8mKnjVErhmhl5S_aUZfvf86vwZOMJBqbUqM-guT-kv6K4xu&s"
            )
        )
        items.add(
            FavoriteTransfer(
                4,
                "friki 5",
                456.000,
                "Hace 2h",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTVSEHZQ2HJu9FEzFLU4yEAUv46sfRQjxUYkiVv7IEFxNndQ_7C&s"
            )
        )

        val runnable = Runnable {
            responseCAllback.onResponse(items)
        }
        val handler = Handler()
        handler.postDelayed(runnable, 3000)
    }
}
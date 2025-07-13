package com.letjustunfold.cryptotracker.crypto.presentation.coin_list

import com.letjustunfold.cryptotracker.core.domain.util.NetworkError

sealed interface CoinListEvent {
    data class Error(val error: NetworkError): CoinListEvent
}
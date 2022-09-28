package com.adsmanager.ads.di

import com.adsmanager.ads.AdsManager
import com.adsmanager.ads.AdsManagerOpenAd
import com.adsmanager.ads.HandleAds
import org.koin.dsl.module

val adsManagerModule = module {
    single { HandleAds() }
    single { AdsManager(get()) }
    single { AdsManagerOpenAd() }
}
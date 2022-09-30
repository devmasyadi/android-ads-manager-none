package com.adsmanager.ads

import android.app.Activity
import android.content.Context
import android.widget.RelativeLayout
import com.adsmanager.core.CallbackAds
import com.adsmanager.core.IRewards
import com.adsmanager.core.NetworkAds
import com.adsmanager.core.iadsmanager.IInitialize
import com.adsmanager.core.iadsmanager.SizeBanner
import com.adsmanager.core.iadsmanager.SizeNative

class HandleAds(

) {
    fun initialize(
        context: Context,
        appId: String?,
        iInitialize: IInitialize,
        networkAds: NetworkAds
    ) {

    }

    fun setTestDevices(activity: Activity, testDevices: List<String>, networkAds: NetworkAds) {

    }

    fun loadGdpr(activity: Activity, childDirected: Boolean, networkAds: NetworkAds) {

    }

    fun showBanner(
        activity: Activity,
        bannerView: RelativeLayout,
        sizeBanner: SizeBanner,
        networkAds: NetworkAds,
        adUnitId: String,
        callbackAds: CallbackAds?
    ) {

    }

    fun loadInterstitial(
        activity: Activity,
        networkAds: NetworkAds,
        adUnitId: String,
    ) {

    }

    fun showInterstitial(
        activity: Activity,
        networkAds: NetworkAds,
        adUnitId: String,
        callbackAds: CallbackAds?
    ) {

    }

    fun showNativeAds(
        activity: Activity,
        nativeView: RelativeLayout,
        sizeNative: SizeNative,
        networkAds: NetworkAds,
        adUnitId: String,
        callbackAds: CallbackAds?
    ) {

    }

    fun loadRewards(
        activity: Activity,
        networkAds: NetworkAds,
        adUnitId: String,
    ) {

    }

    fun showRewards(
        activity: Activity,
        networkAds: NetworkAds,
        adUnitId: String,
        callbackAds: CallbackAds?,
        iRewards: IRewards?
    ) {

    }
}
package com.united.forabet.splash

import com.united.forabet.utils.Features
import com.united.forabet.utils.mvp.ViewPresenter

class SplashPresenter : ViewPresenter<SplashView>() {

    var countryISO: String? = null
    var isNeedStub: Boolean = true
    var countryDatabaseIso: String? = Features.COUNTRY_ISO_CODE
    var inCorrectCountry = false
    private var list: MutableList<String> = mutableListOf()

    fun checkIp() {
        stringToList()
        inCorrectCountry = isCorrectCountry()
        if (inCorrectCountry) {
            showNeededScreen()
        } else {
            getView()?.showStub()
        }
        /*val ip = Utils.getIPAddress(true)
        unsubscribeOnDestroy(ipService.getIpLocation(ip, Features.API_KEY)
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .subscribe({
                if (!it.countryCode.isNullOrEmpty()) {
                    countryISO = it.countryCode
                }
                showNeededScreen()
            }, {
                Log.e("Error", it.localizedMessage)
                showNeededScreen()
            })
        )*/
    }

    private fun stringToList() {
        val countries = countryDatabaseIso ?: ""
        list = countries.split(",").map { it.trim() }.toMutableList()
    }

    private fun showNeededScreen() {
        if (!isNeedStub && inCorrectCountry) {
            getView()?.showWeb()
        } else {
            getView()?.showStub()
        }
    }

    private fun isCorrectCountry(): Boolean {
        var isCorrect = false
        val countryIso = countryISO ?: ""
        for (country in list) {
            if (country.toLowerCase() == countryIso.toLowerCase()) {
                isCorrect = true
                break
            }
        }
        return isCorrect
    }

    fun onCreate() {
        getView()?.checkCountry()
    }
}

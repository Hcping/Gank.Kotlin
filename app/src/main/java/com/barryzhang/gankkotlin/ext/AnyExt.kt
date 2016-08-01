package com.barryzhang.gankkotlin.ext

import com.google.gson.Gson
import org.greenrobot.eventbus.EventBus

/**
 * https://github.com/barryhappy
 * Created by Barry on 16/7/28
 */

inline fun <reified T:Any> T.fromJson(json: String) : T?{
    try {
        return Gson().fromJson(json, T::class.java)
    }catch (ex: Exception){
        return null
    }
}

fun Any.registerEventBus(){
    EventBus.getDefault().register(this)
}

fun Any.unregisterEventBus(){
    EventBus.getDefault().unregister(this)
}

fun Any.postBusEvent(event : Any){
    EventBus.getDefault().post(event)
}
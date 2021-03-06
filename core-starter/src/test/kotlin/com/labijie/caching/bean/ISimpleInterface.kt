package com.labijie.caching.bean

import com.labijie.caching.annotation.Cache
import com.labijie.caching.annotation.CacheRemove
import com.labijie.caching.model.ArgumentObject
import org.springframework.stereotype.Component

/**
 * Created with IntelliJ IDEA.
 * @author Anders Xiao
 * @date 2019-03-25
 */
interface ISimpleInterface {
    @Cache("#arg.stringValue", 30000)
    fun getCached(arg: ArgumentObject): ArgumentObject

    @CacheRemove("#key", delayMills = 2000)
    fun removeCacheDelay2s(key:String):Unit
}
package dev.mfataka.marsphotos

import android.app.Application
import dev.mfataka.marsphotos.data.AppContainer
import dev.mfataka.marsphotos.data.DefaultAppContainer

class MarsPhotosApplication : Application() {
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = DefaultAppContainer()
    }
}

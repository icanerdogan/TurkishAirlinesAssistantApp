package com.ibrahimcanerdogan.turkishairlinesassistant.view.dependencyinjection

import com.ibrahimcanerdogan.turkishairlinesassistant.domain.usecase.PostCalculateFlightMilesUseCase
import com.ibrahimcanerdogan.turkishairlinesassistant.domain.usecase.PostPortUseCase
import com.ibrahimcanerdogan.turkishairlinesassistant.view.viewmodel.calculate.CalculateViewModelFactory
import com.ibrahimcanerdogan.turkishairlinesassistant.view.viewmodel.port.PortViewModelFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class ViewModelFactoryModule {

    @Singleton
    @Provides
    fun provideCalculateViewModelFactory(
        postCalculateFlightMilesUseCase: PostCalculateFlightMilesUseCase
    ) : CalculateViewModelFactory {
        return CalculateViewModelFactory(postCalculateFlightMilesUseCase)
    }

    @Singleton
    @Provides
    fun providePortViewModelFactory(
        postPortUseCase: PostPortUseCase
    ) : PortViewModelFactory {
        return PortViewModelFactory(postPortUseCase)
    }
}
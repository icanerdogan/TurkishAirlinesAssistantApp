package com.ibrahimcanerdogan.turkishairlinesassistant.view.dependencyinjection

import com.ibrahimcanerdogan.turkishairlinesassistant.domain.usecase.PostCalculateFlightMilesUseCase
import com.ibrahimcanerdogan.turkishairlinesassistant.view.viewmodel.calculate.CalculateViewModelFactory
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
}
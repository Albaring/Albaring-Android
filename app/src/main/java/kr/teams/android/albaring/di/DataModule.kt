package kr.teams.android.albaring.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kr.teams.android.data.repository.HomeCardRepositoryImpl
import kr.teams.android.domain.repository.HomeCardRepository
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
interface DataModule {

    @Binds
    @Singleton
    fun bindBasketRepository(homeCardRepositoryImpl: HomeCardRepositoryImpl): HomeCardRepository
}
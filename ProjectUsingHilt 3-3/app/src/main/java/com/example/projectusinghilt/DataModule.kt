package com.example.projectusinghilt

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

/**
 * Created by Sadaqat Panhwer
 * https://panhwersadaqat.github.io/
 * on 12/20/21.
 */
@Module
@InstallIn(SingletonComponent::class)
class DataModule {
    @Provides
    fun providesDataSource():DataSource {
        return DataSource()
    }
}
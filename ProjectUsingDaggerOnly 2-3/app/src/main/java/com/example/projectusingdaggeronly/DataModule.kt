package com.example.projectusingdaggeronly

import dagger.Module
import dagger.Provides

/**
 * Created by Sadaqat Panhwer
 * https://panhwersadaqat.github.io/
 * on 12/17/21.
 */
@Module
class DataModule {
    @Provides
    fun provideDataSource(): DataSource {
        return DataSource()
    }
}
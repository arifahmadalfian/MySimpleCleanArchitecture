package com.arifahmadalfian.mysimplecleanarchitecture.di

import com.arifahmadalfian.mysimplecleanarchitecture.data.IMessageDataSource
import com.arifahmadalfian.mysimplecleanarchitecture.data.MessageDataSource
import com.arifahmadalfian.mysimplecleanarchitecture.data.MessageRepository
import com.arifahmadalfian.mysimplecleanarchitecture.domain.IMessageRepository
import com.arifahmadalfian.mysimplecleanarchitecture.domain.MessageInteractor
import com.arifahmadalfian.mysimplecleanarchitecture.domain.MessageUseCase

object Injection {
    fun provideUseCase(): MessageUseCase {
        val messageRepository = provideRepository()
        return MessageInteractor(messageRepository)
    }

    private fun provideRepository(): IMessageRepository {
        val messageDataSource = provideDataSource()
        return MessageRepository(messageDataSource)
    }

    private fun provideDataSource(): IMessageDataSource {
        return MessageDataSource()
    }
}
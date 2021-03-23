package com.arifahmadalfian.mysimplecleanarchitecture.data

import com.arifahmadalfian.mysimplecleanarchitecture.domain.IMessageRepository
import com.arifahmadalfian.mysimplecleanarchitecture.domain.MessageEntity

class MessageRepository(private val messageDataSource: IMessageDataSource): IMessageRepository {
    override fun getWelcomeMessage(name: String): MessageEntity {
        return messageDataSource.getMessageFromSource(name)
    }
}
package com.arifahmadalfian.mysimplecleanarchitecture.data

import com.arifahmadalfian.mysimplecleanarchitecture.domain.MessageEntity

class MessageDataSource: IMessageDataSource {
    override fun getMessageFromSource(name: String): MessageEntity {
        return MessageEntity("Hello $name! wellcome to Clean Architecture")
    }
}
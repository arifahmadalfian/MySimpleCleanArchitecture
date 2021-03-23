package com.arifahmadalfian.mysimplecleanarchitecture.data

import com.arifahmadalfian.mysimplecleanarchitecture.domain.MessageEntity

interface IMessageDataSource {
    fun getMessageFromSource(name: String): MessageEntity
}
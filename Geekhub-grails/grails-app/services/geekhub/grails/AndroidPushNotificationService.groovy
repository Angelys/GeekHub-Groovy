package geekhub.grails

import grails.transaction.Transactional

@Transactional
class AndroidPushNotificationService {

    def batchSize = 500

    def androidGcmService
    def deviceService

    def pushToAllDevice( Map data ) {

        def lastId = 1
        def messages = []

        while(lastId > 0){

            def devices = deviceService.getNFrom(lastId, batchSize)

            def tokens = devices.collect { it.token }

            messages.add androidGcmService.sendMessage(data, tokens).toString()

            if(devices.size() < batchSize){
                lastId = -1
            }
        }

        messages.join("\n")
    }
}

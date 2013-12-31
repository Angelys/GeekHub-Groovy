package geekhub.grails

import org.springframework.security.access.annotation.Secured

class PushNotificationController {

    def androidPushNotificationService

    @Secured(['ROLE_ADMIN'])
    def post() {

        def data = [ title: "Hello there!", body: "Play tanks, hurry!" ]

        def resp = androidPushNotificationService.pushToAllDevice(data)

        render text: resp
    }

}

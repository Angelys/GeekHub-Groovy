package geekhub.grails

class DeviceController {

    def add() {

        println params

        if(!params.get("regId")){
            render( status: 400 )
            return
        }

        Device dev = Device.findOrCreateByToken(params.regId)
        dev.save()

        render(satus: 200)
    }

    def showAll(){

        render (contentType: 'text/json') {Device.getAll()}

    }
}

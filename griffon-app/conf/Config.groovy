application {
    title = 'app'
    startupGroups = ['app']
    autoShutdown = true
}
lookandfeel.handler = 'Napkin'
lookandfeel.theme = 'Napkin'
mvcGroups {
    app {
        model      = 'org.example.AppModel'
        view       = 'org.example.AppView'
        controller = 'org.example.AppController'
    }
    schedule {
        model      = 'org.example.ScheduleModel'
        view       = 'org.example.ScheduleView'
        controller = 'org.example.ScheduleController'
    }
}
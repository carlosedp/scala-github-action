package org.acme

import io.quarkiverse.githubaction.{Action, Commands}

class MyAction:

    @Action
    def action(commands: Commands ) =
        commands.notice("Hello from Quarkus GitHub Action")
        commands.appendJobSummary(":wave: Hello from Quarkus GitHub Action")

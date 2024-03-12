package org.acme

import io.quarkiverse.githubaction.{Action, Commands}

class MyAction:

    @Action
    def action(commands: Commands) =
        commands.notice("Hello from the Scala 3 Quarkus GitHub Action")
        commands.appendJobSummary(":wave: Hello from the Scala 3 Quarkus GitHub Action")

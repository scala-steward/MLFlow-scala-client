package io.github.francescofrontera.client.services

trait AllServiceLive extends ExperimentService.Live with RunService.Live

object AllServiceLive {
  type AllServiceT = ExperimentService.Live with RunService.Live
}

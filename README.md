# MLFlow-scala-client
MLFlow-scala-client is a fresh made, pure functional, wrapper around MFLow tracking server API.

### Idea 
```scala 
MLFlowClient("http://localhost:5000/api/2.0/preview/mlflow") { modules =>
      val (experiments, run, console) = (
        modules.experimentService,
        modules.runService,
        modules.console
      )

      for {
        allExperiments <- experiments.getAll
        _ <- console.putStr(s"Experiments: $allExperiments\n")
        byId <- experiments.getById("1")
        _ <- console.putStr(s"Experiment: $byId\n")
        run <- run.getById("231e8ac802ed42a8b807174f1d9e9501")
        _ <- console.putStr(s"Run: $run\n")
      } yield List(allExperiments, byId, run)
    }.fold(_ => 1, _ => 0)
```


# Scala 3 Quarkus Sample Action

This repository contains a GitHub Action powered by [Quarkus GitHub Action](https://github.com/quarkiverse/quarkus-github-action) written in Scala 3.

It allows using all Scala 3 expressiveness and flexibility with Quarkus framework.

For more information, look at <https://docs.quarkiverse.io/quarkus-github-action/dev/index.html>.

When pushing to the `main` branch, the GitHub Action artifact is automatically published to the Maven repository of this GitHub repository.

The `action.yml` descriptor instructs GitHub Actions to run this published artifact using JBang when the action is executed.

To use in your project, add to your actions:

```yaml
      - name: Run Sample Scala 3 Quarkus Action
        uses: carlosedp/scala-github-action@main
        with:
          github-token: ${{ secrets.GITHUB_TOKEN }}
```

## POC to implement an automated tag/release cycle, based on pull request labels

POC to implement an automated tag/release cycle, based on PR labels.

Uses:

- [Conventional Changelog Action](https://github.com/marketplace/actions/conventional-changelog-action): This action will bump version, tag commit and generate a changelog with conventional commits.

---

[Conventional Commits (Angular)](https://www.conventionalcommits.org/en/v1.0.0-beta.4/):

1. fix: a commit of the type fix patches a bug in your codebase (this correlates with PATCH in semantic versioning).
2. feat: a commit of the type feat introduces a new feature to the codebase (this correlates with MINOR in semantic versioning).
3. BREAKING CHANGE: a commit that has the text BREAKING CHANGE: at the beginning of its optional body or footer section introduces a breaking API change (correlating with MAJOR in semantic versioning). A BREAKING CHANGE can be part of commits of any type.
4. Others: commit types other than fix: and feat: are allowed, for example [@commitlint/config-conventional](https://github.com/conventional-changelog/commitlint/tree/master/%40commitlint/config-conventional) (based on the [Angular convention](https://github.com/angular/angular/blob/22b96b9/CONTRIBUTING.md#-commit-message-guidelines)) recommends chore:, docs:, style:, refactor:, perf:, test:, and others.


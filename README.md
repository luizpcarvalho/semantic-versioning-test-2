## POC to implement an automated tag/release cycle, based on pull request labels

POC to implement an automated tag/release cycle, based on PR labels.

Uses:

- [Release Drafter Action](https://github.com/release-drafter/release-drafter): Drafts your next release notes as pull requests are merged into the main branch. Built with Probot.
- [Version Drafter Action](https://github.com/patrickjahns/version-drafter-action): GitHub Action designed as companion for release-drafter to determine the next semantic version based on the GitHub labels of merged pull requests.
- [PR Labeler](https://github.com/srvaroa/labeler): Implements a GitHub Action that labels Pull Requests based on configurable conditions.
---
Semantic versioning logic used:
![semantic versioning structure](https://lh3.googleusercontent.com/W0hV4oisvCb5b0iTzbFCZSbXZiQXLwncMnBTRaE8RcaG3nv2stKPbfReK84Dry_-gfi9cOvdorPCaJWMXx1IZHm33plYzxQQi119nxHS0uv-dii0VEhB-t7nwPZ62DZGVm1U2Grh=s1600)
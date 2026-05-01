# SonarQube + Maven demo

This repository demonstrates integrating SonarQube with a Maven project using GitHub Actions.

Files added:

- pom.xml: Maven configuration (Java 17, JUnit, Surefire, Sonar plugin)
- src/main/java/com/example/App.java: simple application
- src/test/java/com/example/AppTest.java: JUnit 5 test
- sonar-project.properties: Sonar project settings
- .github/workflows/sonar.yml: GitHub Actions workflow

Quick push commands to trigger CI (replace remote/origin and branch as needed):

```bash
git init
git add .
git commit -m "Add SonarQube Maven demo"
git branch -M main
git remote add origin <your-git-remote-url>
git push -u origin main
```

You must configure two repository secrets in GitHub: `SONAR_HOST_URL` and `SONAR_TOKEN`.

Troubleshooting (common issues):

- **Authentication errors**: Ensure `SONAR_TOKEN` is a valid token with analysis permissions. Use the token from SonarQube or SonarCloud.
- **Host URL errors**: `SONAR_HOST_URL` must include protocol, e.g. `https://sonarcloud.io` or `https://your-sonar.example.com`.
- **Maven cache / network issues**: Rerun the workflow; check network/firewall that may block access to Sonar host.
- **Tests not discovered**: Ensure test class names end with `Test` (configured in Surefire) and use JUnit 5.
- **Scanner plugin version**: If the Sonar scanner complains, update `sonar-maven-plugin` version in `pom.xml`.

mvn io.quarkus:quarkus-maven-plugin:1.9.2.Final:create \
-DprojectGroupId=at.htl \
-DprojectArtifactId=containers \
-DclassName="at.htl.WeatherResource" \
-Dpath="/weather" \
-Dextensions="container-image-jib"

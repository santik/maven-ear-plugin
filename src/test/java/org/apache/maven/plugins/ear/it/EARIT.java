package org.apache.maven.plugins.ear.it;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import static org.apache.maven.jupiter.assertj.MavenITAssertions.assertThat;

import org.apache.maven.jupiter.extension.MavenIT;
import org.apache.maven.jupiter.extension.MavenTest;
import org.apache.maven.jupiter.extension.maven.MavenExecutionResult;
import org.apache.maven.jupiter.extension.maven.MavenLog;
import org.apache.maven.jupiter.extension.maven.MavenProjectResult;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;

/**
 * <ul>
 *   <li>basic</li>
 *   <li>packaging_includes</li>
 *   <li>packaging_excludes</li>
 *   <li>resource_custom_directory</li>
 * </ul>
 *
 * @author Karl Heinz Marbaise These are the maven-invoker-plugin integration tests (src/it/**). migrated to the new
 * maven-it-extension
 */
@MavenIT
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
@DisplayName("EAR Plugin Integration tests")
class EARIT {

  @MavenTest
  void basic(MavenExecutionResult result, MavenProjectResult project) {
    assertThat(result).isSuccessful();
    assertThat(project).hasTarget()
        .withEarFile()
        .containsOnlyOnce("META-INF/application.xml", "META-INF/appserver-application.xml");
  }

  /*
Archive:  test-1.0.ear
  testing: META-INF/MANIFEST.MF     OK
  testing: META-INF/                OK
  testing: META-INF/maven/          OK
  testing: META-INF/maven/org.apache.maven.its.ear.jboss/   OK
  testing: META-INF/maven/org.apache.maven.its.ear.jboss/test/   OK
  testing: META-INF/application.xml   OK
  testing: META-INF/jboss-app.xml   OK
  testing: META-INF/appserver-application.xml   OK
  testing: META-INF/maven/org.apache.maven.its.ear.jboss/test/pom.xml   OK
  testing: META-INF/maven/org.apache.maven.its.ear.jboss/test/pom.properties   OK
 */
  @MavenTest
  void jboss(MavenExecutionResult result, MavenProjectResult project, MavenLog log) {
    assertThat(result).isSuccessful();
    assertThat(log).isSuccessful();
    assertThat(project).hasTarget()
        .withEarFile()
        .containsOnlyOnce("META-INF/application.xml", "META-INF/appserver-application.xml", "META-INF/jboss-app.xml");
  }

  @MavenTest
  void packaging_excludes(MavenExecutionResult result, MavenProjectResult project) {
    assertThat(result).isSuccessful();
    assertThat(project).hasTarget()
        .withEarFile()
        .doesNotContain("commons-lang-commons-lang-2.5.jar")
        .containsOnlyOnce("META-INF/application.xml", "META-INF/MANIFEST.MF");
  }

  @MavenTest
  void packaging_includes(MavenExecutionResult result, MavenProjectResult project) {
    assertThat(result).isSuccessful();
    assertThat(project).hasTarget()
        .withEarFile()
        .doesNotContain("commons-io-1.4.jar")
        .containsOnlyOnce("commons-lang-commons-lang-2.5.jar", "META-INF/application.xml", "META-INF/MANIFEST.MF");
  }

  @MavenTest
  @DisplayName("Filtering of a custom directory (likely wrong!)")
  void resource_custom_directory(MavenExecutionResult result, MavenProjectResult project, MavenLog log) {
    assertThat(result).isSuccessful();
    assertThat(log).isSuccessful();
    assertThat(project).hasTarget()
        .withEarFile()
        .containsOnlyOnce("META-INF/application.xml", "APP-INF/classes/foo.properties");
  }

  @MavenTest
  void skinny_wars_filenamemapping_no_version(MavenExecutionResult result) {
    assertThat(result).isSuccessful();
    assertThat(result).project().hasModule("war-module");
    //FIXME: The following checking is not correct:
    //File jarFile = new File( basedir, "ear-module/target/ear-module-1.0/war-module.war" );
    assertThat(result).project()
        .withModule("war-module")
        .withWarFile()
        .containsOnlyOnce("WEB-INF/web.xml", "META-INF/MANIFEST.MF");
        //FIXME: Check if the following works correctly: .doesNotContain("WEB-INF/lib/commons-lang-2.5.jar");

    assertThat(result).project()
        .withModule("war-module")
        .withWarFile()
        .containsOnlyOnce("WEB-INF/web.xml", "META-INF/MANIFEST.MF", "WEB-INF/lib/commons-lang-2.5.jar");

    assertThat(result).project().withModule(  "ear-module").withEarFile();
  }

  @MavenTest
  void transitive_excludes(MavenExecutionResult result, MavenProjectResult project, MavenLog log) {
    assertThat(result).isSuccessful();
    assertThat(log).isSuccessful();
    assertThat(project).hasTarget()
        .withEarFile()
        .containsOnlyOnce("org.apache.maven-maven-core-3.0.jar", "META-INF/application.xml");
  }

}

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
import static org.apache.maven.jupiter.extension.maven.MavenVersion.M3_6_2;

import org.apache.maven.jupiter.extension.DisabledForMaven;
import org.apache.maven.jupiter.extension.MavenIT;
import org.apache.maven.jupiter.extension.MavenTest;
import org.apache.maven.jupiter.extension.maven.MavenExecutionResult;
import org.apache.maven.jupiter.extension.maven.MavenLog;
import org.apache.maven.jupiter.extension.maven.MavenProjectResult;
import org.apache.maven.jupiter.extension.maven.MavenVersion;
import org.junit.jupiter.api.DisplayName;

/**
 * <ul>
 *   <li>basic</li>
 *   <li>packaging_includes</li>
 *   <li>packaging_excludes</li>
 *   <li>resource_custom_directory</li>
 * </ul>
 *
 * @author Karl Heinz Marbaise
 */
@MavenIT
@DisplayName("EAR Plugin Integration tests")
class EARIT {

  @MavenTest
  @DisabledForMaven(versions = M3_6_2)
  @DisplayName("Basic configuration. Should simply create an ear file.")
  void basic(MavenExecutionResult result, MavenProjectResult project) {
    System.out.println("System.getProperty(\"maven.version\") = " + System.getProperty("maven.version"));
    assertThat(result).isSuccessful();
    assertThat(project).hasTarget()
        .withEarFile()
        .containsOnlyOnce("META-INF/application.xml", "META-INF/appserver-application.xml");
  }

  @MavenTest
  @DisplayName("Packging includes defined.")
  void packaging_includes(MavenExecutionResult result, MavenProjectResult project) {
    assertThat(result).isSuccessful();
    assertThat(project).hasTarget()
        .withEarFile()
        .doesNotContain("commons-io-1.4.jar")
        .containsOnlyOnce("commons-lang-commons-lang-2.5.jar", "META-INF/application.xml", "META-INF/MANIFEST.MF");
  }

  @MavenTest
  @DisplayName("Packging excludes defined to prevent adding commons-lang-2.5 into the ear file.")
  void packaging_excludes(MavenExecutionResult result, MavenProjectResult project) {
    assertThat(result).isSuccessful();
    assertThat(project).hasTarget()
        .withEarFile()
        .doesNotContain("commons-lang-commons-lang-2.5.jar")
        .containsOnlyOnce("META-INF/application.xml", "META-INF/MANIFEST.MF");
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
  @DisplayName("JBoss app generation in EAR file.")
  void jboss(MavenExecutionResult result, MavenProjectResult project, MavenLog log) {
    assertThat(result).isSuccessful();
    assertThat(log).isSuccessful();
    assertThat(project).hasTarget()
        .withEarFile()
        .containsOnlyOnce("META-INF/application.xml",
            "META-INF/appserver-application.xml",
            "META-INF/jboss-app.xml");
  }

}

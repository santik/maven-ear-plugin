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

import com.soebes.itf.jupiter.extension.MavenIT;
import com.soebes.itf.jupiter.extension.MavenPredefinedRepository;
import com.soebes.itf.jupiter.extension.MavenTest;
import com.soebes.itf.jupiter.maven.MavenExecutionResult;
import com.soebes.itf.jupiter.maven.MavenLog;
import com.soebes.itf.jupiter.maven.MavenProjectResult;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;

import static com.soebes.itf.extension.assertj.MavenITAssertions.assertThat;


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
@DisplayName("EAR Project Integration tests.")
@MavenPredefinedRepository
class EARProjectIT
{

  @MavenTest
  void project_001(MavenExecutionResult result) {
    assertThat(result).isSuccessful().project().hasTarget().withEarFile();
  }
  @MavenTest
  void project_002(MavenExecutionResult result) {
    assertThat(result).isSuccessful().project().hasTarget().withEarFile();
  }
  @MavenTest
  void project_003(MavenExecutionResult result) {
    assertThat(result).isSuccessful().project().hasTarget().withEarFile();
  }
  @MavenTest
  void project_004(MavenExecutionResult result) {
    assertThat(result).isSuccessful().project().hasTarget().withEarFile();
  }
  @MavenTest
  void project_005(MavenExecutionResult result) {
    assertThat(result).isSuccessful().project().hasTarget().withEarFile();
  }
  @MavenTest
  void project_006(MavenExecutionResult result) {
    assertThat(result).isSuccessful().project().hasTarget().withEarFile();
  }
  @MavenTest
  void project_007(MavenExecutionResult result) {
    assertThat(result).isSuccessful().project().hasTarget().withEarFile();
  }
  @MavenTest
  void project_008(MavenExecutionResult result) {
    assertThat(result).isSuccessful().project().hasTarget().withEarFile();
  }
  @MavenTest
  void project_009(MavenExecutionResult result) {
    assertThat(result).isSuccessful().project().hasTarget().withEarFile();
  }
  @MavenTest
  void project_010(MavenExecutionResult result) {
    assertThat(result).isSuccessful().project().hasTarget().withEarFile();
  }
  @MavenTest
  void project_011(MavenExecutionResult result) {
    assertThat(result).isSuccessful().project().hasTarget().withEarFile();
  }
  @MavenTest
  void project_012(MavenExecutionResult result) {
    assertThat(result).isSuccessful().project().hasTarget().withEarFile();
  }
  @MavenTest
  void project_013(MavenExecutionResult result) {
    assertThat(result).isSuccessful().project().hasTarget().withEarFile();
  }
  @MavenTest
  void project_014(MavenExecutionResult result) {
    assertThat(result).isSuccessful().project().hasTarget().withEarFile();
  }
  @MavenTest
  void project_015(MavenExecutionResult result) {
    assertThat(result).isSuccessful().project().hasTarget().withEarFile();
  }
  @MavenTest
  void project_016(MavenExecutionResult result) {
    assertThat(result).isSuccessful().project().hasTarget().withEarFile();
  }
  @MavenTest
  void project_017(MavenExecutionResult result) {
    assertThat(result).isSuccessful().project().hasTarget().withEarFile();
  }
  @MavenTest
  void project_018(MavenExecutionResult result) {
    assertThat(result).isSuccessful().project().hasTarget().withEarFile();
  }
  @MavenTest
  void project_019(MavenExecutionResult result) {
    assertThat(result).isSuccessful().project().hasTarget().withEarFile();
  }
  @MavenTest
  void project_020(MavenExecutionResult result) {
    assertThat(result).isSuccessful().project().hasTarget().withEarFile();
  }
  @MavenTest
  void project_021(MavenExecutionResult result) {
    assertThat(result).isSuccessful().project().hasTarget().withEarFile();
  }
  @MavenTest
  void project_022(MavenExecutionResult result) {
    assertThat(result).isSuccessful().project().hasTarget().withEarFile();
  }
  @MavenTest
  void project_023(MavenExecutionResult result) {
    assertThat(result).isSuccessful().project().hasTarget().withEarFile();
  }
  @MavenTest
  void project_024(MavenExecutionResult result) {
    assertThat(result).isSuccessful().project().hasTarget().withEarFile();
  }
  @MavenTest
  void project_025(MavenExecutionResult result) {
    assertThat(result).isSuccessful().project().hasTarget().withEarFile();
  }
  @MavenTest
  void project_026(MavenExecutionResult result) {
    assertThat(result).isSuccessful().project().hasTarget().withEarFile();
  }
  @MavenTest
  void project_027(MavenExecutionResult result) {
    assertThat(result).isSuccessful().project().hasTarget().withEarFile();
  }
  @MavenTest
  void project_028(MavenExecutionResult result) {
    assertThat(result).isSuccessful().project().hasTarget().withEarFile();
  }
  @MavenTest
  void project_029(MavenExecutionResult result) {
    assertThat(result).isSuccessful().project().hasTarget().withEarFile();
  }
  @MavenTest
  void project_030(MavenExecutionResult result) {
    assertThat(result).isSuccessful().project().hasTarget().withEarFile();
  }
  @MavenTest
  void project_031(MavenExecutionResult result) {
    assertThat(result).isSuccessful().project().hasTarget().withEarFile();
  }
  @MavenTest
  void project_032(MavenExecutionResult result) {
    assertThat(result).isSuccessful().project().hasTarget().withEarFile();
  }
  @MavenTest
  void project_033(MavenExecutionResult result) {
    assertThat(result).isSuccessful().project().hasTarget().withEarFile();
  }
  @MavenTest
  void project_034(MavenExecutionResult result) {
    assertThat(result).isSuccessful().project().hasTarget().withEarFile();
  }
  @MavenTest
  void project_035(MavenExecutionResult result) {
    assertThat(result).isSuccessful().project().hasTarget().withEarFile();
  }
  @MavenTest
  void project_036(MavenExecutionResult result) {
    assertThat(result).isSuccessful().project().hasTarget().withEarFile();
  }
  @MavenTest
  void project_037(MavenExecutionResult result) {
    assertThat(result).isSuccessful().project().hasTarget().withEarFile();
  }
  @MavenTest
  void project_038(MavenExecutionResult result) {
    assertThat(result).isSuccessful().project().hasTarget().withEarFile();
  }
  @MavenTest
  void project_039(MavenExecutionResult result) {
    assertThat(result).isSuccessful().project().hasTarget().withEarFile();
  }
  @MavenTest
  void project_040(MavenExecutionResult result) {
    assertThat(result).isSuccessful().project().hasTarget().withEarFile();
  }
  @MavenTest
  void project_041(MavenExecutionResult result) {
    assertThat(result).isSuccessful().project().hasTarget().withEarFile();
  }
  @MavenTest
  void project_042(MavenExecutionResult result) {
    assertThat(result).isSuccessful().project().hasTarget().withEarFile();
  }
  @MavenTest
  void project_043(MavenExecutionResult result) {
    assertThat(result).isSuccessful().project().hasTarget().withEarFile();
  }
  @MavenTest
  void project_044(MavenExecutionResult result) {
    assertThat(result).isSuccessful().project().hasTarget().withEarFile();
  }
  @MavenTest
  void project_045(MavenExecutionResult result) {
    assertThat(result).isSuccessful().project().hasTarget().withEarFile();
  }
  @MavenTest
  void project_046(MavenExecutionResult result) {
    assertThat(result).isSuccessful().project().hasTarget().withEarFile();
  }
  @MavenTest
  void project_047(MavenExecutionResult result) {
    assertThat(result).isSuccessful().project().hasTarget().withEarFile();
  }
  @MavenTest
  void project_048(MavenExecutionResult result) {
    assertThat(result).isSuccessful().project().hasTarget().withEarFile();
  }
  @MavenTest
  void project_049(MavenExecutionResult result) {
    assertThat(result).isSuccessful().project().hasTarget().withEarFile();
  }
  @MavenTest
  void project_050(MavenExecutionResult result) {
    assertThat(result).isSuccessful().project().hasTarget().withEarFile();
  }
  @MavenTest
  void project_051(MavenExecutionResult result) {
    assertThat(result).isSuccessful().project().hasTarget().withEarFile();
  }
  @MavenTest
  void project_052(MavenExecutionResult result) {
    assertThat(result).isSuccessful().project().hasTarget().withEarFile();
  }
  @MavenTest
  void project_053(MavenExecutionResult result) {
    assertThat(result).isSuccessful().project().hasTarget().withEarFile();
  }
  @MavenTest
  void project_054(MavenExecutionResult result) {
    assertThat(result).isSuccessful().project().hasTarget().withEarFile();
  }
  @MavenTest
  void project_055(MavenExecutionResult result) {
    assertThat(result).isSuccessful().project().hasTarget().withEarFile();
  }
  @MavenTest
  void project_056(MavenExecutionResult result) {
    assertThat(result).isSuccessful().project().hasTarget().withEarFile();
  }
  @MavenTest
  void project_057(MavenExecutionResult result) {
    assertThat(result).isSuccessful().project().hasTarget().withEarFile();
  }
  @MavenTest
  void project_058(MavenExecutionResult result) {
    assertThat(result).isSuccessful().project().hasTarget().withEarFile();
  }
  @MavenTest
  void project_059(MavenExecutionResult result) {
    assertThat(result).isSuccessful().project().hasTarget().withEarFile();
  }
  @MavenTest
  void project_060(MavenExecutionResult result) {
    assertThat(result).isSuccessful().project().hasTarget().withEarFile();
  }
  @MavenTest
  void project_061(MavenExecutionResult result) {
    assertThat(result).isSuccessful().project().hasTarget().withEarFile();
  }
  @MavenTest
  void project_062(MavenExecutionResult result) {
    assertThat(result).isSuccessful().project().hasTarget().withEarFile();
  }
  @MavenTest
  void project_063(MavenExecutionResult result) {
    assertThat(result).isSuccessful().project().hasTarget().withEarFile();
  }
  @MavenTest
  void project_064(MavenExecutionResult result) {
    assertThat(result).isSuccessful().project().hasTarget().withEarFile();
  }
  @MavenTest
  void project_065(MavenExecutionResult result) {
    assertThat(result).isSuccessful().project().hasTarget().withEarFile();
  }
  @MavenTest
  void project_066(MavenExecutionResult result) {
    assertThat(result).isSuccessful().project().hasTarget().withEarFile();
  }
  @MavenTest
  void project_067(MavenExecutionResult result) {
    assertThat(result).isSuccessful().project().hasTarget().withEarFile();
  }
  @MavenTest
  void project_068(MavenExecutionResult result) {
    assertThat(result).isSuccessful().project().hasTarget().withEarFile();
  }
  @MavenTest
  void project_069(MavenExecutionResult result) {
    assertThat(result).isSuccessful().project().hasTarget().withEarFile();
  }
  @MavenTest
  void project_070(MavenExecutionResult result) {
    assertThat(result).isSuccessful().project().hasTarget().withEarFile();
  }
  @MavenTest
  void project_071(MavenExecutionResult result) {
    assertThat(result).isSuccessful().project().hasTarget().withEarFile();
  }
  @MavenTest
  void project_072(MavenExecutionResult result) {
    assertThat(result).isSuccessful().project().hasTarget().withEarFile();
  }
  @MavenTest
  void project_073(MavenExecutionResult result) {
    assertThat(result).isSuccessful().project().hasTarget().withEarFile();
  }
  @MavenTest
  void project_074(MavenExecutionResult result) {
    assertThat(result).isSuccessful().project().hasTarget().withEarFile();
  }
  @MavenTest
  void project_075(MavenExecutionResult result) {
    assertThat(result).isSuccessful().project().hasTarget().withEarFile();
  }
  @MavenTest
  void project_076(MavenExecutionResult result) {
    assertThat(result).isSuccessful().project().hasTarget().withEarFile();
  }
  @MavenTest
  void project_077(MavenExecutionResult result) {
    assertThat(result).isSuccessful().project().hasTarget().withEarFile();
  }
  @MavenTest
  void project_078(MavenExecutionResult result) {
    assertThat(result).isSuccessful().project().hasTarget().withEarFile();
  }
  @MavenTest
  void project_079(MavenExecutionResult result) {
    assertThat(result).isSuccessful().project().hasTarget().withEarFile();
  }
  @MavenTest
  void project_080(MavenExecutionResult result) {
    assertThat(result).isSuccessful().project().hasTarget().withEarFile();
  }
  @MavenTest
  void project_081(MavenExecutionResult result) {
    assertThat(result).isSuccessful().project().hasTarget().withEarFile();
  }
  @MavenTest
  void project_082(MavenExecutionResult result) {
    assertThat(result).isSuccessful().project().hasTarget().withEarFile();
  }
  @MavenTest
  void project_083(MavenExecutionResult result) {
    assertThat(result).isSuccessful().project().hasTarget().withEarFile();
  }
  @MavenTest
  void project_084(MavenExecutionResult result) {
    assertThat(result).isSuccessful().project().hasTarget().withEarFile();
  }
  @MavenTest
  void project_085(MavenExecutionResult result) {
    assertThat(result).isSuccessful().project().hasTarget().withEarFile();
  }
  @MavenTest
  void project_086(MavenExecutionResult result) {
    assertThat(result).isSuccessful().project().hasTarget().withEarFile();
  }
  @MavenTest
  void project_087(MavenExecutionResult result) {
    assertThat(result).isSuccessful().project().hasTarget().withEarFile();
  }

}

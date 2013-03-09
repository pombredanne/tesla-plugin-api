package org.apache.maven.plugin.plugin;

public class TeslaPluginUtils {

  /**
   * Parse maven-...-plugin.
   *
   * @todo move to plugin-tools-api as a default only
   */
  public static String getGoalPrefixFromArtifactId(String artifactId) {
    if ("tesla-plugin-plugin".equals(artifactId)) {
      return "plugin";
    } else {
      return artifactId.replaceAll("-?tesla-?", "").replaceAll("-?plugin-?", "");
    }
  }
}

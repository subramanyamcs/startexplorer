package de.bastiankrol.startexplorer.preferences;

import static de.bastiankrol.startexplorer.util.Util.*;
import de.bastiankrol.startexplorer.preferences.SeparatorData.SeparatorType;

/**
 * Constants and defaults for the preferences
 * 
 * @author Bastian Krol
 * @version $Revision:$ $Date:$
 */
public class PreferenceConstantsAndDefaults
{

  /**
   * key for the number of configured custom commands
   */
  public static final String KEY_NUMBER_OF_CUSTOM_COMMANDS =
      "de.bastiankrol.startexplorer.bastiankrol.number_of_commands";

  /**
   * key for the copy resource path separator is-custom flag
   */
  public static final String KEY_COPY_RESOURCE_PATH_SEPARATOR_IS_CUSTOM =
      "de.bastiankrol.startexplorer.copy_resource_path_separator_is_custom";

  /**
   * key for the selected standard copy resource path separator
   */
  public static final String KEY_COPY_RESOURCE_PATH_SEPARATOR_STANDARD =
      "de.bastiankrol.startexplorer.copy_resource_path_separator_standard";

  /**
   * key for the custom copy resource path separator string
   */
  public static final String KEY_COPY_RESOURCE_PATH_SEPARATOR_CUSTOM_STRING =
      "de.bastiankrol.startexplorer.copy_resource_path_separator_custom_string";

  private static final String KEY_CUSTOM_COMMAND =
      "de.bastiankrol.startexplorer.command_";
  private static final String KEY_CUSTOM_COMMAND_ENABLED_FOR_RESOURCES =
      "de.bastiankrol.startexplorer.command_enabled_for_resources_";
  private static final String KEY_CUSTOM_COMMAND_NAME_FOR_RESOURCES =
      "de.bastiankrol.startexplorer.command_name_resources_";
  private static final String KEY_CUSTOM_COMMAND_ENABLED_FOR_TEXT_SELECTION =
      "de.bastiankrol.startexplorer.command_enabled_for_text_selection_";
  private static final String KEY_CUSTOM_COMMAND_NAME_FOR_TEXT_SELECTION =
      "de.bastiankrol.startexplorer.command_name_text_selection_";
  private static final String KEY_CUSTOM_COMMAND_PASS_SELECTED_TEXT =
      "de.bastiankrol.startexplorer.command_pass_selected_text_";

  public static final CommandConfig[] DEFAULT_CUSTOM_COMMANDS =
      new CommandConfig[] {
          new CommandConfig("uedit32 ${resource_path}", true,
              "Edit with UltraEdit", true, "Edit with UltraEdit", false),
          new CommandConfig("notepad ${resource_path}", true,
              "Edit with Notepad", true, "Edit with Notepad", false), };

  public static final SeparatorType DEFAULT_COPY_RESOURCE_PATH_SEPARATOR =
      SeparatorType.LF;

  public static final String DEFAULT_CUSTOM_COPY_RESOURCE_PATH_SEPARATOR_STRING =
      ", ";

  public static String getCommandKey(int i)
  {
    return getCommandKey(KEY_CUSTOM_COMMAND, i);
  }

  public static String getCommandEnabledForResourcesMenuKey(int i)
  {
    return getCommandKey(KEY_CUSTOM_COMMAND_ENABLED_FOR_RESOURCES, i);
  }

  public static String getCommandNameForResourcesMenuKey(int i)
  {
    return getCommandKey(KEY_CUSTOM_COMMAND_NAME_FOR_RESOURCES, i);
  }

  public static String getCommandEnabledForTextSelectionMenuKey(int i)
  {
    return getCommandKey(KEY_CUSTOM_COMMAND_ENABLED_FOR_TEXT_SELECTION, i);
  }

  public static String getCommandNameForTextSelectionMenuKey(int i)
  {
    return getCommandKey(KEY_CUSTOM_COMMAND_NAME_FOR_TEXT_SELECTION, i);
  }

  public static String getPassSelectedTextKey(int i)
  {
    return getCommandKey(KEY_CUSTOM_COMMAND_PASS_SELECTED_TEXT, i);
  }

  private static String getCommandKey(String keyPrefix, int i)
  {
    return keyPrefix + intToString(i);
  }
}
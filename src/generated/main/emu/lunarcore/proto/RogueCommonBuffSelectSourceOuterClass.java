// Code generated by protocol buffer compiler. Do not edit!
package emu.lunarcore.proto;

import us.hebi.quickbuf.ProtoEnum;
import us.hebi.quickbuf.ProtoUtil;

public final class RogueCommonBuffSelectSourceOuterClass {
  /**
   * Protobuf enum {@code RogueCommonBuffSelectSource}
   */
  public enum RogueCommonBuffSelectSource implements ProtoEnum<RogueCommonBuffSelectSource> {
    /**
     * <code>ROGUE_COMMON_BUFF_SELECT_SOURCE_TYPE_NONE = 0;</code>
     */
    ROGUE_COMMON_BUFF_SELECT_SOURCE_TYPE_NONE("ROGUE_COMMON_BUFF_SELECT_SOURCE_TYPE_NONE", 0),

    /**
     * <code>ROGUE_COMMON_BUFF_SELECT_SOURCE_TYPE_DICE_ROLL = 1;</code>
     */
    ROGUE_COMMON_BUFF_SELECT_SOURCE_TYPE_DICE_ROLL("ROGUE_COMMON_BUFF_SELECT_SOURCE_TYPE_DICE_ROLL", 1),

    /**
     * <code>ROGUE_COMMON_BUFF_SELECT_SOURCE_TYPE_AEON = 2;</code>
     */
    ROGUE_COMMON_BUFF_SELECT_SOURCE_TYPE_AEON("ROGUE_COMMON_BUFF_SELECT_SOURCE_TYPE_AEON", 2),

    /**
     * <code>ROGUE_COMMON_BUFF_SELECT_SOURCE_TYPE_BOARD_EVENT = 3;</code>
     */
    ROGUE_COMMON_BUFF_SELECT_SOURCE_TYPE_BOARD_EVENT("ROGUE_COMMON_BUFF_SELECT_SOURCE_TYPE_BOARD_EVENT", 3),

    /**
     * <code>ROGUE_COMMON_BUFF_SELECT_SOURCE_TYPE_LEVEL_MECHANISM = 4;</code>
     */
    ROGUE_COMMON_BUFF_SELECT_SOURCE_TYPE_LEVEL_MECHANISM("ROGUE_COMMON_BUFF_SELECT_SOURCE_TYPE_LEVEL_MECHANISM", 4);

    /**
     * <code>ROGUE_COMMON_BUFF_SELECT_SOURCE_TYPE_NONE = 0;</code>
     */
    public static final int ROGUE_COMMON_BUFF_SELECT_SOURCE_TYPE_NONE_VALUE = 0;

    /**
     * <code>ROGUE_COMMON_BUFF_SELECT_SOURCE_TYPE_DICE_ROLL = 1;</code>
     */
    public static final int ROGUE_COMMON_BUFF_SELECT_SOURCE_TYPE_DICE_ROLL_VALUE = 1;

    /**
     * <code>ROGUE_COMMON_BUFF_SELECT_SOURCE_TYPE_AEON = 2;</code>
     */
    public static final int ROGUE_COMMON_BUFF_SELECT_SOURCE_TYPE_AEON_VALUE = 2;

    /**
     * <code>ROGUE_COMMON_BUFF_SELECT_SOURCE_TYPE_BOARD_EVENT = 3;</code>
     */
    public static final int ROGUE_COMMON_BUFF_SELECT_SOURCE_TYPE_BOARD_EVENT_VALUE = 3;

    /**
     * <code>ROGUE_COMMON_BUFF_SELECT_SOURCE_TYPE_LEVEL_MECHANISM = 4;</code>
     */
    public static final int ROGUE_COMMON_BUFF_SELECT_SOURCE_TYPE_LEVEL_MECHANISM_VALUE = 4;

    private final String name;

    private final int number;

    private RogueCommonBuffSelectSource(String name, int number) {
      this.name = name;
      this.number = number;
    }

    /**
     * @return the string representation of enum entry
     */
    @Override
    public String getName() {
      return name;
    }

    /**
     * @return the numeric wire value of this enum entry
     */
    @Override
    public int getNumber() {
      return number;
    }

    /**
     * @return a converter that maps between this enum's numeric and text representations
     */
    public static ProtoEnum.EnumConverter<RogueCommonBuffSelectSource> converter() {
      return RogueCommonBuffSelectSourceConverter.INSTANCE;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value, or null if unknown.
     */
    public static RogueCommonBuffSelectSource forNumber(int value) {
      return RogueCommonBuffSelectSourceConverter.INSTANCE.forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @param other Fallback value in case the value is not known.
     * @return The enum associated with the given numeric wire value, or the fallback value if unknown.
     */
    public static RogueCommonBuffSelectSource forNumberOr(int number,
        RogueCommonBuffSelectSource other) {
      RogueCommonBuffSelectSource value = forNumber(number);
      return value == null ? other : value;
    }

    enum RogueCommonBuffSelectSourceConverter implements ProtoEnum.EnumConverter<RogueCommonBuffSelectSource> {
      INSTANCE;

      private static final RogueCommonBuffSelectSource[] lookup = new RogueCommonBuffSelectSource[5];

      static {
        lookup[0] = ROGUE_COMMON_BUFF_SELECT_SOURCE_TYPE_NONE;
        lookup[1] = ROGUE_COMMON_BUFF_SELECT_SOURCE_TYPE_DICE_ROLL;
        lookup[2] = ROGUE_COMMON_BUFF_SELECT_SOURCE_TYPE_AEON;
        lookup[3] = ROGUE_COMMON_BUFF_SELECT_SOURCE_TYPE_BOARD_EVENT;
        lookup[4] = ROGUE_COMMON_BUFF_SELECT_SOURCE_TYPE_LEVEL_MECHANISM;
      }

      @Override
      public final RogueCommonBuffSelectSource forNumber(final int value) {
        if (value >= 0 && value < lookup.length) {
          return lookup[value];
        }
        return null;
      }

      @Override
      public final RogueCommonBuffSelectSource forName(final CharSequence value) {
        switch (value.length()) {
          case 41: {
            if (ProtoUtil.isEqual("ROGUE_COMMON_BUFF_SELECT_SOURCE_TYPE_NONE", value)) {
              return ROGUE_COMMON_BUFF_SELECT_SOURCE_TYPE_NONE;
            }
            if (ProtoUtil.isEqual("ROGUE_COMMON_BUFF_SELECT_SOURCE_TYPE_AEON", value)) {
              return ROGUE_COMMON_BUFF_SELECT_SOURCE_TYPE_AEON;
            }
            break;
          }
          case 46: {
            if (ProtoUtil.isEqual("ROGUE_COMMON_BUFF_SELECT_SOURCE_TYPE_DICE_ROLL", value)) {
              return ROGUE_COMMON_BUFF_SELECT_SOURCE_TYPE_DICE_ROLL;
            }
            break;
          }
          case 48: {
            if (ProtoUtil.isEqual("ROGUE_COMMON_BUFF_SELECT_SOURCE_TYPE_BOARD_EVENT", value)) {
              return ROGUE_COMMON_BUFF_SELECT_SOURCE_TYPE_BOARD_EVENT;
            }
            break;
          }
          case 52: {
            if (ProtoUtil.isEqual("ROGUE_COMMON_BUFF_SELECT_SOURCE_TYPE_LEVEL_MECHANISM", value)) {
              return ROGUE_COMMON_BUFF_SELECT_SOURCE_TYPE_LEVEL_MECHANISM;
            }
            break;
          }
        }
        return null;
      }
    }
  }
}
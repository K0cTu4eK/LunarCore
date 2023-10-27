// Code generated by protocol buffer compiler. Do not edit!
package emu.lunarcore.proto;

import java.io.IOException;
import us.hebi.quickbuf.FieldName;
import us.hebi.quickbuf.InvalidProtocolBufferException;
import us.hebi.quickbuf.JsonSink;
import us.hebi.quickbuf.JsonSource;
import us.hebi.quickbuf.MessageFactory;
import us.hebi.quickbuf.ProtoMessage;
import us.hebi.quickbuf.ProtoSink;
import us.hebi.quickbuf.ProtoSource;

public final class SelectRogueBuffScRspOuterClass {
  /**
   * Protobuf type {@code SelectRogueBuffScRsp}
   */
  public static final class SelectRogueBuffScRsp extends ProtoMessage<SelectRogueBuffScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 maze_buff_level = 6;</code>
     */
    private int mazeBuffLevel;

    /**
     * <code>optional uint32 maze_buff_id = 12;</code>
     */
    private int mazeBuffId;

    /**
     * <code>optional uint32 retcode = 15;</code>
     */
    private int retcode;

    /**
     * <code>optional .RogueBuffSelectInfo buff_select_info = 2;</code>
     */
    private final RogueBuffSelectInfoOuterClass.RogueBuffSelectInfo buffSelectInfo = RogueBuffSelectInfoOuterClass.RogueBuffSelectInfo.newInstance();

    private SelectRogueBuffScRsp() {
    }

    /**
     * @return a new empty instance of {@code SelectRogueBuffScRsp}
     */
    public static SelectRogueBuffScRsp newInstance() {
      return new SelectRogueBuffScRsp();
    }

    /**
     * <code>optional uint32 maze_buff_level = 6;</code>
     * @return whether the mazeBuffLevel field is set
     */
    public boolean hasMazeBuffLevel() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 maze_buff_level = 6;</code>
     * @return this
     */
    public SelectRogueBuffScRsp clearMazeBuffLevel() {
      bitField0_ &= ~0x00000001;
      mazeBuffLevel = 0;
      return this;
    }

    /**
     * <code>optional uint32 maze_buff_level = 6;</code>
     * @return the mazeBuffLevel
     */
    public int getMazeBuffLevel() {
      return mazeBuffLevel;
    }

    /**
     * <code>optional uint32 maze_buff_level = 6;</code>
     * @param value the mazeBuffLevel to set
     * @return this
     */
    public SelectRogueBuffScRsp setMazeBuffLevel(final int value) {
      bitField0_ |= 0x00000001;
      mazeBuffLevel = value;
      return this;
    }

    /**
     * <code>optional uint32 maze_buff_id = 12;</code>
     * @return whether the mazeBuffId field is set
     */
    public boolean hasMazeBuffId() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 maze_buff_id = 12;</code>
     * @return this
     */
    public SelectRogueBuffScRsp clearMazeBuffId() {
      bitField0_ &= ~0x00000002;
      mazeBuffId = 0;
      return this;
    }

    /**
     * <code>optional uint32 maze_buff_id = 12;</code>
     * @return the mazeBuffId
     */
    public int getMazeBuffId() {
      return mazeBuffId;
    }

    /**
     * <code>optional uint32 maze_buff_id = 12;</code>
     * @param value the mazeBuffId to set
     * @return this
     */
    public SelectRogueBuffScRsp setMazeBuffId(final int value) {
      bitField0_ |= 0x00000002;
      mazeBuffId = value;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 15;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional uint32 retcode = 15;</code>
     * @return this
     */
    public SelectRogueBuffScRsp clearRetcode() {
      bitField0_ &= ~0x00000004;
      retcode = 0;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 15;</code>
     * @return the retcode
     */
    public int getRetcode() {
      return retcode;
    }

    /**
     * <code>optional uint32 retcode = 15;</code>
     * @param value the retcode to set
     * @return this
     */
    public SelectRogueBuffScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000004;
      retcode = value;
      return this;
    }

    /**
     * <code>optional .RogueBuffSelectInfo buff_select_info = 2;</code>
     * @return whether the buffSelectInfo field is set
     */
    public boolean hasBuffSelectInfo() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <code>optional .RogueBuffSelectInfo buff_select_info = 2;</code>
     * @return this
     */
    public SelectRogueBuffScRsp clearBuffSelectInfo() {
      bitField0_ &= ~0x00000008;
      buffSelectInfo.clear();
      return this;
    }

    /**
     * <code>optional .RogueBuffSelectInfo buff_select_info = 2;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableBuffSelectInfo()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RogueBuffSelectInfoOuterClass.RogueBuffSelectInfo getBuffSelectInfo() {
      return buffSelectInfo;
    }

    /**
     * <code>optional .RogueBuffSelectInfo buff_select_info = 2;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RogueBuffSelectInfoOuterClass.RogueBuffSelectInfo getMutableBuffSelectInfo() {
      bitField0_ |= 0x00000008;
      return buffSelectInfo;
    }

    /**
     * <code>optional .RogueBuffSelectInfo buff_select_info = 2;</code>
     * @param value the buffSelectInfo to set
     * @return this
     */
    public SelectRogueBuffScRsp setBuffSelectInfo(
        final RogueBuffSelectInfoOuterClass.RogueBuffSelectInfo value) {
      bitField0_ |= 0x00000008;
      buffSelectInfo.copyFrom(value);
      return this;
    }

    @Override
    public SelectRogueBuffScRsp copyFrom(final SelectRogueBuffScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        mazeBuffLevel = other.mazeBuffLevel;
        mazeBuffId = other.mazeBuffId;
        retcode = other.retcode;
        buffSelectInfo.copyFrom(other.buffSelectInfo);
      }
      return this;
    }

    @Override
    public SelectRogueBuffScRsp mergeFrom(final SelectRogueBuffScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasMazeBuffLevel()) {
        setMazeBuffLevel(other.mazeBuffLevel);
      }
      if (other.hasMazeBuffId()) {
        setMazeBuffId(other.mazeBuffId);
      }
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasBuffSelectInfo()) {
        getMutableBuffSelectInfo().mergeFrom(other.buffSelectInfo);
      }
      return this;
    }

    @Override
    public SelectRogueBuffScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      mazeBuffLevel = 0;
      mazeBuffId = 0;
      retcode = 0;
      buffSelectInfo.clear();
      return this;
    }

    @Override
    public SelectRogueBuffScRsp clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      buffSelectInfo.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof SelectRogueBuffScRsp)) {
        return false;
      }
      SelectRogueBuffScRsp other = (SelectRogueBuffScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasMazeBuffLevel() || mazeBuffLevel == other.mazeBuffLevel)
        && (!hasMazeBuffId() || mazeBuffId == other.mazeBuffId)
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasBuffSelectInfo() || buffSelectInfo.equals(other.buffSelectInfo));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 48);
        output.writeUInt32NoTag(mazeBuffLevel);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 96);
        output.writeUInt32NoTag(mazeBuffId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 120);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRawByte((byte) 18);
        output.writeMessageNoTag(buffSelectInfo);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(mazeBuffLevel);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(mazeBuffId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(buffSelectInfo);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public SelectRogueBuffScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 48: {
            // mazeBuffLevel
            mazeBuffLevel = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 96) {
              break;
            }
          }
          case 96: {
            // mazeBuffId
            mazeBuffId = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 120) {
              break;
            }
          }
          case 120: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 18) {
              break;
            }
          }
          case 18: {
            // buffSelectInfo
            input.readMessage(buffSelectInfo);
            bitField0_ |= 0x00000008;
            tag = input.readTag();
            if (tag != 0) {
              break;
            }
          }
          case 0: {
            return this;
          }
          default: {
            if (!input.skipField(tag)) {
              return this;
            }
            tag = input.readTag();
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeUInt32(FieldNames.mazeBuffLevel, mazeBuffLevel);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.mazeBuffId, mazeBuffId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeUInt32(FieldNames.retcode, retcode);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeMessage(FieldNames.buffSelectInfo, buffSelectInfo);
      }
      output.endObject();
    }

    @Override
    public SelectRogueBuffScRsp mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 1204221426:
          case 854643992: {
            if (input.isAtField(FieldNames.mazeBuffLevel)) {
              if (!input.trySkipNullValue()) {
                mazeBuffLevel = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 144210285:
          case 896621575: {
            if (input.isAtField(FieldNames.mazeBuffId)) {
              if (!input.trySkipNullValue()) {
                mazeBuffId = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1097936398: {
            if (input.isAtField(FieldNames.retcode)) {
              if (!input.trySkipNullValue()) {
                retcode = input.readUInt32();
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -255242115:
          case 1500540965: {
            if (input.isAtField(FieldNames.buffSelectInfo)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(buffSelectInfo);
                bitField0_ |= 0x00000008;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          default: {
            input.skipUnknownField();
            break;
          }
        }
      }
      input.endObject();
      return this;
    }

    @Override
    public SelectRogueBuffScRsp clone() {
      return new SelectRogueBuffScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static SelectRogueBuffScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new SelectRogueBuffScRsp(), data).checkInitialized();
    }

    public static SelectRogueBuffScRsp parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SelectRogueBuffScRsp(), input).checkInitialized();
    }

    public static SelectRogueBuffScRsp parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SelectRogueBuffScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating SelectRogueBuffScRsp messages
     */
    public static MessageFactory<SelectRogueBuffScRsp> getFactory() {
      return SelectRogueBuffScRspFactory.INSTANCE;
    }

    private enum SelectRogueBuffScRspFactory implements MessageFactory<SelectRogueBuffScRsp> {
      INSTANCE;

      @Override
      public SelectRogueBuffScRsp create() {
        return SelectRogueBuffScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName mazeBuffLevel = FieldName.forField("mazeBuffLevel", "maze_buff_level");

      static final FieldName mazeBuffId = FieldName.forField("mazeBuffId", "maze_buff_id");

      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName buffSelectInfo = FieldName.forField("buffSelectInfo", "buff_select_info");
    }
  }
}

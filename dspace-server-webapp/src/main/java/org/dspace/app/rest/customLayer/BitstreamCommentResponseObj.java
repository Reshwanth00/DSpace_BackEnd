package org.dspace.app.rest.customLayer;

import java.util.UUID;

public class BitstreamCommentResponseObj {

    private UUID comment_id;
    private UUID bitstream_id;
    private String content;

    public BitstreamCommentResponseObj(UUID bitstream_id, UUID comment_id, String content) {
        this.comment_id = comment_id;
        this.bitstream_id = bitstream_id;
        this.content = content;
    }

    public UUID getId() {
        return comment_id;
    }

    public UUID getId2() {
        return bitstream_id;
    }

    public String getContent() {
        return content;
    }

    public void setId(UUID comment_id) {
        this.comment_id = comment_id;
    }

    public void setBitstream_id(UUID bitstream_id) {
        this.bitstream_id = bitstream_id;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

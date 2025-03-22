package org.dspace.app.rest.customLayer;

import java.util.UUID;

public class BitstreamCommentRequestObj {
    
    private UUID bitstreamUuid;
    private String content;


    public UUID getBitstreamUuid() {
        return bitstreamUuid;
    }

    public void setBitstreamUuid(UUID bitstreamUuid) {
        this.bitstreamUuid = bitstreamUuid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

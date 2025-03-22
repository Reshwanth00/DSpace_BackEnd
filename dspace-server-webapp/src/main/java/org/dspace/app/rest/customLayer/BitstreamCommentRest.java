package org.dspace.app.rest.customLayer;

import org.dspace.app.rest.model.DSpaceObjectRest;
import org.dspace.app.rest.model.RestAddressableModel;
import com.fasterxml.jackson.annotation.JsonProperty;

public class BitstreamCommentRest extends DSpaceObjectRest  {

    public static final String NAME = "Bitstream_comment";
    public static final String PLURAL_NAME = "Bitstream_comments";
    public static final String CATEGORY = RestAddressableModel.CORE;

    @Override
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    public String getType() {
        return NAME;
    }

    @Override
    public String getTypePlural() {
        return PLURAL_NAME;
    }

    @Override
    public String getCategory() {
        return CATEGORY;
    }

}

package org.dspace.app.rest.customLayer;

import org.dspace.content.Bitstream;
import org.dspace.content.service.DSpaceObjectLegacySupportService;
import org.dspace.content.service.DSpaceObjectService;
import org.dspace.core.Context;

public interface BitstreamCommentService
        extends DSpaceObjectService<BitstreamComment>, DSpaceObjectLegacySupportService<BitstreamComment> {

        long countTotal(Context context);

        public BitstreamComment create(Context context, Bitstream bitstream, BitstreamCommentRequestObj bitstreamCommentRequestObj);

}

package org.dspace.app.rest.repository;
import org.dspace.content.Bitstream;
import org.dspace.core.Context;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.sql.SQLException;
import java.util.UUID;

import org.dspace.app.rest.customLayer.BitstreamComment;
import org.dspace.app.rest.customLayer.BitstreamCommentRequestObj;
import org.dspace.app.rest.customLayer.BitstreamCommentRest;
import org.dspace.app.rest.customLayer.BitstreamCommentService;


@Component(BitstreamCommentRest.CATEGORY + "." + BitstreamCommentRest.PLURAL_NAME)
public class BitstreamCommentRestRepository extends DSpaceObjectRestRepository<BitstreamComment, BitstreamCommentRest> {


    @Autowired
    private BitstreamCommentService bitstreamCommentService;

    public BitstreamCommentRestRepository(BitstreamCommentService dsoService) {
        super(dsoService);
    }



    @Override
    public BitstreamCommentRest findOne(Context context, UUID id) {
        BitstreamComment bitstreamComment = null;
        try {
            bitstreamComment = bitstreamCommentService.find(context, id);
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage(), e);
        }
        if (bitstreamComment == null) {
            return null;
        }
        return converter.toRest(bitstreamComment, utils.obtainProjection());
    }



    @Override
    public Page<BitstreamCommentRest> findAll(Context context, Pageable pageable) {
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }



    @Override
    public Class<BitstreamCommentRest> getDomainClass() {
        throw new UnsupportedOperationException("Unimplemented method 'getDomainClass'");
    }



    public  BitstreamComment create(Context context, Bitstream bitstream ,BitstreamCommentRequestObj bitstreamCommentRequestObj) {
        return bitstreamCommentService.create(context,bitstream,bitstreamCommentRequestObj);
         
    }

    
}

package org.dspace.app.rest.customLayer;

import java.io.IOException;
import java.sql.SQLException;
import java.util.UUID;

import org.dspace.authorize.AuthorizeException;
import org.dspace.content.Bitstream;
import org.dspace.content.DSpaceObjectServiceImpl;
import org.dspace.core.Context;
import org.springframework.stereotype.Service;

@Service
public class BitstreamCommentServiceImpl extends DSpaceObjectServiceImpl<BitstreamComment> implements BitstreamCommentService{


    private final BitstreamCommentDao bitstreamCommentDao;

    // Constructor-based injection
    public BitstreamCommentServiceImpl(BitstreamCommentDao bitstreamCommentDao) {
        this.bitstreamCommentDao = bitstreamCommentDao;
    }

    @Override
    public BitstreamComment find(Context context, UUID uuid) throws SQLException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'find'");
    }

    @Override
    public void updateLastModified(Context context, BitstreamComment dso) throws SQLException, AuthorizeException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateLastModified'");
    }

    @Override
    public void delete(Context context, BitstreamComment dso) throws SQLException, AuthorizeException, IOException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public int getSupportsTypeConstant() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getSupportsTypeConstant'");
    }

    @Override
    public BitstreamComment findByIdOrLegacyId(Context context, String id) throws SQLException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByIdOrLegacyId'");
    }

    @Override
    public BitstreamComment findByLegacyId(Context context, int id) throws SQLException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByLegacyId'");
    }

    @Override
    public long countTotal(Context context) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'countTotal'");
    }

    @Override
    public BitstreamComment create(Context context, Bitstream bitstream,
            BitstreamCommentRequestObj bitstreamCommentRequestObj) {
                BitstreamComment bitstreamComment = new BitstreamComment();
                bitstreamComment.setBitstream(bitstream);
                bitstreamComment.setContent(bitstreamCommentRequestObj.getContent());
                try {
                    bitstreamCommentDao.save(context, bitstreamComment);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                return bitstreamComment;
                
    }
    
}

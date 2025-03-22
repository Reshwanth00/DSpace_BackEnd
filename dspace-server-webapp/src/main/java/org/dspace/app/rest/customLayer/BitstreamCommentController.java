package org.dspace.app.rest.customLayer;
import java.sql.SQLException;

import org.apache.http.HttpStatus;
import org.dspace.app.rest.repository.BitstreamCommentRestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import org.dspace.core.Context;
import org.dspace.app.rest.utils.ContextUtil;
import org.dspace.content.Bitstream;
import org.dspace.content.service.BitstreamService;

@RestController
@RequestMapping("/api/core/bitstream-comment")
public class BitstreamCommentController {

    @Autowired
    public BitstreamCommentRestRepository bitstreamCommentRestRepository;

    @Autowired
    public BitstreamService bitstreamService;

    @PostMapping
    public ResponseEntity<?> create(@Valid @RequestBody BitstreamCommentRequestObj bitstreamCommentRequestObj , HttpServletRequest request) throws SQLException {
        Context context = ContextUtil.obtainContext(request);
        Bitstream bitstream = bitstreamService.find(context, bitstreamCommentRequestObj.getBitstreamUuid());
        BitstreamComment bitstreamComment = bitstreamCommentRestRepository.create(context,bitstream,bitstreamCommentRequestObj);
        BitstreamCommentResponseObj bitstreamResponseObj = new BitstreamCommentResponseObj(bitstreamComment.getBitstream().getID(),bitstreamComment.getID(),bitstreamComment.getContent());

        return ResponseEntity.status(HttpStatus.SC_ACCEPTED)
                            .body(bitstreamResponseObj);
        

    }
}

package org.dspace.app.rest.customLayer;

import java.util.Date;

import org.dspace.content.Bitstream;
import org.dspace.content.CacheableDSpaceObject;
import org.dspace.content.DSpaceObjectLegacySupport;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Column;
import org.dspace.core.Constants;

@Entity
@Table(name = "bitstream_comment")
public class BitstreamComment extends CacheableDSpaceObject implements DSpaceObjectLegacySupport {


    @Column(name = "legacy_id", insertable = false, updatable = false)
    private Integer legacyId;

    @Column(length = 250, unique = true)
    private String name;

    @ManyToOne
    @JoinColumn(name = "bitstream_id", nullable = false)
    private Bitstream bitstream;

    @Column(name = "content", nullable = false, length = 5000)
    private String content;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at", nullable = false, updatable = false)
    private Date createdAt = new Date();

    public Bitstream getBitstream() {
        return bitstream;
    }

    public void setBitstream(Bitstream bitstream) {
        this.bitstream = bitstream;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
    
    @Override
    public Integer getLegacyId() {
        return legacyId;
    }

    @Override
    public int getType() {
        return Constants.BITSTREAM_COMMENT;
    }

    @Override
    public String getName() {
        return name;
    }

}
